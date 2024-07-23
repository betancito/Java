public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        System.out.println(empleado);
        empleado.setNombre("Juan");
        empleado.setEdad(25);
        empleado.setId(2);
        empleado.setSalario(2500);
        System.out.println(empleado);
    }
}