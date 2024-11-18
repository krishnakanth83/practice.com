package practice.com;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		int a[]= {500,100,300,200,600,800};
		System.out.println("before sorting "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting "+Arrays.toString(a));
	}

}
