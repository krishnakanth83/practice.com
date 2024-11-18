package practice.com;

public class StringImmutable {

	public static void main(String[] args) {
		String s="welcome";
		s.concat("to java");
		System.out.println(s);//welcome .here string is immutable
        String p = s.concat("to pytyon");
        System.out.println(p);//welcometo python
        System.out.println(s);//immutablebecause var value not changed
        
        StringBuffer sb=new StringBuffer("world");//
       sb.append(" my");
        System.out.println(sb);//world my.StringBuffer is mutable
        
        
        
        StringBuilder sb2=new StringBuilder("hello");//
        sb2.append(" my");
         System.out.println(sb2);//world my.StringBuilder is mutable
	}

}
