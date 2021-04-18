import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine()
                .split(", ")).collect(Collectors.toList());


        String inputCommand = scan.nextLine();
        while (!inputCommand.equals("Craft!")) {
            String[] tokens = inputCommand.split(" - ");
            String command = tokens[0];
            String product = tokens[1];
            switch (command) {
                case "Collect":
                    //  String element = inputCommand[1];
                    if (items.contains(product)) {
                        break;
                    } else {
                        items.add(items.size(), product);
                    }
                    break;
                case "Drop":
                    // element = inputCommand[1];
                    if (items.contains(product)) {
                        items.remove(product);
                        break;
                    }
                    break;
                case "Combine Items":
                    String[] elements = tokens[1].split(":");
                    String oldElement = elements[0];
                    String newElement = elements[1];
                    if (items.contains(oldElement)) {
                        items.remove(oldElement);
                        items.add(oldElement);
                        items.add(newElement);
                        break;
                    }
                    break;
                case "Renew":
                    // product = inputCommand[1];
                    // p=element.replaceAll("\\s","");
                    if (items.contains(product)) {
                        items.remove(product);
                        items.add(items.size(), product);
                        break;
                    }
                    break;

            }
            inputCommand = scan.nextLine();

        }

        System.out.println(String.join(", ", items));
    }
}

