package lecture3;

import java.util.Arrays;

public class Operators
{
	public static void main(String[] args)
	{

//		int[] array1 = {5,17, 350};

//		String [] newArray = new String[3];
//
//		newArray[0] = "a";
//		newArray[1] = "b";
//		newArray[2] = "c";

//		System.out.println("Array: " + newArray);
//		System.out.println(Arrays.toString(newArray));



		String [] array2 = {"Java", "PHP"};

		for(String element : array2)
			System.out.println(element);

		for(int i = 0; i < array2.length; i++)
			System.out.println(array2[i]);

	}
}

