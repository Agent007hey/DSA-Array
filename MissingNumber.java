public class MissingNumber {

  public static int Miss(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] != arr[i] + 1) {
        return arr[i] + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5, 6, 7 }; // array is sorted (1 to n)

    System.out.println(Miss(arr));

  }
}
