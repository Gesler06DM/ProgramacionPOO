package introduccion;

import java.util.Arrays;

public class MethodOverloadingandOverriding {

    // La sobrecarga y la sobreescritura son conceptos importantes en Java.
    // Los dos ayudan a aplicar polimorfismo, pero no funcionan de la misma forma.

    // Sobrecarga:
    // Es cuando en la misma clase hay varios metodos con el mismo nombre,
    // pero con diferentes parametros.

    // Sobreescritura:
    // Es cuando una clase hija cambia un metodo que ya existe en la clase padre.
    // Para eso se usa @Override.

    // Segun el documento, la sobrecarga ocurre en tiempo de compilacion
    // y la sobreescritura ocurre en tiempo de ejecucion.

    static class Processor {

        // Este metodo process recibe dos enteros
        public void process(int i, int j) {
            System.out.printf("Processing two integers: %d, %d%n", i, j);
        }

        // Este metodo tiene el mismo nombre, pero recibe un arreglo de enteros
        // Esto es sobrecarga porque cambia el parametro
        public void process(int[] ints) {
            System.out.println("Adding integer array: " + Arrays.toString(ints));
        }

        // Este metodo tambien se llama process, pero recibe un arreglo de objetos
        // Esto tambien es sobrecarga
        public void process(Object[] objs) {
            System.out.println("Adding object array: " + Arrays.toString(objs));
        }
    }

    static class MathProcessor extends Processor {

        // Aqui aplico sobreescritura
        // Estoy cambiando el comportamiento del metodo process(int, int)
        @Override
        public void process(int i, int j) {
            System.out.println("Sum of integers is " + (i + j));
        }

        // Aqui tambien aplico sobreescritura
        // El metodo suma todos los elementos del arreglo
        @Override
        public void process(int[] ints) {
            int sum = 0;

            for (int i : ints) {
                sum += i;
            }

            System.out.println("Sum of integer array elements is " + sum);
        }
    }

    // Ejemplo de herencia del segundo documento
    // Vehicle es la clase padre y Car hereda de Vehicle

    static class Vehicle {
        protected String licensePlate = null;

        public void setLicensePlate(String license) {
            this.licensePlate = license;
        }

        public String getLicensePlate() {
            return licensePlate;
        }
    }

    static class Car extends Vehicle {
        int numberOfSeats = 0;

        public int getNumberOfSeats() {
            return numberOfSeats;
        }
    }

    public static void ejecutar() {

        System.out.println(" SOBRECARGA Y SOBRESCRITURA EN JAVA ");

        // Aqui pruebo sobrecarga
        // Uso la clase Processor porque tiene varios metodos process()
        // con el mismo nombre, pero con diferentes parametros.
        Processor processor = new Processor();

        System.out.println("\n Ejemplo de sobrecarga ");
        processor.process(5, 10);
        processor.process(new int[] {1, 2, 3});
        processor.process(new Object[] {"Java", "POO", "UMG"});

        // Aqui pruebo sobreescritura
        // MathProcessor hereda de Processor y cambia el comportamiento
        // de algunos metodos usando @Override.
        MathProcessor mathProcessor = new MathProcessor();

        System.out.println("\n Ejemplo de sobreescritura ");
        mathProcessor.process(5, 10);
        mathProcessor.process(new int[] {1, 2, 3});

        // Aqui uso polimorfismo
        // Guardo un objeto MathProcessor en una variable tipo Processor.
        Processor p = new MathProcessor();

        System.out.println("\n Ejemplo de polimorfismo ");
        p.process(20, 30);

        // Aqui pruebo herencia con Vehicle y Car
        // Car hereda de Vehicle, por eso puede usar setLicensePlate().
        System.out.println("\n Ejemplo de herencia ");

        Car car = new Car();
        car.setLicensePlate("P123ABC");
        car.numberOfSeats = 4;

        System.out.println("Placa del carro: " + car.getLicensePlate());
        System.out.println("Numero de asientos: " + car.getNumberOfSeats());

        // Aqui tambien se mira polimorfismo con herencia
        // Un Car se puede guardar en una variable Vehicle.
        Vehicle vehicle = car;

        System.out.println("Placa usando referencia Vehicle: " + vehicle.getLicensePlate());
    }

    // Resumen final:
    // Sobrecarga: mismo nombre de metodo, pero diferentes parametros.
    // Sobreescritura: clase hija cambia un metodo de la clase padre.
    // Herencia: una clase reutiliza atributos y metodos de otra.
    // Polimorfismo: una referencia padre puede apuntar a un objeto hijo.
}