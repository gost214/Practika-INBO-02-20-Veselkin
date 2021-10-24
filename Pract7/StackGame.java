package Pract7;
import java.util.Stack;
public class StackGame {
    Stack<Integer> fp, sp;

    public StackGame(String fp, String sp) {
        this.fp = new Stack<>();
        this.sp = new Stack<>();
        for (int i = 4; i >= 0; i--) {
            this.fp.push(Integer.parseInt(fp.substring(i, i + 1)));
            this.sp.push(Integer.parseInt(sp.substring(i, i + 1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item) {
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play() {
        int count = 0;
        while (!fp.isEmpty() && !sp.isEmpty() && count <= 106) {
            if ((fp.peek() > sp.peek() || (fp.peek() == 0 && sp.peek() == 9)) && !(fp.peek() == 9 && sp.peek() == 0)) {
                pushBack(fp, fp.pop());
                pushBack(fp, sp.pop());
            } else {
                pushBack(sp, sp.pop());
                pushBack(sp, fp.pop());
            }
            count++;
        }
        String res = "";
        if (count >= 106) res += "Botva";
        else {
            if (fp.isEmpty()) res += "Second ";
            else res += "First ";
            res += count;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new StackGame("13579", "24680").play());
        System.out.println(new StackGame("67890", "12345").play());
        System.out.println(new StackGame("13029", "42685").play());
    }
}

