
//implement max priority queue using binary heap (represented by array)
//bottom-up reheapify (swim)
//top-down    "    "   (sink)


package BinaryTree;


import java.util.Arrays;

public class MaxHeap {

    private Integer[] maxHeap;
    private int size;

    public MaxHeap(int capacity) {
        maxHeap = new Integer[capacity+1]; //index 0 is kept empty
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public void insert(int value) {
        if (size == maxHeap.length-1) {
            resize(2*maxHeap.length);
        }
        size++;
        maxHeap[size] = value;
        swim(size);
    }
    private void resize(int i) {
//        maxHeap = Arrays.copyOf(maxHeap, maxHeap.length*2);
        Integer[] temp = new Integer[i];
        for(int j = 0; j < maxHeap.length; j++) {
            temp[j] = maxHeap[j];
        }
        maxHeap = temp;
    }
    public void swim(int k) {
        while (k > 1 && maxHeap[k/2] < maxHeap[k]) {
            int temp = maxHeap[k];
            maxHeap[k] = maxHeap[k/2];
            maxHeap[k/2] = temp;
            k = k/2;
        }
    }
    public int delete() {
int mx = maxHeap[1];
        swap(1,size);
        size--;
        sink(1);
        maxHeap[size+1] = null;
        if (size > 0 && size == (maxHeap.length - 1) / 4) {
            resize(maxHeap.length / 2);
        }

        return mx;
    }
public void sink(int k) {
        while (2*k <= size) {
            int j = 2*k;
            if(j<size && maxHeap[j] < maxHeap[j+1]) {
                j++;
            }
            if (maxHeap[k] >= maxHeap[j]) {
                break;
            }
            swap(k,j);
            k = j;
        }
}
    public void swap(int mx,int k) {
        int tmp= maxHeap[k];
        maxHeap[k] = maxHeap[mx];
        maxHeap[mx] = tmp;

    }


    public void print() {
        if (isEmpty()) {
            System.out.println("Empty Tree");
        }
        else {
            for (int i = 1; i < maxHeap.length; i++) {
                System.out.print(maxHeap[i]+" ");

            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        MaxHeap max = new MaxHeap(3);
        System.out.println(max.size());

        max.insert(5);
        max.insert(2);
        max.insert(6);
        max.insert(7);
        max.print();
        System.out.println(max.isEmpty());
        max.print();
        System.out.println(max.delete());
        max.print();
    }
}
