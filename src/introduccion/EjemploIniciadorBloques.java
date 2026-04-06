package introduccion;

// Bloque estático
public class EjemploIniciadorBloques {

    static {
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
    }

    public static void ejecutar() {
        System.out.println("Main Method");
        System.out.println("");
        System.out.println("Resumen de bloques de inicializacion en Java");
        System.out.println("En Java existen bloques de inicializacion estaticos y de instancia.");
        System.out.println("El bloque estatico se ejecuta una sola vez cuando la clase se carga en memoria.");
        System.out.println("El bloque de instancia se ejecuta cada vez que se crea un objeto.");
        System.out.println("Los bloques estaticos van antes del main y antes de crear objetos.");
        System.out.println("Los bloques de instancia van antes del constructor."); // basado en la explicación general 
        System.out.println("");

        System.out.println("Ejemplo 1: referencias adelantadas no estaticas");
        System.out.println("public class NonStaticForwardReferences {");
        System.out.println("   {");
        System.out.println("      nsf1 = 10;");
        System.out.println("      nsf1 = sf1;");
        System.out.println("      var b = nsf1 = 20;");
        System.out.println("      int c = this.nsf1;");
        System.out.println("   }");
        System.out.println("");
        System.out.println("   int nsf1 = nsf2 = 30;");
        System.out.println("   int nsf2;");
        System.out.println("   static int sf1 = 5;");
        System.out.println("");
        System.out.println("   {");
        System.out.println("      int d = 2 * nsf1;");
        System.out.println("      var e = nsf1 = 50;");
        System.out.println("   }");
        System.out.println("");
        System.out.println("   public static void main(String[] args) {");
        System.out.println("      NonStaticForwardReferences objRef = new NonStaticForwardReferences();");
        System.out.println("      System.out.println(\"nsf1: \" + objRef.nsf1);");
        System.out.println("      System.out.println(\"nsf2: \" + objRef.nsf2);");
        System.out.println("   }");
        System.out.println("}");
        System.out.println("");
        System.out.println("Explicacion:");
        System.out.println("Este ejemplo muestra que en los bloques de instancia si se puede asignar valor a campos antes de declararlos.");
        System.out.println("Pero no se pueden leer por nombre simple antes de declararlos.");
        System.out.println("Si se usa this, si se puede acceder al campo.");
        System.out.println("El resultado final de este ejemplo seria:");
        System.out.println("nsf1: 50");
        System.out.println("nsf2: 30"); // coincide con el ejemplo del material :contentReference[oaicite:1]{index=1}
        System.out.println("");

        System.out.println("Ejemplo 2: bloque de instancia en clase anonima");
        System.out.println("class Base {");
        System.out.println("   protected int a;");
        System.out.println("   protected int b;");
        System.out.println("   void print() { System.out.println(\"a: \" + a); }");
        System.out.println("}");
        System.out.println("");
        System.out.println("class AnonymousClassMaker {");
        System.out.println("   Base createAnonymous() {");
        System.out.println("      return new Base() {");
        System.out.println("         {");
        System.out.println("            a = 5; b = 10;");
        System.out.println("         }");
        System.out.println("");
        System.out.println("         @Override");
        System.out.println("         void print() {");
        System.out.println("            super.print();");
        System.out.println("            System.out.println(\"b: \" + b);");
        System.out.println("         }");
        System.out.println("      };");
        System.out.println("   }");
        System.out.println("}");
        System.out.println("");
        System.out.println("public class InstanceInitBlock {");
        System.out.println("   public static void main(String[] args) {");
        System.out.println("      new AnonymousClassMaker().createAnonymous().print();");
        System.out.println("   }");
        System.out.println("}");
        System.out.println("");
        System.out.println("Explicacion:");
        System.out.println("Este ejemplo muestra que una clase anonima no puede tener constructor propio.");
        System.out.println("Por eso se usa un bloque de instancia para inicializar sus atributos.");
        System.out.println("En este caso a vale 5 y b vale 10.");
        System.out.println("La salida seria:");
        System.out.println("a: 5");
        System.out.println("b: 10"); // coincide con el material del ejemplo de clase anónima :contentReference[oaicite:2]{index=2}
        System.out.println("");

        System.out.println("Resumen final:");
        System.out.println("El bloque estatico se ejecuta una sola vez al cargar la clase.");
        System.out.println("El bloque de instancia se ejecuta cada vez que se crea un objeto.");
        System.out.println("Los bloques de instancia sirven para inicializar datos comunes.");
        System.out.println("Tambien son utiles en clases anonimas.");
    }
}