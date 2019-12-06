package app;

/**
 * CreditCardValidator
 */
public class CardValidator {
  private long numbers;

  public CardValidator(long numbers) {
    this.numbers = numbers;
  }

  public int[] convertToIntegerArray() {
    String[] stringArray = Long.toString(this.numbers).split("");
    int[] integerArray = new int[stringArray.length];
    for(int i = 0; i < stringArray.length; i++) {
      integerArray[i] = Integer.parseInt(stringArray[i]);
    }

    return integerArray;
  }

  public static int[] doubleAlternateDigit(int[] digit) {
    for(int i = digit.length - 2; i >= 0; i -= 2) {
      if((digit[i] * 2) > 9)
        digit[i] = (digit[i] % 10) + 1;
      else
        digit[i] = digit[i] * 2;
    }

    return digit;
  }

  public static boolean check(int[] digit) {
    int sum = 0;
    for(int i : digit) {
      sum += i;
    }

    return (sum % 10 == 0);
  }

  public boolean isValid() {
    int[] intArray = this.convertToIntegerArray();
    int[] digitsArray = doubleAlternateDigit(intArray);

    boolean check = CardValidator.check(digitsArray);

    return check;
  }
}