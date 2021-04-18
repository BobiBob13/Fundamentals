import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double allSum = 0;
        for (int i = 0; i <n ; i++) {
            double price = Double.parseDouble(scan.nextLine());
            double days =Double.parseDouble(scan.nextLine());
            double countCapsules = Double.parseDouble(scan.nextLine());;
            double sum = (days*countCapsules)*price;
            allSum+=sum;
            System.out.printf("The price for the coffee is: $%.2f%n",sum);
        }
        System.out.printf("Total: $%.2f",allSum);

    }
}
