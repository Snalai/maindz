package org.example.lesson5.HomeWork;

import java.util.*;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String s = scanner.nextLine();
        s = s.toLowerCase();
        int c = 0;

        String str = "Россия идет вперед всей планеты. Планета - это не Россия.";

        homezadanie1(s, c, str);
    }

    /**
     * @param s   Искомое слово, являющееся ключом
     * @param c   счетчик колличества искомого слова
     * @param str текст в котором ведется поиск искомого слова
     * @apiNote Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
     */
    private static void homezadanie1(String s, int c, String str) {
        Map<String, Integer> mapCh = new HashMap<>();
        List<String> words = new ArrayList<>();
        for (String x : str.split(" ")) {
            words.add(x.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "").toLowerCase());
        }
        for (int i = 0; i < words.size(); i++) {

            if (Objects.equals(words.get(i), s)) {
                c++;
                mapCh.put(s, c);

            }
        }
        mapCh.put(s, c);
        System.out.println(mapCh);
    }
}
