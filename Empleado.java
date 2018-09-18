public class Empleado{
	//Atributos de la clase Empleado
	private String puesto;
	private String nombre;
	private float sueldo;
	//Variables  estaticas
	static int cont;

	//Contructor
	public void Empleado(){
		cont++;
	}
	//Constructor con parametros
	public void Empleado(String nombre, float sueldo, String puesto){
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.puesto = puesto;
		cont++;
	}
	