import java.util.Scanner;
public class greatest {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter any number");
    int first=scanner.nextInt();
    System.out.println("enter second number");
    int second=scanner.nextInt();
    System.out.println("enter third number");
    int third=scanner.nextInt();
    int result=(first>second)?((first>third)?first:third):((second>third)?second:third);
    System.out.println("the max number is" + result);
    }
    
}
