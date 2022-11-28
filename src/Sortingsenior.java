import java.util.ArrayList;
public class Sortingsenior {
    public static void main(String[] args) {
//    HashMap<Integer,Integer> hm=new HashMap<>();
    ArrayList<Integer> res=new ArrayList<>();
    int arr[]={1,1,2,0,1,1,2,2,0,0};
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
        res.add(0);
        flag+=1;
    }
        for(i=1;i<=b;i++){
            res.add(1);
            flag+=1;
        }
        for(i=1;i<=c;i++){
            res.add(2);
            flag+=1;
        }
    System.out.println(res);

    }
}
//2 0 1 2 1 1 0 1
//Dutch National