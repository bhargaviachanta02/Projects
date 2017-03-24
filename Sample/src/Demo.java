public class Demo {
	public static void printAll(String s){
		 int i=0;
		   if(s.length()<=0){
		 
		   return;
		   
		   }
		   
		   System.out.print(""+s.charAt(i++));
		   System.out.println("hello  hai");
		   printAll(s.substring(0,s.length()-1));
		    
		}
	public static void main(String[] args) {
	printAll("123");
	}

}
