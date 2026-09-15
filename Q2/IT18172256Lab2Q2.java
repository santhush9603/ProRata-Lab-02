public class IT18172256Lab2Q2 {
    public static void main(String[] args) {
        double length = 10;
        double PI = 3.14;

        // Perimeter of square = 4 * length = Circumference of circle = 2 * PI * radius
        double perimeter = 4 * length;
        double radius = perimeter / (2 * PI);

        System.out.println("Radius of the circular fence: " + radius);
    }
}