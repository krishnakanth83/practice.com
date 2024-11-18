package practice.com;

public class SingleDimensionalArray {

	public static void main(String[] args) {
	int a[]=new int[2];// we prefer this when we know how many values should be added
	   a[0]=1;
	   a[1]=2;
	   System.out.println(a[1]);
	   for(int  i=0;i<a.length;i++) {
		  System.out.println(" for loop "+a[i]); 
	   }
	   int b[]= {100,200,300,400};// we prefer this when we don't know how many values should be added
	                                // and we can add values in between also.
	   for(int j=0;j<b.length;j++) {
		   System.out.println(" 2nd for loop "+b[j]);
	   }
	}

}
