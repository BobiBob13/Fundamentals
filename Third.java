import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> text = new ArrayList<>();
        String inputCommand = scan.nextLine();
        String[] command = inputCommand.split("\\s+");
        String firstCommand = command[0];
        while (!firstCommand.equals("end")) {
            switch (firstCommand) {
                case "Chat":
                    String tokens = command[1];
                    text.add(tokens);
                    break;
                case "Edit":
                    String oldText = command[1];
                    String newText = command[2];
                    if (text.contains(oldText)) {
                        text.remove(oldText);
                        text.add(newText);
                        break;
                    }
                    break;
                case "Spam":
                    for (int i = 1; i < command.length; i++) {
                        text.add(command[i]);

                    }
                    break;

                case "Delete":
                    String deleteText = command[1];
                    if (text.contains(deleteText)) {
                        text.remove(deleteText);
                    }

                    break;
                case "Pin":
                    String name = command[1];
                    if (text.contains(name)){
                        text.remove(name);
                        text.add(name);
                    }
                    break;

            }
            inputCommand = scan.nextLine();
            command = inputCommand.split("\\s+");
            firstCommand = command[0];

        }
        for (String printText : text) {
            System.out.println(printText);
        }

    }
}
