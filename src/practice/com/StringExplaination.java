package practice.com;

import java.util.Arrays;

public class StringExplaination {

	public static void main(String[] args) {
		String k="   krishna   ";
        String s=new String("kanth");
        String n="krishnakanths";
        System.out.println("using concat method "+k.concat(s));
        System.out.println("using two concat method "+k.concat(s).concat(n));
        System.out.println("After triming "+k.trim().length());
        System.out.println(k+s+n);
        System.out.println("char "+k.charAt(5));
        System.out.println(n.contains("k"));//returns true or false
        
        String a="welcome";
        String b="welcome";//equals() and equalsIgnoreCase() will compare strings 
        String c="WelcoMe";
        System.out.println("using equals  returns  "+a.equals(b));//true
        System.out.println("using == operator  "+(a==b));//true
        System.out.println("using equalsignorecase  "+a.equalsIgnoreCase(c));//true
        
        //replace() is used to replace single/multipule char in string
        String d="wellcome to selenium java selenium python selenium c#";
        System.out.println(d.replace('e','k' ));//replace with character
        System.out.println(d.replace("selenium", "science"));//replace with string
        
        //substring() it will extract substring with main string
        System.out.println(a.substring(3));//starts with3 index come
        System.out.println(a.substring(1, 3));//el
        System.out.println(a.subSequence(2, 5));//lco
        
        //split() it is used to split the string based on delimeter
        String w="krishna@gmail.com";
        String[] sep = w.split("@");
      // System.out.println(sep[0]);//krishna
      // System.out.println(sep[1]);//gmail.com 
        System.out.println(Arrays.toString(sep));
   
        String ab="@45,20,!89"  ;
        System.out.println(ab.replace("@", "").replace("!",""));
	}

}
