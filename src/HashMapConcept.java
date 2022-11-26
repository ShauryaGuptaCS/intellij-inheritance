import java.util.HashMap;

public class HashMapConcept{
    public static void main(String[] args) {
        HashMap<String,String> capitalcities=new HashMap<String,String>();
        capitalcities.put("UttarPradesh","Lucknow");
        capitalcities.put("Gujrat","Gandhinagar");
        capitalcities.put("Maharashtra","Mumbai");
        capitalcities.put("TamilNadu","Chennai");
        capitalcities.put("Bihar","Patna");
        System.out.println(capitalcities);
        System.out.println(capitalcities.get("UttarPradesh"));
        System.out.println(capitalcities.get("Bihar"));
        System.out.println("size of hashmap is:"+capitalcities.size());

        for(String i:capitalcities.keySet())
        {
            System.out.print(i+"-");
        }
        System.out.println();
        for(String i:capitalcities.values())
        {
            System.out.print(i+"-");
        }
        System.out.println();
        for(String i:capitalcities.keySet())
        {
            System.out.println("keys:"+i+" values:"+capitalcities.get(i));
        }
        System.out.println();
        capitalcities.remove("Bihar");
        System.out.println(capitalcities);
        System.out.println();
        capitalcities.clear();
        System.out.println(capitalcities);
    }
}
