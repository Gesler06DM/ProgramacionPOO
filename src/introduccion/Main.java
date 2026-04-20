package introduccion;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduccion a la PROGRAMACION ORIENTADA A OBJETOS");
        System.out.println("1) Conversion de Enteros a DOUBLE");
        System.out.println("2) Convertir un numero double a un numero int");
        System.out.println("3) Convertir de entero a cadena de caracteres");
        System.out.println("4) Convertir cadena a entero");
        System.out.println("5) Convertir un numero entero a Decimal");
        System.out.println("6) Convertir double a int");
        System.out.println("7) int a String ejemplo 1");
        System.out.println("8) int a String ejemplo 2");
        System.out.println("9) Enum simple");
        System.out.println("10) Enum con switch");
        System.out.println("11) Resumen de Packages");
        System.out.println("12) Bloques estaticos");
        System.out.println("13) Paso por valor");
        System.out.println("14) Paso por referencia");
        System.out.println("15) Excepcion basica");
        System.out.println("16) Excepcion NumberFormat");
        System.out.println("17) Ejemplos de Encapsulacion");
        System.out.println("18) Ejemplo Aceess Spesifiers (Especificadores de acceso)");
        System.out.println("19) Modificador de acceso protegido");
        System.out.println("20) Ejemplo de Herencia");
        System.out.println("0) Salir");

        int numero0 = sc.nextInt();

        switch (numero0) {
            case 1:
                EjemploCasting.ejemploUno();
                break;

            case 2:
                EjemploCasting.ejemploDos();
                break;

            case 3:
                EjemploCasting.ejemploTres();
                break;

            case 4:
                EjemploCasting.ejemploCuatro();
                break;

            case 5:
                EjemploCasting.ejemploCinco();
                break;

            case 6:
                EjemploCasting.ejemploSeis();
                break;

            case 7:
                EjemploCasting.ejemploSiete();
                break;

            case 8:
                EjemploCasting.ejemploOcho();
                break;

            case 9:
                EjemploEnums.ejemploNueve();
                break;

            case 10:
                EjemploEnums.ejemploDiez();
                break;

            case 11:
                jemploPaquetes.mostrarResumen();
                break;

            case 12:
                EjemploIniciadorBloques.ejecutar();
                break;

            case 13:
                EjemploPasoPorValorporReferencia.ejecutar();
                break;

            case 14:
                EjemploPasoPorValorporReferencia.ejecutar();
                break;

            case 15:
                EjemploManejoDeExcepciones.ejemploBasico();
                break;

            case 16:
                EjemploManejoDeExcepciones.ejemploNumberFormat();
                break;

            case 17:
                Encapsulacion.ejecutar();
                break;

            case 18:
                EjemploAccesSpesifiers.AccesSpesifiers();
                break;

            case 19:
                EjemploAccesSpesifiers.modificadorAccesoProtegido();
                break;

            case 20:
                EjemploHerencia.ejecutar();
                break;

            case 0:
                System.out.println("Salida del programa. Adios.");
                break;

            default:
                System.out.println("Error: opcion incorrecta.");
                break;
        }
    }
}