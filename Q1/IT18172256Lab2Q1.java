public class IT18172256Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;
        // Perimeter = 2 * (length + width), width = 0.75 * length
        // perimeter = 2 * (length + 0.75*length) = 2 * 1.75 * length
        double length = perimeter / (2 * 1.75);
        double width = 0.75 * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}