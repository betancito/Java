package com.avianca.models;

import com.avianca.entities.avion;
import com.avianca.persistence.configDB.MysqlConfig;
import com.avianca.persistence.iModel.iAvion;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class avionModel implements iAvion {
    @Override
    public avion create(avion request) {
        //abrir conexion
        Connection connection = MysqlConfig.openConnection();

        //settear query
        String sqlQuery = "insert into avion(modelo, capacidad) values(?,?);";

        //instanciar avion para guardar info
        avion avion = new avion();

        //preparar query para mandarla a la db
        try {
            //preparar query para reemplazar ? valores
            PreparedStatement ps = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            //settear variables
            ps.setString(1, request.getModelo());
            ps.setInt(2,request.getCapacidad());

            //ejecutar
            ps.execute();

            //obtener resultado
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                avion.setId(rs.getInt(1));
            }
            //cerrar query
            ps.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //cerrar conexion a db
            MysqlConfig.closeConnection();
        }
        return avion;
    }

    @Override
    public int delete(int id) {
        //abrir conexion
        Connection connection = MysqlConfig.openConnection();

        //settear query
        String sqlQuery = "delete from avion where id = ?;";

        //preparar query para mandarla a la db
        try {
            //preparar query para reemplazar ? valores
            PreparedStatement ps = connection.prepareStatement(sqlQuery);

            //settear variables
            ps.setInt(1, id);

            //Almacenar booleano y ejecutar
            int rs = ps.executeUpdate();

            //ciclo para checkear resultado
            if (rs==1) {
                return id;
            }
            //cerrar query
            ps.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //cerrar conexion a db
            MysqlConfig.closeConnection();
        }
        return id;
    }

    @Override
    public avion readByid(int id) {
        //Abrir conexion con db
        Connection connection = MysqlConfig.openConnection();

        //settear query para actualizar
        String sqlQuery = "SELECT * FROM avion WHERE id = ?;";

        //inicializar variable para guardar avion a buscar por id
        avion avion = new avion();

        //preparar query para mandarla al db
        try {
            //preparar query para remplazar '?' valores
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            //setear variables
            preparedStatement.setInt(1, id);

            //Ejecutar para recoger booleano de actualización
            ResultSet rs = preparedStatement.executeQuery();

            //while para checkear booleano
            while (rs.next()) {
                avion.setId(rs.getInt(1));
                avion.setModelo(rs.getString(2));
                avion.setCapacidad(rs.getInt(3));
            }
            preparedStatement.close();
        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        } finally {
            //finalmente cerrar conexión
            MysqlConfig.closeConnection();
        }
        return avion;
    }

    @Override
    public avion update(avion request) {
        //Abrir conexion con db
        Connection connection = MysqlConfig.openConnection();

        //settear query para actualizar
        String sqlQuery = "UPDATE avion SET modelo = ?, capacidad = ? WHERE id = ?;";


        //preparar query para mandarla al db
        try {
            //preparar query para remplazar '?' valores
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            //setear variables
            preparedStatement.setString(1, request.getModelo());
            preparedStatement.setInt(2, request.getCapacidad());
            preparedStatement.setInt(3,request.getId());

            //Ejecutar para recoger booleano de actualización
            int rs = preparedStatement.executeUpdate();

            //while para checkear booleano
            if (rs==1) {
                return request;
            }
            preparedStatement.close();
        } catch (SQLException error) {
            throw new RuntimeException(error.getMessage());
        } finally {
            //finalmente cerrar conexión
            MysqlConfig.closeConnection();
        }
        return request;
    }
}
