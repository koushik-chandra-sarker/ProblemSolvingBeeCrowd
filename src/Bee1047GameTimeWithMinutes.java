import java.util.Scanner;

public class Bee1047GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();

        int totalStartMinutes = (startHour*60) + startMinute;
        int totalEndMinutes = (endHour*60) + endMinute;
        int hour;
        int minute;
        if (totalStartMinutes < totalEndMinutes) {
            int totalMinutes = totalEndMinutes - totalStartMinutes;
            hour = totalMinutes / 60;
            minute = totalMinutes % 60;
        }else {
            int totalMinutes = (24*60) - totalStartMinutes + totalEndMinutes;
            hour = totalMinutes / 60;
            minute = totalMinutes % 60;
        }

        System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", hour, minute));
    }
}
