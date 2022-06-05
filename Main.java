import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    /**

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

EX: 
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

    **/

    char[] word = {'h','e','l','l','o'};

    reverseString(word);

    System.out.println(Arrays.toString(word));



    /**
      SOLUTION:
    - First create two int pointers to aid in solving the problem, start, and end, that represent the first and last indices of char[] s.
    - While (start < end), swap the first and last elements until the pointers cross, meeting the break condition.


    PS: This solution utilizes a utility/helper method that serves as a intuitive swapping algorithm between elements of the char[] arr, and uses a temporary char temp variable to facilitate in the swap.

    **/
  }


  public static void reverseString(char[] s) {

    int start = 0;
    int end = s.length-1;

    while (start < end)
      {
        swap(s, start, end);

        start++;
        end--;
      }
        
    }


  private static void swap(char[] arr, int first, int second)
  {
    char temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}