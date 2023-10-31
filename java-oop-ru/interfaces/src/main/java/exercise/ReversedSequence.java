package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String normalString;
    private String reversedString;

    public ReversedSequence(String str) {
        this.normalString = str;
        this.reversedString = reverseString(str);
    }

    public char charAt(int index) {
        return reversedString.charAt(index);
    }

    public int length() {
        return reversedString.length();
    }

    public ReversedSequence subSequence(int start, int end) {
        String substring = reversedString.substring(start, end);
        return new ReversedSequence(reverseString(substring));
    }

    public String toString() {
        return reversedString;
    }

    private String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
}
// END
