import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        while (x>0){
        int rem=x%10;
            x=x/10;
        rev=rev*10+rem;
        }
        if (temp==rev){
            return true;
        }
        else {
            return false;
        }



    }

}
public class palindrom {
    public static void main(String[] args) {
        System.out.print("Enter the any number:- ");
        Scanner scanner=new Scanner(System.in);
       int x=scanner.nextInt();
        Solution sc=new Solution();
        System.out.println(sc.isPalindrome(x));
    }
}
