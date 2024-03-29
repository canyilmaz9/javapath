public class PalindromeNumber {

    static boolean isPalindrome(int number){

        int temp = number, reverseNumber =0, lastNumber;

        while (temp !=0){
            lastNumber = temp %10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String []args){

        System.out.println(isPalindrome(9889));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(4));
        System.out.println(isPalindrome(4004));
        System.out.println(isPalindrome(9889));
        System.out.println(isPalindrome(189456));

    }
}
