public class SelectionSort {
    public static void sort(int[] a){
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i; j < len; j++) {
                if (a[j]<a[min])
                    min = j;
            }
            swap(a,i,min);
        }
    }
    private static void swap( int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,23,67,4,22,0,5,16,8,66};
        sort(arr);
        for (int item : arr) {
            System.out.print(item+" ");
        }
    }
}
