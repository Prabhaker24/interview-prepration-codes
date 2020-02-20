package list;

import java.util.ArrayList;
import java.util.List;

public class SampleList {

    public static void main(String[] args) {
        List<Integer> temp=new ArrayList<>(10);
        temp.add(3);
        temp.add(4);
        System.out.println("size = "+ temp.size());
        temp.forEach(x-> System.out.println(x));
        System.out.println("value at index 0 ="+temp.get(0));
        temp.set(0,40);
        System.out.println("value at 0 changed to = " +temp.get(0));

        Integer[] temparray=temp.toArray(new Integer[temp.size()]);

        System.out.println("value of length = "+temparray.length);
        for(int i:temparray)
        {
            System.out.println("value = "+i);
        }
    for (int i:temp)
    {
        System.out.println("value of list = "+i);
    }
temp.remove(0);
        System.out.println(temp.contains(40));
    }

}
