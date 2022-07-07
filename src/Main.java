import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("enter number :");
        n = input.nextInt();
        double number=0 ;

       for(double i=1;i<=n;i++){
           number+=(1/i);

       }
        System.out.println(number);
    }
}
