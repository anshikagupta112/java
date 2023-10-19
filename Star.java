import java.util.Scanner;
public class Star{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            if(i==size/2){
                System.out.print("*");
            }
            else if(j==size/2){
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
}
}