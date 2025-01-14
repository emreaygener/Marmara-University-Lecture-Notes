package DesignPatternDeneme;

public class Singleton {
    private static int count;
    private String name;
    private static Singleton object;
    private Singleton(){
        count++;
        name="Singleton"+count;
    }
    public void printName(){
        System.out.println("Name:"+name);
    }
    public static Singleton getObject(){
        if(count<3){
            object = new Singleton();
        }
        return object;
    }
}
