package array;
public class array{

    public void declareArray(){
//Declaration of array and initialization
int[] arr = new int[3];
int[] arr1 = {1,2,3};
updateArray(arr,arr1);    
}
//when we initialise the array,default values are zero-0.
//
public void updateArray(int[] arr,int[] arr1){
//update and insertion
arr[0]=1;
arr1[2]=6;
int[] arr2 = {5,6,7};
printArray(arr);
printArray(arr1);
printArray(arr2);
}public void printArray(int[] arr){
for(int i=0;i<arr.length;i++){
System.out.println("arr "+arr[i]);

}System.out.println("ends");
}
public static void main(String[] args){
array a = new array();
a.declareArray();
}

}

