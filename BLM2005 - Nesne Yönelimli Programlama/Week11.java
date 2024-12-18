import java.util.ArrayList;

public class Week11 {
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<>();
        list.add("First String");
        list.add("Second String");

        for (Object item : list) {
            System.out.println(item);
        }
        ArrayList list2 = new ArrayList();
        list2.add("First String");
        list2.add("Second String");

        for (Object item : list) {
            System.out.println(item);
        }
    }
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2){
        return object1.getArea() == object2.getArea();
    }
}

class GeometricObject{
    private int Area;

    public GeometricObject(int Area){
        this.Area = Area;
    }

    public int getArea() {
        return Area;
    }
}