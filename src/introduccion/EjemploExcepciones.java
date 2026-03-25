package introduccion;

public class EjemploExcepciones {

    public static void ejemploBasico() {
        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cant divide a number by zero");
        }
    }

    public static void ejemploNumberFormat() {
        try {
            int num = Integer.parseInt("Edureka");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir texto a número");
        }
    }
}
