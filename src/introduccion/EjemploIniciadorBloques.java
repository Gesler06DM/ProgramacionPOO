package introduccion;

//Bloque estático
public class EjemploIniciadorBloques {

    static {
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
    }

    public static void ejecutar() {
        System.out.println("Main Method");
    }
}