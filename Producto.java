class Producto{
	//Atributos de la clase producto
	private String nombre;
	private float precio;
	//Variables estaticas
	static int cont;
	//Constructor vacio
	Producto(){
		cont++;
	}

	//Constructor con parametros
	Producto(String nombre, float precio){
		setNombre(nombre);
		setPrecio(precio);
		cont++;
	}

	//Setter para el nombre
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	//Getter para el nombre
	public String getNombre(){
		return nombre;
	}

	//Setter para el precio
	public void setPrecio(float precio){
		this.precio = precio;
	}

	//Getter para el precio
	public float getPrecio(){
		return precio;
	}
	//Getter para el contador de productos
	public static int getCont(){
		return cont;
	}
}