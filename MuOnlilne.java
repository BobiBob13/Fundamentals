import java.util.Scanner;

public class MuOnlilne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int health = 100;
        int bitcoin = 0;
        int countRoom = 0;
        String[] input = scan.nextLine().split("\\|");


        for (int i = 0; i <= input.length - 1; i++) {
            if (health <= 0) {
                break;
            }
            countRoom++;
            String[] token = input[i].split("\\s+");
            int monsterPower = Integer.parseInt(token[1]);
            if (token[0].equals("potion")) {
                int currentHealth = 0;
                currentHealth = health + Integer.parseInt(token[1]);
                if (currentHealth > 100) {
                    health = 100;
                    int healedSum = currentHealth - health;
                    int realHealed = Math.abs(healedSum - Integer.parseInt(token[1]));
                    System.out.println("You healed for" + " " + realHealed + " " + "hp.");
                    System.out.println("Current health:" + " " + health + " " + "hp.");
                //    break;
                }else {
                    health = currentHealth;
                    System.out.println("You healed for" + " " + token[1] + " " + "hp.");
                    System.out.println("Current health:" + " " + health + " " + "hp.");
                }
              //  break;
            } else if (token[0].equals("chest")) {
                bitcoin += Integer.parseInt(token[1]);
                System.out.print("You found" + " " + token[1] + " " + "bitcoins.");
                System.out.println();
              //  break;
            } else if (health > monsterPower) {
                health = health - monsterPower;
                System.out.println("You slayed" + " " + token[0] + ".");
               // break;
            } else {
                System.out.println("You died! Killed by" + " " + token[0]+".");
                System.out.println("Best room:" + " " + countRoom);
                health = health - monsterPower;
            }
        }
        if (health > 0) {
            System.out.println("You've made it!");
            System.out.println("Bitcoins:" + " " + bitcoin);
            System.out.println("Health:" + " " + health);
        }
    }
}
