public class TestMethod {
    public static void main(String[] args) {
        Test2 test = new Test3();
        test.Deneme();
    }
}

class Test{
    public void Deneme(){
        System.out.println("Deneme");
    }
}

abstract class Test2 extends Test{
    @Override
    public abstract void Deneme();
}

class Test3 extends Test2{
    @Override
    public void Deneme(){
        System.out.println("Deneme2");
    }
}