public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }

        System.out.println(steps);
    }
}
