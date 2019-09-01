package _02_gotta_catchem_all;

public class ExceptionMethods{
	 double divide ( double x, double y){
		 if(y < 0) {
			System.out.println("exception thrown");
			 throw new IllegalArgumentException();
		 }
		 
		return x/y;
		
	}
	 String reverseString(String s) {
		 String [] word = s.split("");
		 String reverse = "";
		 if(s.length()<=0) {
			 throw new IllegalArgumentException();
		 }
		 for(int i = s.length()-1; i >= 0; i--) {
			 System.out.println(word[i]);
			 reverse = reverse.concat(word[i]);
		 }
		 System.out.println(reverse);
		 return reverse;
	 }
}
