public class Demo6b {
    public static void main(String[] args) {

        String name1 = "Alice";
        String name2 = "Bob";
        int age1 = 24;
        int age2 = 30;
        final String COLOR1 = "\033[034m";
        final String COLOR2 = "\033[035m";
        final String COLOR3 = "\033[033m";
        final String RESET = "\033[030m";
        System.out.printf("%s+"+"-".repeat(10) + "+" + "-".repeat(3) + "+%s\n", COLOR2, RESET);
        System.out.printf("|%sNAME%12s|%sAGE%s|\n",COLOR1,RESET,COLOR1,RESET);
        System.out.printf("%s+"+"-".repeat(10) + "+" + "-".repeat(3) + "+%s\n", COLOR2, RESET);
        System.out.printf("%3$s|%4$s%1$-10s%3$s|%5$s%2$3d%3$s|%4$s\n",name1, age1, COLOR2, RESET, COLOR3);
        System.out.printf("%s+"+"-".repeat(10) + "+" + "-".repeat(3) + "+%s\n", COLOR2, RESET);
        System.out.printf("%3$s|%4$s%1$-10s%3$s|%5$s%2$3d%3$s|%4$s\n",name2, age2, COLOR2, RESET, COLOR3);
        System.out.printf("%s+"+"-".repeat(10) + "+" + "-".repeat(3) + "+%s\n", COLOR2, RESET);
    }
}
