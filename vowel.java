import java.util.Scanner;
public class vowel {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any letter");
        char vowel=scanner.next().charAt(0);
        if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u')
 {       System.out.println("vowels");
        }
         else{
            System.out.println("consonant");
         }
    }
    
}
