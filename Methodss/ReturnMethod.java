package Methodss;

public class ReturnMethod {
    static int mymethod( int a) {
        return 5 + a;
    }

    public static void main(String[] args) {
        int value = mymethod(6);
        System.out.println(value);

    }
}
