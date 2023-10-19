import java.util.Scanner;
public class grading {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the marks between 1 to 100");
        int marks=scanner.nextInt();
        if(marks>=90){
            System.out.println("grade A");}
            else if(marks<90 && marks>80){       
                     System.out.println("grade B");}
                     else{
                        System.out.println("grade C");
                     }
        }
    }
    

