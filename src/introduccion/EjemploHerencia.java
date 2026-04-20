package introduccion;

public class EjemploHerencia {

    // La herencia en Java sirve para reutilizar codigo.
    // Es cuando una clase puede heredar atributos y metodos de otra clase.

    // La clase que hereda se llama subclase.
    // La clase de la que se hereda se llama superclase.

    // En Java la herencia se usa con la palabra extends.
    // Java solo permite herencia simple, o sea, una clase solo puede heredar de una sola clase.

// EJEMPLO 1: Vehicle y Car

    // Aqui Vehicle es la superclase
    static class Vehicle {
        protected String licensePlate = null;

        public void setLicensePlate(String license) {
            this.licensePlate = license;
        }

        public String getLicensePlate() {
            return licensePlate;
        }
    }

    // Aqui Car es la subclase porque hereda de Vehicle
    static class Car extends Vehicle {
        int numberOfSeats = 0;

        public int getNumberOfSeats() {
            return this.numberOfSeats;
        }

        // Aqui se ve que Car puede usar un atributo heredado de Vehicle
        public String getPlateFromCar() {
            return this.licensePlate;
        }
    }

// EJEMPLO 2: Vehicle y Truck

    // donde Vehicle puede ser clase padre de Car y Truck

    static class Truck extends Vehicle {
        int loadCapacity = 0;

        public int getLoadCapacity() {
            return loadCapacity;
        }
    }

 
 // EJEMPLO 3: Sobrescritura


    // Aqui se explica @Override
    // La subclase puede cambiar el comportamiento de un metodo heredado

    static class VehicleOverride {
        String licensePlate = null;

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }
    }

    static class CarOverride extends VehicleOverride {

        @Override
        public void setLicensePlate(String license) {
            this.licensePlate = license.toLowerCase();
        }
    }

 // EJEMPLO 4: Uso de super

 // Aqui se muestra como llamar un metodo de la superclase con super

    static class VehicleSuper {
        String licensePlate = null;

        public void setLicensePlate(String license) {
            this.licensePlate = license;
        }

        public String getLicensePlate() {
            return licensePlate;
        }
    }

    static class CarSuper extends VehicleSuper {

        @Override
        public void setLicensePlate(String license) {
            super.setLicensePlate(license);
        }
    }

// EJEMPLO 5: Constructores y herencia

    // Los constructores no se heredan
    // Pero la subclase puede llamar al constructor del padre con super()

    static class VehicleConstructor {
        protected String brand;

        public VehicleConstructor(String brand) {
            this.brand = brand;
        }
    }

    static class CarConstructor extends VehicleConstructor {

        public CarConstructor(String brand) {
            super(brand);
        }

        public void showBrand() {
            System.out.println("Marca: " + brand);
        }
    }
// EJEMPLO 6: Animal y Cat

    // Animal es la clase padre y Cat la clase hija

    static class Animal {
        private boolean vegetarian;
        private String eats;
        private int noOfLegs;

        public Animal() {
        }

        public Animal(boolean veg, String food, int legs) {
            this.vegetarian = veg;
            this.eats = food;
            this.noOfLegs = legs;
        }

        public boolean isVegetarian() {
            return vegetarian;
        }

        public void setVegetarian(boolean vegetarian) {
            this.vegetarian = vegetarian;
        }

        public String getEats() {
            return eats;
        }

        public void setEats(String eats) {
            this.eats = eats;
        }

        public int getNoOfLegs() {
            return noOfLegs;
        }

        public void setNoOfLegs(int noOfLegs) {
            this.noOfLegs = noOfLegs;
        }
    }

    static class Cat extends Animal {
        private String color;

        public Cat(boolean veg, String food, int legs) {
            super(veg, food, legs);
            this.color = "White";
        }

        public Cat(boolean veg, String food, int legs, String color) {
            super(veg, food, legs);
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }


 // METODO EJECUTAR

    public static void ejecutar() {

        System.out.println("=== Ejemplo de Herencia ===");

        // Aqui pruebo Vehicle y Car
        Car car = new Car();
        car.setLicensePlate("P123ABC");
        car.numberOfSeats = 4;

        System.out.println("Matricula del carro: " + car.getPlateFromCar());
        System.out.println("Numero de asientos: " + car.getNumberOfSeats());

        System.out.println();

        // Aqui pruebo polimorfismo o conversion ascendente
        // Un objeto Car se puede guardar en una variable Vehicle
        Vehicle vehicle = car;
        System.out.println("Matricula desde variable Vehicle: " + vehicle.getLicensePlate());

        System.out.println();

        // Aqui pruebo Truck
        Truck truck = new Truck();
        truck.setLicensePlate("C456DEF");
        truck.loadCapacity = 5000;

        System.out.println("Matricula del camion: " + truck.getLicensePlate());
        System.out.println("Capacidad de carga: " + truck.getLoadCapacity());

        System.out.println();

        // Aqui pruebo sobrescritura con @Override
        CarOverride car2 = new CarOverride();
        car2.setLicensePlate("P789XYZ");
        System.out.println("Matricula sobrescrita en minusculas: " + car2.licensePlate);

        System.out.println();

        // Aqui pruebo super()
        CarConstructor car3 = new CarConstructor("Toyota");
        car3.showBrand();

        System.out.println();

        // Aqui pruebo Animal y Cat
        Cat cat = new Cat(false, "milk", 4, "black");
        System.out.println("Cat is Vegetarian? " + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
        
    }
 // El polimorfismo es cuando un objeto puede tomar varias formas.
    // En este caso, un objeto de una clase hija se puede guardar en una variable de la clase padre.

    Cat c = new Cat(false, "milk", 4, "black");

    // Aqui estoy guardando un objeto Cat en una variable tipo Animal
    Animal a = c;
    // Esto es polimorfismo porque Cat tambien es un Animal
    
    // El polimorfismo permite que un objeto de una subclase
    // sea tratado como un objeto de la superclase.
    // Esto se logra mediante la herencia y la conversion de tipos.
    
    // En resumen, la herencia permite reutilizar codigo.
    // Tambien permite crear una relacion entre clases padre e hijas.
    // Se usa extends para heredar.
    // Se usa @Override para sobrescribir metodos.
    // Se usa super para llamar al constructor o metodos de la superclase.
}