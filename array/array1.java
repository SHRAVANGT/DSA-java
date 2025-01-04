
//declaration and printing array

package array;
public class array1 {
    public void printArray(int[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(""+arr[i]);
        }
    }
    public void demo()
    {
        int[] n = {1,2,3};
        printArray(n);
    }
    public static void main(String[] args) {
        array1 newarray = new array1();
        newarray.demo();
    }
}
