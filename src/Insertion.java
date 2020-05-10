public class Insertion {
    public static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j >0 ; j--) {
                if (a[j]<a[j-1])
                    swap(a,j,j-1);
            }
        }
    }
    private static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] =temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,23,67,4,22,0,5,16,8,66};
        sort(arr);
        for (int item : arr) {
            System.out.print(item+" ");
        }
    }
}
