
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter any number");
        int a=num.nextInt();
        for(int i=0;i<a;i++){
            System.out.println(i*a);
        }   
    }
}
