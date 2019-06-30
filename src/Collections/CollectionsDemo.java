package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("排序后："+arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转:"+arrayList);
    }
}
