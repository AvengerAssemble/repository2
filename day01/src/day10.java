import java.util.ArrayList;
import java.util.Collections;

public class day10 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(3);

        Collections.sort(a);
        for (int i : a){
            System.out.println(i);
        }
    }

}
