package practice.com;

import java.util.Arrays;

public class SortingStringInArrays {

	public static void main(String[] args) {
	  String a[]= {"krishna","kanth","venu","gopal"};
	  System.out.println("before sorting "+Arrays.toString(a));
      Arrays.sort(a);
      System.out.println("after sorting "+Arrays.toString(a));
	}

}
