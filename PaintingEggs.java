import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int eggs = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (size.equals("Large")) {
            if (color.equals("Red")){
                price = 16;
            } else if (color.equals("Green")){
                price = 12;
            } else if (color.equals("Yellow")) {
                price = 9;
            }
        }

        if (size.equals("Medium")) {
            if (color.equals("Red")){
                price = 13;
            } else if (color.equals("Green")){
                price = 9;
            } else if (color.equals("Yellow")) {
                price = 7;
            }
        }

        if (size.equals("Small")) {
            if (color.equals("Red")){
                price = 9;
            } else if (color.equals("Green")){
                price = 8;
            } else if (color.equals("Yellow")) {
                price = 5;
            }
        }

        double totalPrice = price * eggs;
        double costs = totalPrice * 0.35;

        double lastPrice = totalPrice - costs;

        System.out.printf("%.2f leva.", lastPrice);
    }
}
