package SecondInheritancePackage;
import NewInheritancePackage.InhD;
public class InhE extends InhD {
    public static void main(String[] args) {
        //object of InhD
        InhD d=new InhD();
        //object of InhE
        InhE e=new InhE();
        //using object d
        d.setX(50);
        System.out.println(d.getX());
        d.setY(20);
        System.out.println(d.getY());

        //using object e
        e.setX(100);
        System.out.println(e.getX());
        e.setY(200);
        System.out.println(e.getY());



    }
}
