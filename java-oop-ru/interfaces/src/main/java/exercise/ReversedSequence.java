package exercise;

// BEGIN
class ReversedSequence implements CharSequence {
    private String text;

    ReversedSequence(String text) {
        StringBuilder s  = new StringBuilder(text);
        this.text = s.reverse().toString();
    }

    public int length() {
        return text.length();
    }

    public char charAt(int index) {

        return text.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return text.subSequence(start, end);
    }

    public String toString() {
        return text;
    }

}
// END
