public class Demo4 {
    public static void main(String[] args) {
        int month =12;
        int date =28;
        int year =2023;
        int hour =23;
        int minute =59;
        int second =59;
        final String COLOR1 = "\033[031m";
        final String COLOR2 = "\033[032m";
        final String COLOR3 = "\033[033m";
        final String COLOR4 = "\033[034m";
        final String COLOR5 = "\033[035m";
        final String COLOR6 = "\033[036m";
        final String RESET  = "\033[030m";
        System.out.printf("%s%d/%s%d/%s%d%s%3d:%s%d:%s%d \n",COLOR1,month,COLOR2,date,COLOR3,year,COLOR4,hour,COLOR5,minute,COLOR6,second);
    }
}
