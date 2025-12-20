public class insertionSort {
    void main() {

        int[] unsorted = {2, 6, 8, 1, 1, 4, 8, 4, 5, 6, 2, 0, 8, -23};
        int[] sorted = insertSort(unsorted);

        for(int s: sorted) {
            System.out.println(s);
        }

    }

    int[] insertSort(int[] toSort) {
        int[] sorted = toSort;

        for (int i = 0; i < toSort.length; i++) {
            for(int j = 0; j < i; j++) {
                if(toSort[i] < sorted[j] ) {
                    int tmp = toSort[i];
                    toSort[i] = sorted[j];
                    sorted[j] = tmp;
                }
            }
        }

        return sorted;
    }
}
