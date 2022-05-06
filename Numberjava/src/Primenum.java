public class Primenum {
    public static void main(String[]args){

        int num= 25;
        boolean flag=true;
        for(int i=2;i<=num/2;i++){
            if(num % 2==0){
                flag=false;
                break;
            }
        }
        if(flag==false){

            System.out.println("number is not prime");
        }
        else {
            System.out.println("number is prime number");
        }
    }
}
