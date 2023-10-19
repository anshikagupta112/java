 import java.util.*;
 class alpha{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int ar[]={12,23,26,70,50,100,87,69,41};

        int leng=ar.length;

        System.out.println("The length of array is "+leng);

        for(int i=0 ; i<leng ; i++)
        {
            if(ar[i]==a){
                System.out.println("Element " +a+ " is found at index number "+ i);
            }
        }
    }
}
