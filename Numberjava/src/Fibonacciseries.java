public class Fibonacciseries {
    public static void main(String [] args){

        int f=0,s=1,t,num=10;
        System.out.print(f+""+" "+s);

        for(int i=2;i<=10;i++){

            t=f+s;
            System.out.print(" "+ t);
            f=s;
            s=t;
        }
    }
}
