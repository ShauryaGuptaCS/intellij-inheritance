import java.util.Scanner;

public class recarr2 {
    public static void printarr(int arr[],int ind){
        if(ind==arr.length){
            return ;
        }
        printarr(arr,ind+1);
        System.out.print(arr[ind]+" ");
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter array elements");
            arr[i]=in.nextInt();
        }

        printarr(arr,0);
    }
}
