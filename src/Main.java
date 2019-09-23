import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/9/16 21:11
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList <>();
        while (input.hasNextInt()) {
            arrayList.add(input.nextInt());
        }
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) < arrayList.get(i + 1)) {
                arrayList.remove(i + 1);
            }
        }
        Object[] arr = arrayList.toArray();
        boolean judge = false;
        for (int i = 0; i < arr.length; i++) {
            if ((int)arr[i] > (int)arr[i + 1]) {
                judge = true;
            }
        }
        if (judge) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
