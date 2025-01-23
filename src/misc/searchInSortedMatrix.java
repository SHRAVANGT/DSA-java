
// search the given number in sorted matrix

package misc;

public class searchInSortedMatrix {

    public void  search(int[][] matrix,int n,int target) {
        System.out.println(n);
        int i = 0;
        int j = n-1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("found at-"+i+","+j);
                return;
            }
            if (matrix[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("not found");
    }

public  static void  main(String[] args){
     int[][]matrix={{1,3},{2,4}};
    searchInSortedMatrix obj = new searchInSortedMatrix();
    obj.search(matrix,matrix.length,2);
}


}
