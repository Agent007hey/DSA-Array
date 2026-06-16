public class Reverse {

  public static void Print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void reverseArray(int arr[]) {
    int n = arr.length - 1;
    int mid = arr.length / 2;
    for (int i = 0; i <= mid; i++) {
      int temp = arr[i];
      arr[i] = arr[n - i];
      arr[n - i] = temp;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40 };
    Print(arr);
    System.out.println("After Reversing the Array: ");
    reverseArray(arr);
    Print(arr);

  }
}
