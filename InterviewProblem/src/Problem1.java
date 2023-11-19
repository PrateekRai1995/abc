import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Problem1 {
	public static void main(String[] args) {
//int a=10;
//int b=20;
//a=a*b;//200
//b=a/b;//10
//a=a/b;//20
//System.out.println("a="+a);		
//System.out.println("b="+b);	
		
		String str="catcatat";
		/*
		 * for(int i=str.length()-1;i>-1;i--) {
		 * 
		 * System.out.print(str.charAt(i));
		 * 
		 * }
		 */
		String str1="catcatat";
		Map<Character, Integer> count=new HashMap<>();
		for(int i=str.length()-1;i>-1;i--) {
			  
			  System.out.print(str.charAt(i));
			  if(count.containsKey(str.charAt(i))) {
				  count.put(str.charAt(i), count.get(str.charAt(i))+1);
			  }else {
				count.put(str.charAt(i), 1);
			}
		
			  
			  
		}
		System.out.println(count);
	}
}