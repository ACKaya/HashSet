import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet=new HashSet<>();
        hSet.add(12);
        hSet.add(10);
        hSet.add(17);
        hSet.add(30);
        hSet.add(35);
        hSet.contains(10);
        System.out.println(hSet.isEmpty());
        System.out.println(hSet.size());

       Iterator<Integer> a=hSet.iterator();
       while(a.hasNext()){
           System.out.println(a.next());
       }

    }
}
