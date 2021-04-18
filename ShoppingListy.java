import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingListy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        List<String> products = Arrays.stream(scan.nextLine()
                .split("!")).collect(Collectors.toList());

        String inputCommand = scan.nextLine();

        while (!inputCommand.equals("Go Shopping!")) {
           // String[] commands = inputCommand.split("\\s+");
            String first = inputCommand.split("\\s+")[0];
            String second = inputCommand.split("\\s+")[1];
            switch (first) {
                case "Urgent":

                    if (!products.contains(second)) {
                        products.add(0, second);
                    }
                    break;
                case "Unnecessary":
                    if (products.contains(second)) {
                        products.remove(second);
                        break;
                    }
                    break;
                case "Correct":
                    String[] change = second.split("\\s+");
                    String newItem = inputCommand.split("\\s+")[2];
                    String oldItem = second;
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).equals(oldItem)) {
                            products.set(i, newItem);
                        }
                    }
                    break;
                case "Rearrange":
                    if (products.contains(second)) {
                        products.remove(second);
                        products.add(products.size(), second);
                    }
                    break;
            }

            inputCommand = scan.nextLine();
        }
        for (int i = 0; i < products.size(); i++) {
         count++;
            if (count==products.size()) {
                System.out.print(products.get(i));
            } else {
                System.out.print(products.get(i) + ", ");
            }
        }

    }
}