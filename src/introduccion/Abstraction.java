package introduccion;

// Las clases abstractas sirven como base para otras clases.
// No se pueden crear objetos directamente de una clase abstracta.

// Las interfaces ayudan a separar la implementacion del comportamiento.
// Una interfaz solo define los metodos que una clase debe tener.

public class Abstraction {

    // INTERFAZ

    // Una interfaz define comportamiento
    // Las clases que implementan esta interfaz
    // estan obligadas a usar este metodo.

    interface URLProcessor {

        void process(String url);
    }

    // CLASE ABSTRACTA

    // Esta clase abstracta implementa la interfaz.
    // No se puede crear con new.

    abstract static class URLProcessorBase implements URLProcessor {

        // Metodo normal
        // Ya tiene implementacion
        @Override
        public void process(String url) {

            System.out.println("Abriendo conexion con: " + url);

            // Aqui llamo al metodo abstracto
            processURLData();

            System.out.println("Cerrando conexion...");
        }

        // Metodo abstracto
        // No tiene implementacion
        // La clase hija debe implementarlo
        protected abstract void processURLData();
    }

    // CLASE HIJA

    // Esta clase hereda de URLProcessorBase
    // y sobrescribe el metodo abstracto.

    static class URLProcessorImpl extends URLProcessorBase {

        @Override
        protected void processURLData() {

            System.out.println("Procesando datos de la URL...");
        }
    }

    // EJEMPLO SIMPLE DE CLASE ABSTRACTA

    // Esta clase abstracta tiene un metodo abstracto.
    // Las clases hijas deben implementarlo.

    abstract static class Animal {

        // Metodo abstracto
        public abstract void hacerSonido();

        // Metodo normal
        public void dormir() {
            System.out.println("El animal esta durmiendo");
        }
    }

    // Clase hija
    static class Perro extends Animal {

        // Aqui sobrescribo el metodo abstracto
        @Override
        public void hacerSonido() {
            System.out.println("El perro ladra");
        }
    }

    // METODO EJECUTAR

    public static void ejecutar() {

        System.out.println("=== INTERFACES Y CLASES ABSTRACTAS ===");

        // Aqui uso polimorfismo
        // La referencia es tipo interfaz
        // pero el objeto real es URLProcessorImpl

        URLProcessor processor = new URLProcessorImpl();

        processor.process("http://google.com");


        System.out.println("\nCLASE ABSTRACTA");

        // No se puede hacer:
        // Animal a = new Animal();

        // Pero si se puede crear un objeto de la clase hija
        Animal perro = new Perro();

        perro.hacerSonido();
        perro.dormir();

        System.out.println("\n=== RESUMEN ===");

        System.out.println("Las interfaces definen comportamiento.");
        System.out.println("Las clases abstractas sirven como base para herencia.");
        System.out.println("Los metodos abstractos deben implementarse.");
        System.out.println("La herencia reutiliza codigo.");
        System.out.println("El polimorfismo permite usar referencias padre.");
    }

    // RESUMEN FINAL

    // Interface:
    // Define QUE debe hacer una clase.

    // Clase abstracta:
    // Sirve como base para otras clases.

    // Metodo abstracto:
    // No tiene implementacion.

    // Herencia:
    // Una clase hija reutiliza codigo de la clase padre.

    // @Override:
    // Sirve para sobrescribir un metodo heredado.

    // Polimorfismo:
    // Una referencia padre puede apuntar a un objeto hijo.
}