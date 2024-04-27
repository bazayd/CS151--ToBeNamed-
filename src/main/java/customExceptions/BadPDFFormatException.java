package customExceptions;

public class BadPDFFormatException extends IllegalArgumentException {
    public BadPDFFormatException () {
        this ("");
    }

    public BadPDFFormatException (String text) {
        super ("bad pdf format. " + text);
    }
}
