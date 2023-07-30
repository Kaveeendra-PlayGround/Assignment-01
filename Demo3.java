public class Demo3 {
    public static void main(String[] args) {
        int myInt1 = 123;
        int myInt2 = 456;
        int myInt3 = 789;

        final String COLOR = "\033[46m";
        final String RESET = "\033[40m";
        System.out.printf("%s(%d)%s%4d-%d\n",COLOR,myInt1,RESET,myInt2,myInt3);
    }
}
