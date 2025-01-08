
//reverse the  array

package array;

public class reverseArr {

    public  static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println("end");
    }
    public static int[] reverseArray(int[] arr){
// method 1
int start = 0;
int n= arr.length;
int end = n-1;
 while (start<end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end]=temp;
    start++;
    end--;
 }
//  method 2  
//  int n = arr.length;
   int j=0;     
   int[] result = new int[n];
        for(int i =n-1;i>=0;i-- ){
result[j] = arr[i];
j++;        
        }
return arr;
    }
    public static void main(String[] args) {
        int [] arr = {2,11,5,10,7,8};
        printArray(arr);
       printArray(reverseArray(arr));
    
    }
}
