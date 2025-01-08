
//to resize array

package array;

public class resizeArray {
 public static void printarray(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 }
    public static int[] resize(int[] arr,int target){
int[] temp = new int[target];
for(int i=0;i<arr.length;i++){
    temp[i] = arr[i];
}
return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printarray(arr);
        printarray(resize(arr,8));
    }
}
