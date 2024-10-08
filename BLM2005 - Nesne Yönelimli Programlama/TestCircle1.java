public class TestCircle1 {
    public static void main(String[] args){
        Circle a = new Circle(1.2);
        System.out.println("Test "+a.getArea());
    }
}

class Circle{

    double radius = 1.0;

    Circle(){
        // Constructor (if no constructor created, creates itself)
    }

    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * 3.14159;
    }
}