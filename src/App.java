public class App {
    public static void main(String[] args) {
        int a = 5;
        if (a > 5) {
            a++;
        } else if (a > 2) {
            a--;
        } else {
            a *= 2;
        }
        System.out.println("a = " + a);
    }
}
