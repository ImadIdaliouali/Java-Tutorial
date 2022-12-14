public class App {
    public static void main(String[] args) {
        String name = "imad";
        String nom = "imad";
        System.out.println(name.equals(nom) ? "ok" : "not ok");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
            System.out.println(name.indexOf(name.charAt(i)));
        }
    }
}
