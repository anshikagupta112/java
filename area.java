import java.util.Scanner;
public class area {
    
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter length");
    int length=scanner.nextInt();
    System.out.println("enter breadth");
    int breadth=scanner.nextInt();
    int result=length*breadth;
    System.out.println(result);
    }
    
}
