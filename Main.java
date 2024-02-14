public class Main {
    public static void main(String[] args) {
            System.out.println(checkValue("Questa"));
        }

    private static String checkValue(String value) {
        final String check = value.length() >= 10 ? "Lunghezza maggiore uguale a 10" : "Lunghezza minore di 10";
        return check;
    }
}
