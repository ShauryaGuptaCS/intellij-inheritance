public class InhC extends InhB {
    public static void main(String[] args) {
        // object of Inha class
        Inha a=new Inha();
        //object of InhB class
        InhB b=new InhB();
        //object of InhC class
        InhC c=new InhC();
        a.setX(10);
        a.setY(20);
        System.out.println(a.sum());
        b.setX(90);
        b.setY(10);
        System.out.println(b.multiply());
        System.out.println(b.sum());
    }


}
