

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("setting value in base class");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a printMe function of base class");
    }
}
class Derived extends Base{
    int y;

    public void setY(int y) {
        System.out.println("setting value in derived class");
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class inheritance {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //Base class object
        Base b= new Base();
        b.setX(10);
        System.out.println(b.getX());
        //derived class object
        Derived d=new Derived();
        d.setX(99);
        System.out.println(d.getX());
        //call setY and getY
        d.setY(15);
        System.out.println(d.getY());
        //call printMe function from base object
        b.printMe();
        d.printMe();

    }
}
