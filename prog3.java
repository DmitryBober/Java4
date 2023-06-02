/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
*/

import java.util.LinkedList;
import java.util.Iterator;

public class prog3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(11);
        list.add(2);
        list.add(13);
        list.add(44);
        list.add(8);

        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println("Сумма всех элементов: " + sum);
    }
}

