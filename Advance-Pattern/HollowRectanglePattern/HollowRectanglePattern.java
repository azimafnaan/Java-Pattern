/*
Print Hollow Rectangle Pattern
*****
*   *
*   *
***** 

*/

public class HollowRectanglePattern {
    public static void hollo_rectangle(int totalRows, int totalCols) {
        // OuterLoop
        for (int i = 1; i <= totalRows; i++) {
            // innerLoop-column
            for (int j = 1; j <= totalCols; j++) {
                // cell - (i, j)
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollo_rectangle(4, 5);
    }
}