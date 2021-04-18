import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double taxes = 0;
        double sum = 0;
        String command = scan.nextLine();
        while (true) {
            if (command.equals("regular")) {
                if (sum==0){
                    System.out.println("Invalid order!");
                    break;
                }
                taxes = sum * 0.20;
                double allSum = sum + taxes;
                System.out.printf("Congratulations you've just bought a new computer!" +
                        "%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", sum, taxes, allSum);
                break;
            } else if (command.equals("special")) {
                if (sum==0){
                    System.out.println("Invalid order!");
                    break;
                }
                taxes = sum * 0.20;
                double allSum = sum + taxes;
                double discount = allSum * 0.10;
                double realSum = allSum - discount;
                System.out.printf("Congratulations you've just bought a new computer!" +
                        "%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", sum, taxes, realSum);
                break;
            } else {
                double price = Double.parseDouble(command);
                if (price < 0) {
                    System.out.println("Invalid price!");


                }
                if (price > 0) {
                    sum += price;
                }

                command = scan.nextLine();
            }


        }
    }
}
