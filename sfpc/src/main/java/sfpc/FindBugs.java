package sfpc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lili
 * @date 2020/12/4 12:16
 * @see
 * @since
 */
public class FindBugs {
    public static void main(String[] args) {
        String a = null;
        a.substring(0, 1);
        List<String> a2 = null;
        a2.size();
        List<String> l = new ArrayList<>();
        //java8 code
        String s = l.stream().filter(x -> x.equals("1")).findFirst().get();

    }
}
