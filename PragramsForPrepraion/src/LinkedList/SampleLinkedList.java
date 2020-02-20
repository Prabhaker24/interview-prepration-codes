package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SampleLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
ll.addFirst(1);
ll.addFirst(2);
ll.add(3);
ll.addLast(23);

Iterator it=ll.iterator();
while(it.hasNext())
   {
     //  System.out.println(it.next());
       int x= (int) it.next();
       if(x==1) {
           it.remove();
           continue;
       }
       System.out.println(x);
   }
 // System.out.println(ll.get(2));
    }

}