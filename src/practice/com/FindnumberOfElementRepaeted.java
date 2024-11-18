package practice.com;

import java.util.Arrays;

public class FindnumberOfElementRepaeted {

	public static void main(String[] args) {
		int b=0;
		int a[]= {10,20,10,30,20,40};
		System.out.println("printing the variables present in array using array class "+Arrays.toString(a));
		// just for printing purpose we use Arrarys.toString(a);
		for (int i : a) {
			if(i==10) {
				b++;
			}
			
		}
		
		System.out.println(" number repeated "+b+++" times");

	}

}
