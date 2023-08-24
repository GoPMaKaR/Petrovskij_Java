import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scanner.nextInt();
        if (x > 7) {
            System.out.println("Привет");
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner1.nextLine();
        if (name.equalsIgnoreCase("вячеслав")) {
            System.out.println("Привет Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        int[] array = {3, 2, 5, 7, 1, 6};
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 3 == 0){
                System.out.println(array[i]);
            }
        }


        /* Дана скобочная последовательность: [((())()(())]]
        Можно ли считать эту последовательность правильной?
        Ответ: Нет, вторая скобка в этой последовательности должна быть квадратной - [[(())()(())]]
         */
    }
}