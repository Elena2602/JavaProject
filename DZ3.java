import java.util.ArrayList;
import java.util.Random;

public class DZ3 {
    //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int val = rd.nextInt(0, 100);
            list.add(val);
        }
        System.out.println(list);

        int maxItem = list.get(0);
        int minItem = list.get(0);
        int sumItem = 0;
        for (int item: list){
            if (item > maxItem){
                maxItem = item;
            }
            if(item < minItem){
                maxItem = item;
            }
            sumItem += item;
        }
        float av= (float) sumItem/list.size();

        System.out.println("Максимальный элемент "+maxItem);
        System.out.println("Минимальный элемент "+minItem);
        System.out.println("Сумма элентов "+sumItem);
        System.out.println("Среднеарифметическое значение "+av);
    }
}
