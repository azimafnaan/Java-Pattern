// print 
/*
1
12
123
1234

*/

package HalfPyramidPattern;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int line = 1; line <= n; line++) {
            // Number Print
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
