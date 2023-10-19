import java.util.Scanner;
public class days {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number between 1 to 7");
        int days=scanner.nextInt();
        if(days==1){
            System.out.println("monday");}
            else if(days==2){
                System.out.println("tuesday");
            }
            else if(days==3){
                System.out.println("wednesday");
            }
            else if(days==4){
                System.out.println("thursday");
            }
            else if(days==5){
                System.out.println("friday");
            }
            else if(days==6){
                System.out.println("saturday");
            }
            else{
                System.out.println("wednesday");
            }
    }    
}