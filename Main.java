/**
 * method to see if all digits are odd
 * 
 * @author Darian
 */
public class Main {
  // method allDigitsOdd to see if all digits are odd
  public static boolean allDigitsOdd(int num) {
    // repeat as long as number is greater or less than zero
    while (num > 0 || num < 0) {
      // digit becomes remainder
      int digit = (num % 10);
      // divide num by 10 to move onto the next digit
      num /= 10;

      // if digit is even return false
      if (digit % 2 == 0) {
        return false;
      }
    }
    // if all the digits cannot be divided by 2, return true
    return true;
  }

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // delcare a new variable called odd to store the answer of true or false
    boolean odd = allDigitsOdd(314561);
    // print to the screen whether allDigitsOdd is true or false
    System.out.println(odd);

  }
}
