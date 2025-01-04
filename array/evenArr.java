
//delete even no in array and print odd in array

package array;

public class evenArr {

public void evenRemover(int[] arr){
    int n = arr.length;
    int count=0;
    for(int i=0;i<n;i++){
    if(arr[i]%2!=0){
count++;    }}
int j=0;
int[] result  = new int[count];
for(int i=0;i<n;i++){
    if(arr[i]%2!=0){
        result[j] = arr[i];
        j++;
    }
}
printArray(result);
}
    public void printArray(int[] n){

    for(int i=0;i<n.length;i++){
System.out.println(n[i]+"");
        }    }


    public void declareArray(){
        int[] newarray = {3,2,4,7,10,6,5};
        evenRemover(newarray);
    }
    public static void main(String[] args) {
        evenArr obj = new evenArr();
        obj.declareArray();
    }
}
