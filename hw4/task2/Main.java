package hw4.task2;
import java.util.regex.*;

public class Main {
    static void main(String[] args) {
        String text = """
                Я йшов у парк разом з другом. Ми грали в м’яч на зеленій галявині.
                Після цього ми пішли до кафе для відпочинку і сіли біля вікна.
                Між деревами пробігали маленькі білочки, а над нами летіли птахи.
                """;

        String regex = "(?<=\\s|^)(в|на|з|у|до|для|при|над|під|між|про|біля|через)(?=\\s|\\.|,|!|\\?|$)";

        String newText = text.replaceAll(regex, "Java");
        System.out.println(newText);
    }
}