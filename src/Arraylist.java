import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("enter the size of array");
        Scanner in =new Scanner(System.in);
        int n,i,m;
        n=in.nextInt();
        System.out.println("enter the elements of array List according to the size");
        for(i=0;i<n;i++)
        {
            m=in.nextInt();
            arr.add(m);
        }
        System.out.println(arr);
        System.out.println(arr.size());

        for(i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.remove(2);
        System.out.println(arr);
        arr.add(2,90);
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
    }
}
