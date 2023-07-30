public class Demo6c {
    public static void main(String[] args) {

        final String COLOR1 = "\033[035m";
        final String COLOR2 = "\033[033m";
        final String COLOR3 = "\033[036m";
        final String RESET = "\033[030m";
        final String BOLD = "\033[1m";
        final String BOLD_RESET = "\033[0m";

        String city1 = "Los Angeles";
        //String city2 = "New York";

        String state1 = "California";
        String state2 = "New York";

        int pop1 = 3966936;
        int pop2 = 8336817;

        String city2 = String.format("%sNew%s York", COLOR2, RESET);


        System.out.printf("%s+" + "-".repeat(15) + "+" + "-".repeat(10) + "+" + "-".repeat(10) + "+%s\n" , COLOR1, RESET);
        System.out.printf("%3$s%1$s|%2$sCITY%1$17s|%2$sSTATE%1$11s|%2$sPOPULATION%1$s|%2$s%4$s\n", COLOR1,RESET, BOLD, BOLD_RESET);
        System.out.printf("%s+" + "-".repeat(15) + "+" + "-".repeat(10) + "+" + "-".repeat(10) + "+%s\n" , COLOR1, RESET);
        System.out.printf("%1$s|%2$sLos Angeles%1$10s|%2$sCalifornia%1$6s|%2$s%4$s%3$,10d%1$s|%2$s \n", COLOR1, RESET, pop1, COLOR3);
        System.out.printf("%3$s|%4$s%1$s%3$13s|%4$s%1$s%3$8s|%4$s%5$s%2$,10d%3$s|%4$s\n", city2, pop2, COLOR1, RESET, COLOR3);
         System.out.printf("%s+" + "-".repeat(15) + "+" + "-".repeat(10) + "+" + "-".repeat(10) + "+%s\n" , COLOR1, RESET);
        
    }
}
