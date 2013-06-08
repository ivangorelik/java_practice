
public class ArraysAndIterations {

	public static void main (String[] args) {
		Integer[] intArr;
		intArr = new Integer[10];
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;
		intArr[9] = 100;
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		int i = 0;
		while (i < intArr.length) {
			System.out.println(intArr[i]);
			i++;
		}
		
		i = 0;
		do {
			System.out.println(intArr[i]);
			i++;
		} while (i < intArr.length);
	}

}
