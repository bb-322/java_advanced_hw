package hw4.task3;
import java.time.*;

public class Main {
    static void main(String[] args) {
        LocalDateTime birth = LocalDateTime.of(2000, 10, 15, 12, 31, 6);
        LocalDateTime now = LocalDateTime.now();

        Period period = Period.between(birth.toLocalDate(), now.toLocalDate());
        Duration duration = Duration.between(birth, now);

        int totalHours = duration.toHoursPart();
        int totalMinutes = duration.toMinutesPart();
        int totalSeconds = duration.toSecondsPart();

        System.out.println("you have turned " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days, " + totalHours + " hours, " + totalMinutes + " minutes, " + totalSeconds + " seconds old");
    }
}
