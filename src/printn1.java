import java.util.Scanner;

public class printn1 {
    public static void print(int n){
        if(n==0){
            return ;
        }

        print(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        print(n);
    }
}

