public class Demo6a {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 0;

        final String COLOR1 = "\033[041m";
        final String RESET = "\033[040m";
        final String COLOR2 = "\033[042m";

        System.out.printf("%s[%6d%s%s%d%-5s]%s \n",COLOR1, number1, RESET, COLOR2, number2, "%" , RESET);
    }
}
