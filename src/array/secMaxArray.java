
//to find the second max in array

package array;

public class secMaxArray {

    public static void secMax(int[] arr){
//method 1

int max = arr[0];
 int n = arr.length;
int secmax1 = 0;
for(int i=1;i<n;i++){
    if(max<arr[i]){
        secmax1 = max;
        max=arr[i];
    }else if(secmax1<arr[i] && arr[i]!=max){
        secmax1 = arr[i];
    }
    
}
System.out.println("m2 "+secmax1 + "max "+max);
        //method 2
//  int max = arr[0];
//  int n = arr.length;
 int count=0;
 for(int i=1;i<n;i++){
    if(max<arr[i]){
        max=arr[i];
        count++;
    }
 }

 int[] newarr = new int[n-count];
 int j=0;
 for(int i=0;i<n;i++){
    if(arr[i]!=max){
        newarr[j] =arr[i];
        j++;
    }
 }
 int m = newarr.length;
 int secmax = newarr[0];
 for(int i=1;i<m;i++){
    if(secmax<newarr[i]){
        secmax=newarr[i];
    }
 }
 System.out.println("m1 "+secmax);
    }
    public static void main(String[] args) {
        int [] arr = {12,35,2,34,33,1};
    secMax(arr);
    }
}
