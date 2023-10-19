
import java.util.Scanner;

public class atm {public static void main(String[]args){
    int pin=1234;
    System.out.println("welcome to my bank");
    System.out.println("enter your pin");
    if(pin==1234){
        System.out.println("press enter to continue");
    }
    else{
        System.out.println("enter the correct pin");
    }
    System.out.println("1.cash widtdrawl");
    System.out.println("2.Balance enquiry");
    System.out.println("3.chnge pin");
    System.out.println("4.exit");
    System.out.println("enter your choice");
}
Scanner option=new Scanner(System.in);
int choice=option.nextInt();
switch(choice){
    case 1:
    System.out.println("enter amount");
    

}
    
}
