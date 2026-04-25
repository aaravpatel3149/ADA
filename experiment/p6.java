public class Search {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        int l=0, r=arr.length-1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(linearSearch(arr, 3));
        System.out.println(binarySearch(arr, 4));
    }
}
