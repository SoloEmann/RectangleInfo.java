import java.util.Scanner;

class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        boolean done = false;

        do {
            System.out.print("Enter the width: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width > 0) {
                    done = true;
                } else {
                    System.out.println("Enter a number greater than 0.");
                }
            } else {
                in.nextLine();
                System.out.println("Invalid input. Enter a number.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the height: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                if (height > 0) {
                    done = true;
                } else {
                    System.out.println("Enter a number greater than 0.");
                }
            } else {
                in.nextLine();
                System.out.println("Invalid input. Enter a number.");
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
