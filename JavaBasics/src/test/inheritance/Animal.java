package test.inheritance;

public class Animal {
	private String nombre;
	
	public Animal() {
		this.sayHello();
	}
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void comer(String cantidadComidaSubjetiva) {
		if (cantidadComidaSubjetiva == "suficiente") {
			System.out.println("Estoy satisfecho");
		} else {
			System.out.println("Me quedé con hambre");
		}

	}
	
	public void qwe(){
		System.out.println("qwe animal");
	}

	protected void sayHello(){
		System.out.println("hola soy un animal");
	}
	
	public void comer(Integer cantidadComida) {
		if (cantidadComida < 10) {
			System.out.println("Me quedé con hambre");
		} else {
			System.out.println("Estoy satisfecho");
		}
	}
}
