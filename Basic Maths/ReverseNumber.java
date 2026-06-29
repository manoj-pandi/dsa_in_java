import java.sql.Time;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
 Scanner  sc= new Scanner(System.in);
System.out.print("Enter a digit : ");
int digit = sc.nextInt();
int rev =0;

while (digit>0){
    int lastDigit = digit %10;
    rev= rev*10 + lastDigit;
  
   digit = digit/10;
}
  System.out.print("Reverse of Given Number : " + rev);
  sc.close();       
    }
  }

//     Time Complexity: O(log₁₀N),The number of iterations in the loop depends on the number of digits in the number N. Since each digit is processed once using constant time operations (modulo, division, multiplication, and addition), the total time taken is proportional to the number of digits, which is log₁₀N.

// Space Complexity: O(1),Only a constant number of variables are used regardless of the size of the input number.
// }
