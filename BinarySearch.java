public class BinarySearch {

  public static boolean Search(int arr[], int key) {
    int mid;
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      mid = start + (end - start) / 2;
      // case: found
      if (key == arr[mid]) {
        return true;
      }

      if (key < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // sorted array

    System.out.println(Search(arr, 2));
  }
}
