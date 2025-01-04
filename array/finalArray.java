
// Its a summary of basic array operations , here array is pre-defined and choice is user-defined to choose the different operations mentioned 

package array;

import java.util.Scanner;

public class finalArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void removeEven(int[] array) {
        printArray(array);
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] temp = new int[oddCount];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                temp[j] = array[i];
                j++;
            }
        }
        printArray(temp);
    }

    public static void findMin(int[] array) {
        printArray(array);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("minimum is " + min);
    }

    public static void reverseArray(int[] array) {
        printArray(array);
        int n = array.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        printArray(array);
    }

    public static void moveZeroArray(int[] array) {
        printArray(array);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else if (array[j] != 0) {
                j++;
            }

        }
        printArray(array);
    }

    public static void secMaxArray(int[] array) {
        printArray(array);
        int max = array[0];
        int secmax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                secmax = max;
                max = array[i];
            } else if (array[i] > secmax && array[i] == max) {
                secmax = array[i];

            }
        }
        System.out.println("second max is " + secmax);
    }

    public static void resizeArray(int[] array) {
        printArray(array);
        int target = 8;
        int j = 0;
        int[] temp = new int[target];
        for (int i = 0; i < array.length; i++) {
            temp[j] = array[i];
            j++;
        }
        printArray(temp);
    }

    public static void findMissArray(int[] array) {
        printArray(array);
        int n = array.length;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum -= i;
        }
        System.out.println("missing is " + sum);
    }

    public static void choiceProcess(int choice) {
        switch (choice) {
            case 1:
                System.out.println("You choose to remove even digits from array");
                int[] array1 = { 2, 3, 6, 5, 1, 8, 6 };
                removeEven(array1);
                break;
            case 2:
                System.out.println("You choose to find minimum element in  array");
                int[] array2 = { 8, 12, 56, 3, 8, 1, 0 };
                findMin(array2);
                break;
            case 3:
                System.out.println("You choose to reverse array");
                int[] array3 = { 8, 12, 56, 3, 8, 1, 0 };
                reverseArray(array3);
                break;
            case 4:
                System.out.println("You choose to move all zeros to end of an array");
                int[] array4 = { 8, 0, 56, 0, 8, 1, 0, 2 };
                moveZeroArray(array4);
                break;

            case 5:
                System.out.println("You choose to find second maximum in array");
                int[] array5 = { 8, 12, 56, 3, 8, 1, 0 };
                secMaxArray(array5);
                break;
            case 6:
                System.out.println("You choose to reverse array");
                int[] array6 = { 8, 12, 1, 0 };
                resizeArray(array6);
                break;
            case 7:
                System.out.println("You choose to find missing in sequential array");
                int[] array7 = { 4, 2, 5, 1, 3, 7, 9, 8 };
                findMissArray(array7);
                break;
            default:
                System.out.println("Choose correctly");
                break;
        }
    }

    public static int userIn() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter choice");
        System.out.println(
                "1-remove even in array 2-find minimum digit value in array 3-reverse the array 4-move all zeros to end of array 5-find second maximum in array 6-resize the array 7-find the missing in array");
        int choice = obj.nextInt();
        obj.close();
        return choice;
    }

    public static void main(String[] args) {
        int choice = userIn();
        choiceProcess(choice);
    }
}
