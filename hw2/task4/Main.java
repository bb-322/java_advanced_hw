package hw2.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>() {{
            put("Москва", "Іванови");
            put("Київ","Петрови");
            put("Лондон","Абрамовичі");
        }};

        System.out.print("enter city: ");
        String city = sc.nextLine();

        System.out.println("в " + city + " живут " + getFamily(map, city));
    }

    static String getFamily(Map<String, String> map, String city) {
        return map.getOrDefault(city, "незнакомци");
    }
}
