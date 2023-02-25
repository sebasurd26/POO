import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
	public static void main(String[] args) {
		
		Persona[] personas = new Persona[5];
		
		personas[0] = new Empleado("Sebastian", 8000, 2000, 10, 2);
		personas[1] = new Empleado("Arnaldos", 1000, 2002, 5, 6);
		personas[2] = new Empleado("Elias", 3500, 2000, 8, 9);
		personas[3] = new Empleado("Angel", 6000, 1998, 8, 2);
		personas[4] = new Empleado("Luis", 1500, 1975, 10, 8);
		
		for(Persona persona: personas) {
			System.out.println(persona.dameNombre() + ", " + persona.dameDescripcion());
		}
	}
}

abstract class Persona{
	private String nombre;
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
}

class Empleado extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	public Empleado(String nom, double sue, int agno, int mes,int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
	}
	
	public String dameDescripcion() {
		return "Este empleado tiene un Id = "+ Id + " con un sueldo = "+sueldo;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public void subSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
}

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}
	
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	
	
}