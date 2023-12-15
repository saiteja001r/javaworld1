package JavaWorld;

public interface If2 {
    public static void main(String[] args) {
        int score = 49;
                if ( score > 90) {
                    System.out.println("grade A");
                } else if (score >70) {
                    System.out.println("grade B");
                    } else if (score > 60) {
                    System.out.println("grade C");
                } else if (score > 50) {
                    System.out.println("grade D");
    }else {
            System.out.println("fail");
        }
    }
}
