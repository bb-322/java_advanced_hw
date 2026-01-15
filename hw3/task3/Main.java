package hw3.task3;

public class Main {
    static void main(String[] args) {
        StringBuilder text = new StringBuilder("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam congue ex lobortis feugiat feugiat. Vestibulum euismod nunc eros, quis porta tellus ullamcorper ut. Pellentesque fermentum congue dolor eget ultrices. Sed ac eros eu elit elementum semper eget id enim. Morbi augue risus, ultricies quis ultricies ut, porta eget enim.");

        int middle = text.length() / 2;

        String textPart1 = text.substring(0, middle);
        String textPart2 = text.substring(middle);

        System.out.println(textPart1);
        System.out.println();
        System.out.println(textPart2);

    }
}
