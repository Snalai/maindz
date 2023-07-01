package org.example.lesson5.HomeWork;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HomeWork2 {
    public static void main(String[] args) {
        String str = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков" +
                " Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов";
        homezadanie2(str);
    }

    /**
     * @apiNote Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
     * @param str входные имена
     */
    private static void homezadanie2(String str) {
        String[] names = str.split(" ");
        Map<String, Integer> count = new HashMap<>();
        for (String name : names) {
            if (count.containsKey(name)) {
                count.put(name, count.get(name) + 1);
            } else count.put(name, 1);
        }
        Map<String, Integer> sortedCount = new TreeMap<>((e1, e2) -> count.get(e2).compareTo(count.get(e1)));
        sortedCount.putAll(count);
        for (Map.Entry<String, Integer> e : sortedCount.entrySet()) {
            String name = e.getKey();
            int c = e.getValue();
            if (c > 1) {
                System.out.println(name + ": " + c);
            }
        }
    }

}
