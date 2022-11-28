package classTask;

public class DigitIdentifier {

    public int identifyDigit(String string) {
        int numberOfDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                numberOfDigits++;
            }
        }
//        String text = string.replaceAll("\\d", "");
        return numberOfDigits;
    }
//    public int identifyDigits(String string) {
//        String numbers = "1234567890";
//        int numberOfDigits = 0;
//
//        for (int i = 0; i < string.length(); i++) {
//            if (numbers.contains(String.valueOf(string.charAt(i))){
//                numberOfDigits++;
//            }
//        }
////        String text = string.replaceAll("\\d", "");
//        return numberOfDigits;
//    }
}
