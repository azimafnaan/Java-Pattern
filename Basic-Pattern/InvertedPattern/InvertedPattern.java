// Print Inverted Star Pattern
/*

****
***
**
*

*/

package InvertedPattern;

public class InvertedPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int s = 1; s <= 4 - i + 1; s++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
