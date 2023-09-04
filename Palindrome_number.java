/*
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
*/

class Solution {
    public boolean isPalindrome(int x) {
        /*String s=String.valueOf(x);
        int len=s.length();
        int i=0;
        int j=len-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else{
                return false;
            }
        }
        return true;*/
        if(x<0){
            return false;
        }
        int n1=x;
        int rem=0;
        int rev=0;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev==n1){
            return true;
        }
        return false;
    }
}
