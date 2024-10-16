import java.util.ArrayList;

public class ArrayListDeneme {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> cities = new ArrayList<Integer>();
        System.out.println("Initial size of al: " + al.size());
        System.out.println(cities.size());
        cities.add(3);
        cities.add(4);
        System.out.println(cities.toString());

        ArrayList<Circle> circles = new ArrayList<Circle>();
        circles.add(new Circle(3));
        circles.add(new Circle(4));
        System.out.println(circles.toString());
        System.out.println(circles.get(0).getArea());
    }
}