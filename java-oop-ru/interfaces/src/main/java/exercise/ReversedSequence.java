package exercise;

// BEGIN
class ReversedSequence implements java.lang.CharSequence {
    private final String string;

    ReversedSequence(String string) {
        this.string = new StringBuilder(string).reverse().toString();
    }

    public int length() {
        return string.length();
    }

    public char charAt(int index) {
        return string.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return string.subSequence(start, end);
    }

    public String toString() {
        return string;
    }
}
// END
