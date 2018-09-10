package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String word1 = "Zee"; //No
        String word2 = "did"; // Yes
        checkPalindrome(word1);
        checkPalindrome(word2);
        checkPalindrome("Midterm"); //No
        checkPalindrome("Wow"); // Yes

    }
    public static void checkPalindrome(String word){
        String actual = word.toLowerCase();
        String reverse = "";

        for(int i= actual.length()-1; i >= 0; i--){
            reverse = reverse + actual.charAt(i);
        }
        if(actual.equals(reverse)){
            System.out.println("Yes it is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
