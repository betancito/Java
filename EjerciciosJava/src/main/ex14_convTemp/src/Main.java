import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la app para pasar de °Celcius a °Fahrenheit");
        System.out.println("1 para pasar de °Celcius a °Fahrenheit \n2para pasar de °Fahrenheit a °Celcius" );
        int op = scanner.nextInt();
        float sol = 0;
        switch (op){
            case 1:
                System.out.println("Ingrese los grados que desea pasar a Fahrenheit");
                float grd = scanner.nextFloat();
                sol= (grd*9/5)+32;
                System.out.println("la conversion de grados Celcius de "+ grd+"°\n es igual a: "+ sol+ "° Fahrenheit");
                break;
            case 2:
                System.out.println("Ingrese los grados que desea pasar a Celcius");
                float grd1 = scanner.nextFloat();
                sol= (grd1-32)*5/9;
                System.out.println("la conversion de grados Fahrenheit de "+ grd1 +"°\n es igual a: "+ sol+ "° Celcius");
                break;
        }
    }
}