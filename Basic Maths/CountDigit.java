import java.util.*;
public class CountDigit{
    public static void main(String[] args){
 Scanner  sc= new Scanner(System.in);
System.out.print("Enter a digit : ");
int digit = sc.nextInt();
int cnt =0;
while (digit>0){
   cnt++;
   digit = digit/10;
}
  System.out.print("Count of Given Digit : " + cnt);
  sc.close();       
    }
  
}

// Time Complexity: O(log10N + 1), where N is the input number. The time complexity is determined by the number of digits in the input integer N. In the worst case when N is a multiple of 10 the number of digits in N is log10N + 1.

// In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
// In each iteration of the while loop we perform constant time operations like division and increment the counter.
// Space Complexity : O(1), as only a constant amount of additional memory for the counter regardless of size of the input number.


// optimal Approach:
//  int cnt = (int) (Math.log10(n) + 1);