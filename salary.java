import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the salary");
        int salary=scanner.nextInt();
        System.out.println(salary);
        char name=scanner.next().charAt(salary);
        System.out.println(name);
        
    }
    
}
