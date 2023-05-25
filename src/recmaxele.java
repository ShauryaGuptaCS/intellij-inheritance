import java.util.Scanner;

public class recmaxele {
    static int max=Integer.MIN_VALUE;
    public static void maxf(int arr[],int ind){
        if(ind==arr.length){
            return ;
        }
        if (arr[ind] > max) {
            max=arr[ind];
        }
        maxf(arr,ind+1);
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("enter array elements");
            arr[i] = in.nextInt();
        }
        maxf(arr,0);
        System.out.println("Maximum element in an array : "+max);
    }
}
