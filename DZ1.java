public class DZ1 {
  //  (Дополнительное) Реализовать алгоритм сортировки слиянием
        public static void esSort(int[] sortArr, int left, int right) {

            if (sortArr.length == 0 || left >= right) return;

            int sor1 = left + (right - left) / 2;
            int sor2 = sortArr[sor1];

            int i = left, j = right;
            while (i <= j) {
                while (sortArr[i] < sor2) i++;
                while (sortArr[j] > sor2) j--;
                if (i <= j) {
                    int swap = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = swap;
                    i++;
                    j--;
                }
            }

            //рекурсия для сортировки левой и правой части
            if (left < j) esSort(sortArr, left, j);
            if (right > i) esSort(sortArr, i, right);
        }

        public static void main(String args[]) {
            int[] sortArr = {12, 16, 4, 1, 32, 13};
            esSort(sortArr, 0, sortArr.length - 1);
            for(int i = 0; i < sortArr.length; i++){
                System.out.print(sortArr[i] + "\n");
            }
        }
    }


