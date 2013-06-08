package test.inheritance;

public class Main {

	public static void main(String[] args) {
		Perro p1 = new Perro("Tango");
		//p1.setNombre("Tango");
		p1.ladrar();
		p1.comer(3);
		p1.comer("suficiente");
		
		/*
		Perro p3 = new Perro();
		p3.setNombre("Milonga");
		 */

		Gato g1 = new Gato();
		g1.setNombre("Petite");
		g1.maullar();
		g1.comer(99);
		
		Animal a1 = p1;
		Animal a2 = new Perro();
		a2.qwe();

		//Gato g2 = new Perro(); //NO
		
		//Casting, casteo 
		Perro p4 = (Perro) a2;
		
		Object[] objArr = new Object[10];
		objArr[0] = p4;
		objArr[0] = g1;
		
	}

}
