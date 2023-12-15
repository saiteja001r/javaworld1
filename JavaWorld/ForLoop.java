package JavaWorld;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int j = 1; j <= 10;j++) {
            System.out.println(j);
            sum = sum + j;
        }
        System.out.println("the sum of the first natural num is " + sum);
}
}
