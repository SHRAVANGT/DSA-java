package array;

//to move the zeros to last or endof array

public class moveZeroArray {
    public static void printArray(int[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void moveZero(int[] arr){
int n = arr.length;
int j=0;   
for(int i=0;i<n;i++){
if(arr[i]!=0&&arr[j]==0){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
if(arr[j]!=0){
    j++;
}

   } printArray(arr);
        }
    public static void main(String[] args) {
        int[] arr = {0,2,0,0,0,1};
    moveZero(arr);
    }
}
