package introduccion;

public class EjemploPasoPorValorporReferencia {

    //Paso por valor
    public static void ejemploPrimitivo() {
        int x = 1;
        int y = 2;

        modify(x, y);

        System.out.println(x);
        System.out.println(y);
    }

    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }

    //Paso por referencia (objetos)
    static class Dog {
        String name;

        Dog(String name) {
            this.name = name;
        }
    }

    public static void ejemploObjeto() {
        Dog dog = new Dog("Max");
        changeName(dog);
        System.out.println(dog.name);
    }

    public static void changeName(Dog d) {
        d.name = "Fifi";
    }
}