
public class ABC {

	public static void main(String[] args) {

		ABC array[] = new ABC[5];// ABC array[]- array variable of ABC type,new keyword create the array i.e
									// memory initialization
		array[0] = new ABC();
		array[1] = new ABC();
		array[2] = new ABC();
		array[3] = new ABC();
		array[4] = new ABC();

		for (int i = 0; i <array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
