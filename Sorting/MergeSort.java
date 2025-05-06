import java.util.Scanner;

class MergeSort {
    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int x = 0; x < n1; x++){
            lArr[x] = arr[l+x];
        }

        for(int x = 0; x < n2; x++){
            rArr[x] = arr[mid+1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }
            else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        } 
         while(j < n2){
            arr[k] = rArr[j];
            j++;
            k++;
        } 

    }
    public static void sort(int[] arr, int l, int r) {
        if(l < r){
            int mid = (l + r) / 2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] input = read.nextLine().trim().split("\\s+");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Elements Before sorting:");
        for (int val: arr){
            System.out.print(val +" ");
        }

        sort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("Elements After sorting:");
        for (int val: arr){
            System.out.print(val +" ");
        }
    }
}