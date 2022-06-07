import java.util.*;
import java.io.*;

public class PriorityQueueDemo {

    public static void main(String args[])
    {
        int intArr[]={99,66,44,40,33,250,55,200};
        PriorityQueue<Integer> pq = new PriorityQueue<>(2);
        for(int i=0;i<intArr.length;i++){
            if(pq.size()!=2) {
                pq.add(intArr[i]);
                pq.add(intArr[i+1]);
            }else if(pq.peek()<intArr[i]) {
                pq.poll();
                pq.add(intArr[i]);
                System.out.println(pq);
            }
        }
        System.out.println(pq.peek());
    }
}
