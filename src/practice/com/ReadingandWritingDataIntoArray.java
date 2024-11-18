package practice.com;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingandWritingDataIntoArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the values for position "+ i +":");
			a[i]=sc.nextInt();
		}
		System.out.println("printing arrays in elements ");
		System.out.println(Arrays.toString(a));
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
	}

}
