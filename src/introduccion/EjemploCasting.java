package introduccion;

public class EjemploCasting {

    //EJEMPLO 1 DE FUNCION DE TIPOS
    public static void ejemploUno() {
        int num = 50;
        System.out.println("The integer value: " + num);

        double data = num;
        System.out.println("The double value: " + data);
    }

    //EJEMPLO 2
    public static void ejemploDos() {
        double num = 50.55;
        System.out.println("El valor double: " + num);

        int data = (int) num;
        System.out.println("El valor entero: " + data);
    }

    //EJEMPLO 3
    public static void ejemploTres() {
        int num = 50;
        System.out.println("El valor entero es: " + num);

        String data = String.valueOf(num);
        System.out.println("El valor de la cadena es: " + data);
    }

    //EJEMPLO 4
    public static void ejemploCuatro() {
        String data = "50";
        System.out.println("El valor de la cadena es: " + data);

        int num = Integer.parseInt(data);
        System.out.println("El valor entero es: " + num);
    }

    //EJEMPLO 5
    public static void ejemploCinco() {
        int num = 10;
        System.out.println("The integer value: " + num);

        double data = num;
        System.out.println("The double value: " + data);
    }

    //EJEMPLO 6
    public static void ejemploSeis() {
        double num = 10.99;
        System.out.println("The double value: " + num);

        int data = (int) num;
        System.out.println("The integer value: " + data);
    }

    //EJEMPLO 7
    public static void ejemploSiete() {
        int num = 10;
        System.out.println("The integer value is: " + num);

        String data = String.valueOf(num);
        System.out.println("The string value is: " + data);
    }

    //EJEMPLO 8
    public static void ejemploOcho() {
        String data = "10";
        System.out.println("The string value is: " + data);

        int num = Integer.parseInt(data);
        System.out.println("The integer value is: " + num);
    }
}