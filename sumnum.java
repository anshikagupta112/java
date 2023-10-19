
import java.util.Scanner;
public class sumnum {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter any number");
        int a=num.nextInt();
       int temp=1;
       int digit;;
       int sum=0;
        while(a>0){

            digit=a%10;
            sum=sum+digit;
            a=a/10;

        }
        System.out.println(sum);
        
    }
    
}
