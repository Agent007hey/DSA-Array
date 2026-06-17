public class Palindrome {

  public static boolean Check(int arr[]) {
    int mid = arr.length / 2;
    int end = arr.length - 1;
    for (int i = 0; i <= mid; i++) {
      if (arr[i] != arr[end - i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 2, 1 }; // yes its a palindrome
    int arr2[] = { 1, 2, 3, 4 }; // no its not a palindrome

    System.out.println(Check(arr2));
    System.out.println(Check(arr));

  }
}
