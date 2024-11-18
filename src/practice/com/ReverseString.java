package practice.com;

public class ReverseString {

	public static void main(String[] args) {// approuch one using length() and charAt()
		String k="krishna";
		String rev="";
		for(int i=k.length()-1;i>=0;i--) {
			rev=rev+k.charAt(i);
		}
		System.out.println(rev);
	
	//approuch 2
	//without using string method.by converting string to char array type
	String n="kanth";
	String r="";
	char[] arr=n.toCharArray();
	for(int i=arr.length-1;i>=0;i--) {
		r=r+arr[i];
	}
	System.out.println("without using string methods "+r);
	
	//using stringbuffer reverse the string
	StringBuffer v=new StringBuffer("venu");
	System.out.println(v.reverse());
	
	//using stringbuilder reverse the string
		StringBuilder kk=new StringBuilder("krishnakanth");
		System.out.println(kk.reverse());
}	
}
