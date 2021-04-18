import java.util.*;
import java.util.stream.Collectors;

public class Numbers_Description {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newNumbers = new ArrayList<>();
        double averageSum = 0;
        double sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        averageSum = sum / numbers.size();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > averageSum) {
                newNumbers.add(numbers.get(i));
            }
        }
        Collections.sort(newNumbers);
        for (int i = newNumbers.size()-1; i >= 1; i--) {
            if (count==5){
                break;
            }
            System.out.print(newNumbers.get(i) + " ");
            count++;
        }


    }
}


