import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Choose a shape type (Rectangle, Circle, Triangle, Square): ");
            choice = scanner.nextLine().toLowerCase();
            Shape shape = null;
            switch (choice) {
                case "rectangle":
                    System.out.println("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.println("Enter height: ");
                    double height = scanner.nextDouble();
                    shape = new Rectangle(width, height);
                    break;
                case "circle":
                    System.out.println("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case "triangle":
                    System.out.println("Enter side1: ");
                    double side1 = scanner.nextDouble();
                    System.out.println("Enter side2: ");
                    double side2 = scanner.nextDouble();
                    System.out.println("Enter side3: ");
                    double side3 = scanner.nextDouble();
                    shape = new Triangle(side1, side2, side3);
                    break;
                case "square":
                    System.out.println("Enter side: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            if (shape != null) {
                System.out.println("Area of " + shape.name + ": " + shape.getArea());
                System.out.println("Perimeter of " + shape.name + ": " + shape.getPerimeter());
            }

            System.out.println("Do you want to continue? (yes/no): ");
            choice = scanner.next();
            scanner.nextLine();  // Consume newline left-over
        } while (choice.equalsIgnoreCase("yes"));
        scanner.close();
    }
}
