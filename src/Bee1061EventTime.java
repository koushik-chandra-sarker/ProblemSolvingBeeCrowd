import java.util.Scanner;

public class Bee1061EventTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String startDay = scanner.nextLine();
        String startTime = scanner.nextLine();
        String endDay = scanner.nextLine();
        String endTime = scanner.nextLine();

        int startDayInteger = Integer.parseInt(startDay.split(" ")[1]);
        int endDayInteger = Integer.parseInt(endDay.split(" ")[1]);
        String[] splitedStartTime = startTime.split(":");
        String[] splitedEndTime = endTime.split(":");
        long startTimeSeconds = (startDayInteger*86400 )+ (Long.valueOf(splitedStartTime[0].trim()) * 3600 )
                + (Long.valueOf(splitedStartTime[1].trim())*60)
                + (Long.valueOf(splitedStartTime[2].trim()));
        long endTimeSeconds = (endDayInteger*86400) + (Long.valueOf(splitedEndTime[0].trim()) * 3600 )
                + (Long.valueOf(splitedEndTime[1].trim())*60)
                + (Long.valueOf(splitedEndTime[2].trim()));
        long eventTimeInSeconds = endTimeSeconds - startTimeSeconds ;
        int day  =  (int) eventTimeInSeconds / 86400;
        int hour =  (int) (eventTimeInSeconds % 86400) / 3600;
        int minute = (int)((eventTimeInSeconds % 86400) % 3600) / 60;
        int second = (int) (eventTimeInSeconds % 60);
        System.out.println(day + " dia(s)");
        System.out.println(hour + " hora(s)");
        System.out.println(minute + " minuto(s)");
        System.out.println(second + " segundo(s)");

    }
}
