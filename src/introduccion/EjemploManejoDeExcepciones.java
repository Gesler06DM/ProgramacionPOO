package introduccion;

public class EjemploManejoDeExcepciones{

    public static void ejemploBasico() {
    	 //En Java, las excepciones sirven para manejar errores sin que el programa se caiga.
        //try para probar código
        //catch para atrapar errores
        //throw para lanzar errores
        //throws  para avisar que un método puede fallar
        //try-catch  manejar errores
        //throw lanzar error manual
        //throws avisar que puede fallar
        //excepciones personalizadas controlar errores propios
        //Package información del sistema
        //Las excepciones no evitan errores, pero evitan que el programa se caiga
        //Siempre valida datos del usuario
        //Usa excepciones personalizadas para que tu código se vea más profesional

        System.out.println("Resumen de Packages y Excepciones en Java");
        System.out.println("try -> para probar codigo");
        System.out.println("catch -> para atrapar errores");
        System.out.println("throw -> para lanzar errores");
        System.out.println("throws -> para avisar que un metodo puede fallar");
        System.out.println("Las excepciones ayudan a que el programa no se caiga.");
        System.out.println("Un package sirve para organizar clases en Java.");
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