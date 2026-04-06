package introduccion;
//Enums en Java
//Un enum en Java es un tipoespecial que sirve para representar constantes.
//Es como una Clace pero con Valores Fijos ya definidos
//Se usa cuando sabemos que solo hay siertas opciones posibles


//Enums en Java
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
    //Estos son valores constantes del enum
    //No pueden Cambiar y representan opciones fijas
}

public class EjemploEnums {

    public static void ejemploNueve() {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        //Cada Valor del enum es como un objeto
        //Por eso se accede con Size.Nombre
    }

    public static void ejemploDiez() {
        Test t1 = new Test(Size.MEDIUM);
        //Llamo el metodo que usa swich con el enum
        t1.orderPizza();
    }
}

class Test {
    Size pizzaSize; //Variable tipo enum

    public Test(Size pizzaSize) {
    	//Aqui  guardo el valor que recibe el enum
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza() {
  
        switch (pizzaSize) {
            case SMALL:
            	//Si el valor es small el valor entra por aqui
                System.out.println("I ordered a small size pizza.");
                break;
            case MEDIUM:
            	//Si el valor es medium el valor entra por aqui
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
        }
    }
}