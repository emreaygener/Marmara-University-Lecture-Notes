public class TestSingleton {
    //Singleton sg1 = new Singleton();
    
    public static void main(String[] args) {
    //Singleton sg1 = Singleton.getInstance();
    //sg1.printName();    
    for (int i = 0; i<10; i++){
            Singleton s = Singleton.getInstance();
            s.printName();
        }
    }
} 