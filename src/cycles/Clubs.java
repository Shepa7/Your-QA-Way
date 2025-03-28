package cycles;

import java.util.ArrayList;

public class Clubs {
    public static void main(String[] args) {
        // 1. Создаём и заполняем массив
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // Заполняем числами от 1 до 7
        }

        // 2. Перебираем массив и выводим числа, прерываем при 5
        for (int num : numbers) {
            if (num == 5) {
                break; // Прерываем вывод при числе 5
            }
            System.out.println(num);
        }

        // 3. Создаём ArrayList и заполняем 10 значениями
        ArrayList<String> clubs = new ArrayList<>();
        clubs.add("Барселона");
        clubs.add("Реал Мадрид");
        clubs.add("Манчестер Юнайтед");
        clubs.add("Ливерпуль");
        clubs.add("Бавария");
        clubs.add("ПСЖ");
        clubs.add("Ювентус");
        clubs.add("Челси");
        clubs.add("Милан");
        clubs.add("Арсенал");

        // 4. Выводим все значения с помощью foreach
        for (String club : clubs) {
            System.out.println(club);
        }
    }
}

