public class Week4Java {
    public static void main(String[] args){
        // C c = new C();
        // C c1 = new C(5);
        // E e = new E(3);
        // // System.out.println(e.toString());
        // Z z = new Z();
        // // System.out.println(z.toString("z"));
        // Object o = new Z();
        // // System.out.println(o.toString());
        // Y x = new Z();
        // // System.out.println(x.toString());
        Object o1 = new Y();
        // X z2 = (Y)o1;
        // System.out.println(z2.toString());
        if (o1 instanceof Z){
            System.out.println("true");
        }
        if (o1 instanceof Y){
            System.out.println("true");
        }
        if (o1 instanceof X){
            System.out.println("true");
        }
    }
}
class A{
    A(){
        System.out.println("A");
    }
    A(int i){
        System.out.println("A" + i);
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
    B(int i){
        super(i);
        System.out.println("B" + i);
    }
}
class C extends B{
    C(){
        System.out.println("C");
    }
    C(int i){
        super(i);
        System.out.println("C"+i);
    }
}
class D {
    D(int some){}
}
/**
 * e
 */
class E extends D {
    E(int i){
        super(3);
    }
    public String toString(){
        return super.toString();
    }
    
}

class X{
    public String toString(){
        return "X";
    }
}
class Y extends X{
    public String toString(){
        return "Y";
    }
    public String toString(String isParent){
        return super.toString();
    }
}
class Z extends Y{
    public String toString(String isParent) {
        return super.toString(isParent);
    }
    public String toString(){
        return "Z";
    }
}
