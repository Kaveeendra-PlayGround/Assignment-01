public class Demo6d {
    public static void main(String[] args) {
        final String COLOR1 = "\033[035m";
        final String RESET = "\033[030;0m";
        final String BOLD = "\033[1m";
        final String COLOR2 = "\033[036m";
        final String COLOR3 = "\033[032m";

        String item1 = "Apple";
        String item2 = "Orange";

        int qty1 = 10;
        int qty2 = 5;

        float price1 = 0.99f;
        float price2 = 1.49f;

        System.out.printf("%s+" + "-".repeat(10) + "+" + "-".repeat(8) + "+" + "-".repeat(5) + "+%s\n", COLOR1,RESET) ;
        System.out.printf("%3$s|%2$s%1$sITEM%2$14s%3$s|%2$s%1$sQUANTITY%2$s%3$s|%2$s%1$sPRICE%2$s%3$s|%2$s\n", BOLD, RESET, COLOR1);
        System.out.printf("%1$s+%3$s" + "-".repeat(10) + "%1$s+" + "-".repeat(8) + "+%3$s" + "-".repeat(5) + "%1$s+%2$s\n", COLOR1,RESET, COLOR3) ;
        System.out.printf("%3$s|%2$s%1$-10s%3$s|%2$s%4$8d%3$s|%2$s%6$s$%7$s%5$.2f%3$s|%2$s\n", item1, RESET, COLOR1, qty1, price1, COLOR2, COLOR3);
        System.out.printf("%3$s|%2$s%1$-10s%3$s|%2$s%4$8d%3$s|%2$s%6$s$%7$s%5$.2f%3$s|%2$s\n", item2, RESET, COLOR1, qty2, price2, COLOR2, COLOR3);
        System.out.printf("%1$s+%3$s" + "-".repeat(10) + "%1$s+" + "-".repeat(8) + "+%3$s" + "-".repeat(5) + "%1$s+%2$s\n", COLOR1,RESET, COLOR3) ;

    }
}
