package org.example.lesson6.HomeWork.Laptop1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(4, 250, "Windows", "Red");
        Laptop laptop2 = new Laptop(8, 250, "Windows", "Green");
        Laptop laptop3 = new Laptop(16, 1000, "Windows", "Black");
        Laptop laptop4 = new Laptop(8, 500, "Linux", "White");
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "ОЗУ");
        criteria.put(2, "Объем ЖД");
        criteria.put(3, "Операционная система");
        criteria.put(4, "Цвет");
        zadanie(laptops);
    }

    /**
     * @param laptops принемает множество ноутбуков
     * @apiNote •Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
     * • Создать множество ноутбуков.
     * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
     * “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
     * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     */
    private static void zadanie(List<Laptop> laptops) {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        int cri = 0;
        while (cri <= 0 | cri > 4) {
            System.out.println("""
                    Введите цифру, соответствующую необходимому критерию:
                    1 - ОЗУ
                    2 - Объем ЖД
                    3 - Операционная система
                    4 - Цвет
                    """
            );
            cri = scanner.nextInt();
            if (cri == 1) {
                System.out.println("Минимум сколько ОЗУ вы рассматриваете?");
                int ram = scanner.nextInt();
                for (Laptop laptop : laptops) {
                    if (laptop.RAM >= ram) {
                        System.out.println(laptop);
                    } else {
                        System.out.println("Нет в наличии ноутбука с таким колличеством ОЗУ");
                        break;
                    }
                }
            } else if (cri == 2) {
                System.out.println("Минимум сколько Объем ЖД вы рассматриваете?");
                int Hdc = scanner.nextInt();
                for (Laptop laptop : laptops) {
                    if (laptop.Hdc >= Hdc) {
                        System.out.println(laptop);
                    } else {
                        System.out.println("Нет в наличии ноутбука с таким колличеством Объеа ЖД");
                        break;
                    }
                }
            } else if (cri == 3) {
                System.out.println("Какую Операционную систему вы рассматриваете?");
                String opersys = scanner.next();
                for (int i = 0; i < laptops.size(); i++) {
                    if (laptops.get(i).Opersys.contains(opersys)) {
                        System.out.println(laptops.get(i));
                        t++;
                    } else if (!laptops.get(i).Opersys.contains(opersys) & t == 0 & i + 1 == laptops.size())
                        System.out.println("Нет в наличии ноутбука с такой Операционной системой");
                }
            } else if (cri == 4) {
                System.out.println("Какой Цвет вы рассматриваете?");
                String color = scanner.next();
                for (int i = 0; i < laptops.size(); i++) {
                    if (laptops.get(i).Color.contains(color)) {
                        System.out.println(laptops.get(i));
                        t++;
                    } else if (!laptops.get(i).Color.contains(color) & t == 0 & i + 1 == laptops.size())
                        System.out.println("Нет в наличии ноутбука с таким Цветом");
                }
            } else System.out.println("Вы не ввели цифру соответствующу какому либо критерию");

        }
    }
}
