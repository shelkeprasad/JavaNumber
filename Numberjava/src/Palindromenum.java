public class Palindromenum {
    public static void main(String[]args){

        int num=121,rev=0,digit;
        int temp=num;

        while (num>0){

            digit =num%10;
            rev = rev * 10 +digit;
            num = num/10;
        }
        if(rev==temp){

            System.out.println("number is palindrome= "+temp);
        }
        else {
            System.out.println("Number is not palindromr= "+ temp);
        }
    }
}
