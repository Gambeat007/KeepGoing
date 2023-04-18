package algorithms;

public class RunLengthEncoding {
    private static final StringBuilder stringBuilder = new StringBuilder();

    public static String encode(String input) {
        for (int i = 0; i < input.length(); i++) {
            int count = 1;
            while (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }
            stringBuilder.append(input.charAt(i)).append(count);
        }
        return stringBuilder.toString();
    }

    public static String decode(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                int count = Character.getNumericValue(input.charAt(i));
                while (--count > 1) {
                    stringBuilder.append(input.charAt(i - 1));
                }
            } else {
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String toEncode = "aabbbccccdddddeeeeee";
        String toDecode = "a2b3c4d5e6";

        System.out.println(encode(toEncode));
        System.out.println(decode(toDecode));
    }
}
