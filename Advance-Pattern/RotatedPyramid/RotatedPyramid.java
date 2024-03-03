/*
- Inverted & Rotated Half Pyramid

   * 
  **
 ***
****

*/

public class RotatedPyramid {
    public static void inverted_rotated_pyramid(int n) {
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // inner loop=> spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop=> stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        inverted_rotated_pyramid(4);
    }
}