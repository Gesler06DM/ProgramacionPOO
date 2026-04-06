package introduccion;

public class EjemploPasoPorValorporReferencia {

    // Paso por valor
    public static void ejemploPrimitivo() {

        // En Java el paso por valor significa que se envía una copia del dato
        // Los cambios dentro del método NO afectan la variable original

        int x = 1;
        int y = 2;

        System.out.println("Antes de modificar:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        modify(x, y); // Se envían copias

        System.out.println("Despues de modificar:");
        System.out.println("x = " + x); // Sigue igual
        System.out.println("y = " + y); // Sigue igual

        // Esto pasa porque Java trabaja con copias en tipos primitivos :contentReference[oaicite:0]{index=0}
    }

    public static void modify(int x1, int y1) {

        // Aquí solo se modifican las copias, no las originales
        x1 = 5;
        y1 = 10;
    }

    // Paso por referencia (objetos)
    static class Dog {
        String name;

        Dog(String name) {
            this.name = name;
        }
    }

    public static void ejemploObjeto() {

        // En objetos se pasa una copia de la referencia
        // Pero ambas apuntan al mismo objeto

        Dog dog = new Dog("Max");

        System.out.println("Antes de cambiar:");
        System.out.println(dog.name);

        changeName(dog); // Se pasa la referencia (copia)

        System.out.println("Despues de cambiar:");
        System.out.println(dog.name);

        // Aquí sí cambia porque modificamos el objeto original :contentReference[oaicite:1]{index=1}
    }

    public static void changeName(Dog d) {

        // Se modifica el objeto al que apunta la referencia
        d.name = "Fifi";
    }

    // MÉTODO GENERAL 
    public static void ejecutar() {

        System.out.println("PASO POR VALOR (PRIMITIVOS)");
        ejemploPrimitivo();

        System.out.println("");
        System.out.println("PASO POR REFERENCIA (OBJETOS)");
        ejemploObjeto();

        System.out.println("");
        System.out.println("Resumen:");

        // Java siempre trabaja por valor
        // En primitivos copia del valor
        // En objetos  copia de la referencia
        // Por eso los objetos sí pueden cambiar

        System.out.println("Java siempre pasa por valor.");
        System.out.println("Primitivos no cambian.");
        System.out.println("Objetos si pueden cambiar.");

    }
}