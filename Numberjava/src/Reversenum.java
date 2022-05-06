public class Reversenum {
    public static void main(String[]args){

        int num=1234,rev=0,sum=0;
        int d;

        while (num>0){

            d=num % 10;
            rev = rev *10 + d;
            num= num /10;


        }
        System.out.println("Reverse number is = "+ rev);
    }
}
