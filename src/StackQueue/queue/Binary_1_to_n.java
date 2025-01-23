
//To find binary values for given number from 1 to n
//ex: n=3
// 01,10,11



package StackQueue.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Binary_1_to_n {

public String[] numToBinary(int num) {
    String[] res = new String[num];
    Queue<String> q= new LinkedList<>();
    q.offer("1");
    for (int i = 0; i < num; i++) {
        res[i] = q.poll();
        String n1 = res[i] + "0";
        String n2= res[i]+"1";
        q.offer(n1);
        q.offer(n2);
    }
    return res;
}
    public static void main(String[] args) {
   Binary_1_to_n bin = new Binary_1_to_n();
 String re = Arrays.toString(bin.numToBinary(12));
        System.out.println(re);
    }
}
