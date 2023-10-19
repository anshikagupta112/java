
import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter any number");
        int a=num.nextInt();
       int temp=1;
       int length=0;
        while(temp<a){

            length++;
            temp*=10;

        }
        System.out.println(length);
        
    }
    
}
