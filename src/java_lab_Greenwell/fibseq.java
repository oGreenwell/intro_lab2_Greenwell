package java_lab_Greenwell;
import java.util.Scanner;

public class fibseq {
	public static int fibonacci(int n) {
	      if (n < 0) {
	         return -1;
	      } else if (n == 0) {
	         return 0;
	      } else {
	         //int [] fib = new int[n];
	         //fib[0] = 0;
	         int first = 0;
	         //fib[1] = 1;
	         int second = 1;
	         int third = first + second;
	         for (int i = 1; i < n; i++) {
	            third = first + second;
	            first = second;
	            second = third;
	            
	            //fib[i] = (fib[i] + fib[i - 1]);
	         }
	         
	         return third;
	      }
	   }
	   
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int startNum;
	      
	      startNum = scnr.nextInt();
	      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
	   }
}
