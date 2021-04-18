import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short firstCount =Short.parseShort(scan.nextLine());
        int secondCount = Short.parseShort(scan.nextLine());
        int thirdCount = Short.parseShort(scan.nextLine());
        int studentsPerDays = Integer.parseInt(scan.nextLine());

        //int hours = 0;
        int needTime = 0;
        int studentsPerHour = firstCount + secondCount + thirdCount;

        while (studentsPerDays > 0) {
            //hours++;
            needTime++;
            if (needTime % 4 == 0) {
                continue;
            }
            studentsPerDays-=studentsPerHour;



        }
        System.out.printf("Time needed: %dh.",needTime);
    }
}
