public class Demo5 {
    public static void main(String[] args) {
        int number1 = 978;
        int number2 = 3;
        int number3 = 16;
        int number4 = 1484100;

        final String RESET = "\033[030m";
        final String COLOR = "\033[36m";


        System.out.printf("%1$s%3$d%2$s-%1$s%4$d%2$s-%1$s%5$d%2$s-%1$s%6$d%2$s \n", COLOR, RESET, number1, number2, number3, number4);
    }
}
