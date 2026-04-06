package introduccion;

public class EjemploAccesSpesifiers {
	
	public static void AccesSpesifiers() {
		
		// Son palabras clave en Java que controlan quién puede usar una clase, método o variable
	    // Sirven para proteger información y organizar mejor el código
		// Existen 4 modificadores de acceso diferentes los cuales son:
		// Private (privado), default package (Predeterminado paquete), protected (protegido), public (Publico).
	
		System.out.println("Ejemplo Modificador Privado");
		// private significa que SOLO se puede usar dentro de la misma clase
	    // No se puede acceder desde otras clases ni herencia
	    // Ventaja:
	    // Protege los datos para que nadie los modifique directamente
		modificadorPrivado();

		System.out.println("");
		System.out.println("Modificador de Acceso por Default o paquete, predeterminado.");
		// El modificador default o package ocurre cuando no se escribe ninguna palabra
		// Esto significa que la clase, variable, método o constructor
		// solo puede usarse dentro del mismo paquete
		System.out.println("Ejemplo");
		System.out.println("public class Clock {");
		System.out.println("    long time = 0;");
		System.out.println("}");

		System.out.println("public class ClockReader {");
		System.out.println("    Clock clock = new Clock();");
		System.out.println("    public long readClock(){");
        System.out.println("        return clock.time;");
        System.out.println("    }");
        System.out.println("}");
        
        System.out.println("");
        System.out.println("Modificador de Acceso de tipo Protegido");
        // protected permite usar variables en clases hijas (herencia)
        // En este caso:
        // SmartClock hereda de Clock
        // Por eso puede usar la variable "time"
        // Aunque estén en diferentes clases, sí funciona
        // porque protected permite acceso en herencia
        modificadorAccesoProtegido();
        
        System.out.println("");
        System.out.println("Modificador de Acceso Publico");
        ModificadorPublic();
	}

	public static void modificadorPrivado() {
		System.out.println("public class Clock {");
		System.out.println("    private long time = 0;");
		System.out.println("");
		System.out.println("    private Clock(long time) {");
		System.out.println("        this.time = time;");
		System.out.println("    }");
		System.out.println("");
		System.out.println("    public Clock(long time, long timeOffset) {");
		System.out.println("        this(time);");
		System.out.println("        this.time += timeOffset;");
		System.out.println("    }");
		System.out.println("");
		System.out.println("    public static Clock newClock() {");
		System.out.println("        return new Clock(System.currentTimeMillis());");
		System.out.println("    }");
		System.out.println("}");
	}

	public static void modificadorAccesoProtegido() {
		System.out.println("public class Clock {");
		System.out.println("    protected long time = 0;");
		System.out.println("}");
		System.out.println("");
		System.out.println("public class SmartClock extends Clock {");
		System.out.println("    public long getTimeInSeconds() {");
		System.out.println("        return this.time / 1000;");
		System.out.println("    }");
		System.out.println("}");
	}
 
	public static void ModificadorPublic() {

	    // public significa que se puede acceder desde cualquier lugar
	    // No importa si está en otra clase o en otro paquete

	    // Ejemplo de clase con variable pública
	    class Clock {
	        public long time = 0; // Puede ser accedida desde cualquier clase
	    }

	    // Otra clase que usa Clock
	    class ClockReader {
	        Clock clock = new Clock(); // Creamos objeto de Clock

	        public long readClock() {
	            // Accedemos directamente a "time"
	            // Esto funciona porque es public
	            return clock.time;
	        }
	    }

	    // Probando el ejemplo
	    ClockReader reader = new ClockReader();

	    // Mostramos el valor
	    System.out.println("Tiempo: " + reader.readClock());

	    // Esto demuestra que public permite acceso total sin restricciones

	    // MODIFICADORES EN CLASES
	    // El modificador de la clase es el más importante
	    // Tiene prioridad sobre métodos y atributos

	    // Si una clase es default:
	    // Solo se puede usar dentro del mismo paquete
	    // Aunque tenga métodos public, no se pueden usar fuera

	    // Las clases solo pueden ser:
	    // public  acceso desde cualquier lugar
	    // default  solo dentro del paquete
	    // No pueden ser:
	    // private 
	    // protected 

	    // MODIFICADORES EN INTERFACES
	    // En interfaces todo es public automáticamente
	    // No se puede usar:
	    // private 
	    // protected 
	    // default 

	    // Aunque no se escriba nada,
	    // Java lo toma como public

	    // MODIFICADORES Y HERENCIA
	    // En herencia NO se puede reducir el acceso
	    // Ejemplo:
	    // Si un método es public en la clase padre
	    // Debe seguir siendo public en la clase hija
	    // Si es protected en la clase padre
	    // Puede ser protected o public en la hija

	    // Lo que sí se puede:
	    // Aumentar el acceso (default public)
	    // Lo que no se puede:
	    // Disminuir el acceso (public  private )

	    // RESUMEN GENERAL
	    // Clases solo public o default
	    // Interfaces todo es public
	    // Herencia  no reducir acceso, solo mantener o aumentar
	}
}