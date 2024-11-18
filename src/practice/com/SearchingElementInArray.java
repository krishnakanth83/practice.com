package practice.com;

public class SearchingElementInArray {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50};//linear searching means comparing evry element in array
	boolean status=false;
	/*for(int i=0;i<a.length;i++) {
		System.out.println("values in array "+a[i]);
		if(a[i]==30) {
			System.out.println("element matched");
			status=true;
			break;
		}
	}*/
	for (int i : a) {
		if(i==30) {
			System.out.println("element matched");
			status=true;
			break;
		}
	}
    if(status==false) {
    	System.out.println("element not found");
    }
	}

}
