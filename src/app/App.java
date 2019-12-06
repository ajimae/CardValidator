package app;

public class App {
    public static void main(String[] args) throws Exception {
        CardValidator cardOne = new CardValidator(4012888888881881L);
        CardValidator cardTwo = new CardValidator(1234567891012131L);

        boolean isValid = cardOne.isValid();
        boolean _isValid = cardTwo.isValid();

        System.out.println(isValid);
        System.out.println(_isValid);
    }
}
