
import java.util.ArrayList;
public class Sortingsenior {
    public static void main(String[] args) {
//    HashMap<Integer,Integer> hm=new HashMap<>();
    ArrayList<Integer> res=new ArrayList<>();
    int arr[]={2,0,2,1,1,0};
    int i,a=0,b=0,c=0,flag=0;

    for(i=0;i<arr.length;i++)
    {
        if(arr[i]==0)
            a+=1;
        if(arr[i]==1)
            b+=1;
        if(arr[i]==2)
            c+=1;
    }
    for(i=1;i<=a;i++){
        arr[flag]=0;
        flag+=1;
    }
        for(i=1;i<=b;i++){
            arr[flag]=1;
            flag+=1;
        }
        for(i=1;i<=c;i++){
            arr[flag]=2;
            flag+=1;
        }
     for(i=0;i<arr.length;i++)
     System.out.print(arr[i]+",");

    }
}
//2 0 1 2 1 1 0 1
//Dutch National