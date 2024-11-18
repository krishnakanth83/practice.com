package practice.com;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
		}
		int b[][]= {{10,20},{30,40},{50,60,},{70,80}};
		System.out.println("length of array "+b.length);
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("two dim "+b[i][j]); 
			}
			System.out.println();
		}
		int c[][]= {{60,70},{80,40},{25,50}}; 
        for (int[] arr : c) {
        	for (int  var: arr) {
				System.out.print(var+"   ");
			}
        	System.out.println();
			
		} 

	}

}
