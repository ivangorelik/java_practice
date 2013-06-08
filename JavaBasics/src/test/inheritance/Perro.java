package test.inheritance;

public class Perro extends Animal {
	
	public Perro(){
		System.out.println("nacio un perrito!");
	}
	
//	public Perro(String nombre){
//		System.out.println("nacio un perrito!");
//		this.setNombre(nombre);
//	}
	
	public void sayHello(){
		super.sayHello();
	}
	
	public void qwe(){
		System.out.println("qwe perro");
	}
	
	public Perro(String nombre){
		super(nombre);
		System.out.println("nacio un perrito!");
	}
	
	public void ladrar () {
		System.out.println("Guau!");
	}
}
