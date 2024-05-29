class InlineQuickSorts {

    public static void main(String[] args) {
        int[] Array = {2, 8, 7, 1, 3, 5, 6, 4};
        quickSorting(Array, 0, Array.length - 1);
        for (int number : Array) {
            System.out.print(number + " ");
        }
    }
    //***************************************************************************
    public static void quickSorting(int[] array, int end, int start) {
        if (end < start) {
            int pivotIndex = dividing(array, end, start);
            quickSorting(array, end, pivotIndex - 1);
            quickSorting(array, pivotIndex + 1, start);
        }
    }
    //***************************************************************************
    public static int dividing(int[] array, int end, int start) {
        int pivot = array[start];
        int i = end - 1;
        for (int j = end; j <= start - 1; j++) {
            if (array[j] <= pivot) {
                i = i + 1;
                // swapping arrays
                int temprory = array[i];
                array[i] = array[j];
                array[j] = temprory;
            }
        }
        // swapping array[i + 1] with start array
        int temprory = array[i + 1];
        array[i + 1] = array[start];
        array[start] = temprory;
        return i + 1;
    }
}
//**********************************************ends*********************************


