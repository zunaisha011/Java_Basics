import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner s1= new Scanner(System.in);
        Scanner s2= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= s1.nextLine();
        System.out.println("Enter your age:");
        int age=s1.nextInt();
        System.out.println(name+" "+ age);
        System.out.println("Are you interested in work");
        String ans=s1.nextLine();
        System.out.println(ans);
    }
}
