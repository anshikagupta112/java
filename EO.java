import java.util.Scanner;
public class EO {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        String result=(a%2==0)?"even" : "odd";
        System.out.println(result);
   
    }
  
    
}
