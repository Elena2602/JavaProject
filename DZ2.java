import java.util.ArrayList;
import java.util.Random;

public class DZ2 {
    //Пусть дан произвольный список целых чисел, удалить из него чётные числа
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int val = rd.nextInt(0, 100);
            list.add(val);
        }
        System.out.println(list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;

                //System.out.println(list);
            }
        }
        System.out.print(list);
    }
}
