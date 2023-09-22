package Enum;
// Нереализованная фича
public enum Answer {
    YES('y'),
    NO('n');
    private final char value;

    Answer(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
