import java.util.*;

class Main {  
  public static String FirstReverse(String str) { 
  
        char[] str1= str.toCharArray();
        String str2="";
        for(int i=str1.length-1;i>=0;i--){
        	str2= str2+str1[i];
        }
                   
    return str2;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}