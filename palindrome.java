import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int num=scanner.nextInt();
        int sum=0;
        int x=0;
        int temp=0;
        while(num>0)
        {
            x=num%10;
            sum=num/10;
            temp=temp*10+x;
        }

    }
    
}
