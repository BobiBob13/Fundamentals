import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scan.nextLine());
        List<Integer> numbers = Arrays.stream(scan.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (!(waitingPeople == 0)) {
            for (int i = 0; i < numbers.size(); i++) {

                if (numbers.get(i) == 0) {
                   if (waitingPeople<4){
                       continue;
                   }
                    numbers.set(i, 4);
                    waitingPeople -= 4;

                    numbers.set(i, 3);
                    waitingPeople -= 3;
                }//else  (numbers.get(i)==2){
                    numbers.set(i,2);
                    waitingPeople-=2;
                }//else {
                   // numbers.set(i,1);
                   // waitingPeople-=1;
                }
            }

        }
 //   }


