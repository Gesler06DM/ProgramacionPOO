package introduccion;

public class Encapsulacion {


	    public static void ejecutar()
	    {
	        // -------- EJEMPLO 1 PERSONA --------
	        Persona per1 = new Persona();
	        per1.setName("Robert");
	        per1.setAge(21);

	        // muestro los datos de la persona usando getters
	        System.out.println("Nombre: " + per1.getName());
	        System.out.println("Edad: " + per1.getAge());


	        // -------- EJEMPLO 2 EMPLEADO --------
	        Employee emp = new Employee("Robert","EMP001",75450);

	        // imprimo los datos del empleado
	        System.out.println("Empleado:");
	        System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());

	        // modifico los datos usando setters
	        emp.setEmpName("Riyan");
	        emp.setEmpId("EMP002");
	        emp.setSalary(90500);

	        // muestro los datos actualizados
	        System.out.println("Empleado actualizado:");
	        System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());

	    }
	}


	// clase Persona usando encapsulación
	class Persona {

	    private String name; // atributo privado para proteger el dato
	    private int age;     // atributo privado edad

	    // método para asignar el nombre
	    public void setName(String name){
	        this.name = name; // guardo el nombre que recibe el método
	    }

	    // método para asignar la edad
	    public void setAge(int age){
	        this.age = age; // guardo la edad
	    }

	    // getter para obtener el nombre
	    public String getName(){
	        return name; // retorno el nombre
	    }

	    // getter para obtener la edad
	    public int getAge(){
	        return age; // retorno la edad
	    }

	}


	// clase Employee usando encapsulación
	class Employee {

	    private String emp_name;   // nombre del empleado
	    private String emp_id;     // id del empleado
	    private double net_salary; // salario del empleado

	    // constructor para inicializar los datos
	    public Employee(String emp_name, String emp_id, double net_salary){
	        this.emp_name = emp_name;
	        this.emp_id = emp_id;
	        this.net_salary = net_salary;
	    }

	    // getters para obtener los valores
	    public String getEmpName(){
	        return emp_name;
	    }

	    public String getEmpId(){
	        return emp_id;
	    }

	    public double getSalary(){
	        return net_salary;
	    }

	    // setters para modificar los valores
	    public void setEmpName(String emp_name){
	        this.emp_name = emp_name;
	    }

	    public void setEmpId(String emp_id){
	        this.emp_id = emp_id;
	    }

	    public void setSalary(double net_salary){
	        this.net_salary = net_salary;
	    }

	}
