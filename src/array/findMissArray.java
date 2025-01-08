
//to find missing no in sequential data

package array;

public class findMissArray {
    
public static void findmissing(int[] arr){

    //sort the array
    //increment temp to equal it
    //any exception will look
int n = arr.length+1;
int sum  = n*(n+1)/2;
for(int i:arr){

    sum= sum-i;
}
    for (int j : arr) {
        System.out.print(j + " ");
    }
    System.out.println(sum);

}
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,6,3,5};
        findmissing(arr);
    }
}
