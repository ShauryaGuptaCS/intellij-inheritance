import java.util.Scanner;

public class recsamekeylast {
    public static int samekey(int arr[],int ind,int key ){
        if(ind==arr.length){
            return -1;
        }
        if (arr[ind] == key) {
            int val=samekey(arr,ind+1,key);
            if(val!=-1){
                return val;
            }

            return ind;
        }
        else{
            return samekey(arr,ind+1,key);
        }

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
        System.out.println("enter the value to be checked");
        int check=in.nextInt();
        System.out.println("the index is :"+samekey(arr,0,check));


    }
}
