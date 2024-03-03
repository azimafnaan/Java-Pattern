/*
- Inverted Half Pyramid with Number
12345
1234
123
12
1
*/

public class InvertedPyramid {
    public static void inverted_Half_Pyramid(int n) {
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_Half_Pyramid(5);
    }
}
