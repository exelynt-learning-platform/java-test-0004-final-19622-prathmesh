public class JAVA_TEST_0004 {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int layer = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                int value = n - layer;
                if (j == 0) {
                    System.out.print(value);
                } else {
                    System.out.print(" " + value);
                }
            }
            System.out.println();
        }
    }
}