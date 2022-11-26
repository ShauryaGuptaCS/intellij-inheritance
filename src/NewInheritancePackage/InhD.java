package NewInheritancePackage;
public class InhD {
    int x,y;

    public void setY(int y) {
        System.out.println("setting value of y in InhD class");
        this.y = y;
    }

    public void setX(int x) {
        System.out.println("setting value of x in InhD class");
        this.x = x;
    }

    public int getY() {
        System.out.println("getting value of y in InhD class");
        return y;
    }

    public int getX() {
        System.out.println("getting value of x in InhD class");
        return x;
    }
}
