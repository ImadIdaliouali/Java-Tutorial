public class App {
    public static void main(String[] args) {
        char[] c1 = { 'i', 'm', 'a', 'd' };
        char[] c2 = { 'i', 'm', 'a', 'd' };
        char[] c3 = c1;
        if (c1 == c2)
            System.out.println("c1 == c2");
        if (c1 == c3)
            System.out.println("c1 == c3");
        if (c2 == c3)
            System.out.println("c2 == c3");
    }
}
