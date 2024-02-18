// Print Character Pattern
/*
A
BC
DEF
GHIJ 
*/

package CharacterPattern;

public class CharacterPattern {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        // Outer Loop
        for (int line = 1; line <= n; line++) {
            // inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
