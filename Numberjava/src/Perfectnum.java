public class Perfectnum {

    public static void main(String [] args){

        int num=40,sum=0;
        int temp=num;

        for(int i=1;i<num/2;i++){

            if(num % i==0){
                sum=sum+i;
            }
        }

        if(sum==temp){
            System.out.println("number is perfect="+ temp);
        }
        else {
            System.out.println("Number is not perfect="+temp);
        }


    }
}
