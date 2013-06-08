package test.inheritance;

public class Gato extends Animal {
	public void maullar () {
		System.out.println("Miau!");
	}
	
	//override
	public void comer(Integer cant){
		System.out.println("Los gatos siemore tenemos mas hambre");
	}
	
	//overload
	public void comer(Integer cant, String tipo){
		System.out.println("sarasa");
	}
	

	public Integer sumar(Integer a, Integer b){
		return a + b; 
	}

	public Integer sumar(Integer a, Integer b, Integer c){
		return a + b + c; 
	}

	public Integer sumar(Integer[] nums){
		Integer sum = 0;
		for (int i = 0; i < nums.length; i++) {
			//sum = sum + nums[i];
			sum += nums[i];
		}
		return sum; 
	}
	
}
