package ArrayAndString;

public class ChangeElement {
    public static void main(String[] args) {
        int[][] mynum = {{5,6,4,5}, {8,5,8,7}};
        mynum[1][3] = 9;
        mynum[0][3] = 3;
        System.out.println(mynum[1][3]);
        System.out.println(mynum[0][3]);
    }
}
