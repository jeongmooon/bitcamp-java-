package std;
import java.util.Scanner;

public class calculator {
    private static Scanner kb; // 키보드

    public static void main(String args[]){
        kb = new Scanner(System.in);
        String cmd;

        do {
            System.out.print("1. 더하기 2. 빼기 3. 곱하기 4. 나누기");
            cmd = kb.nextLine();

            if("1".equals(cmd)){
                System.out.println("a+b");
                String s = kb.nextLine();
                더하기(s.split(" "));
            }
        } while (true);
    }

    public static void 더하기(String[] s) {
        int c =0;
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        c = a +b;
        System.out.println(c);
    }
}
