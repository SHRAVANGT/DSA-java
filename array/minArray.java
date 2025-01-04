
//to find minimum in array

package array;

public class minArray {
    public  static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println("end");
    }
    public static void findMin(int[] arr){
//edge
if(arr == null||arr.length ==0){
    throw new IllegalArgumentException("invalid");
}


//min=arr[0]
//traverse array and if next is smaller than eq min=arr[i]
//then increment 

int min = arr[0];
for(int i=1;i<arr.length;i++){
    if (min<arr[i]) {
        
    }else {
        min = arr[i];
        
    }
    System.out.println("minimum is "+min);
}

    }
    public static void main(String[] args) {
        int[] arr = {5,9,3,2,2,6,1,0};
        printarray(arr);
    findMin(arr);
    }
}
