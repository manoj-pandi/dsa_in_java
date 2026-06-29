import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to check whether is a Palindrome or not : ")
;
        int digit = sc.nextInt();
        int rev =0;
        int temp = digit;
        while (temp>0){
            int rem= temp%10;
            rev= rev*10+rem;
            temp= temp/10;

        }
        if (digit==rev){
            System.out.println(digit+" is a Palindrome Number");
        }
        else{
            System.out.print(digit +" is not a Palindrome Number!");
        }
        
        sc.close();
    }
}

// ! complexity Analysis
// Time Complexity: O(log10N + 1), as in the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1. In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations. In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements into the vector.

// Space Complexity: O(1), as only a constant amount of additional memory for the reversed number regardless of size of the input number.