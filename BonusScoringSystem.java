import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double countStudents = Double.parseDouble(scan.nextLine());
        double countLesson = Double.parseDouble(scan.nextLine());
        double bonus = Double.parseDouble(scan.nextLine());
        double currentBonus = 0;
        double bigLesson = 0;
        for (int i = 1; i <= countStudents; i++) {
            double everyStudents = Double.parseDouble(scan.nextLine());
            double sumBonus = ((everyStudents) / (countLesson)) * (5 + bonus);
            if (everyStudents > bigLesson) {
                bigLesson = everyStudents;
            }
            if (sumBonus > currentBonus) {
                currentBonus = sumBonus;
            }
        }
        System.out.printf("Max Bonus: %.0f.%nThe student has attended %.0f lectures.", currentBonus, bigLesson);
    }
}

