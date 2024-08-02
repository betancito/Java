package com.avianca.controllers;

import com.avianca.entities.avion;
import com.avianca.models.avionModel;
import com.avianca.persistence.iModel.iAvion;

public class avionController {
    public static avion create(avion request){
        iAvion avion = new avionModel();
        return avion.create(request);
    }
    public static int delete(int id){
        iAvion avion = new avionModel();
        return avion.delete(id);
    }

    public static avion update(avion request){
        iAvion avion = new avionModel();
        return avion.update(request);
    }

    public static avion readById(int id){
        iAvion avion = new avionModel();
        return avion.readByid(id);
    }
}
