import java.util.Scanner;

public class recmaxele {

    public static int maxf(int arr[],int ind){
        if(ind==arr.length){
            return Integer.MIN_VALUE;
        }
        int ele=maxf(arr,ind+1);
        if (arr[ind] > ele) {
            return arr[ind];
        }
        else{
            return ele;
        }

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

        System.out.println("Maximum element in an array : "+maxf(arr,0));
    }
}
