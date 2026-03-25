package introduccion;

//Enums en Java
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

public class EjemploEnums {

    public static void ejemploNueve() {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
    }

    public static void ejemploDiez() {
        Test t1 = new Test(Size.MEDIUM);
        t1.orderPizza();
    }
}

class Test {
    Size pizzaSize;

    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza() {
        switch (pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small size pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
        }
    }
}