import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicacion para caalogar su calificación entre A, B, C, D o F");
        System.out.println("A continuación ingrese el vlor de la calificación para categorizarla");
        int cal = scanner.nextInt();
        String calif = "";
        if (cal<100&&cal>=90){
            calif = "A";
        }else if (cal<90&&cal>=80){
            calif = "B";
        } else if (cal<80&&cal>=70) {
            calif = "C";
        } else if (cal<70&&cal>=60) {
            calif = "D";
        } else if (cal<60&&cal>=0) {
            calif = "F";
        } else{
            calif="invalida";
            System.out.println("Calificación invalida");
        }
        System.out.println("Su calificación de: "+cal+" fue asignada a la letra: "+calif);
    }
}