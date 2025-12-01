public class Sign {
    private String text;
    private int size;

    public Sign(String message, int width) {
        text = message;
        size = width;
    }

    public int numberOfLines() {
        return text.length() % size + 1;
    }

    public String getLines() {
        int numLines = text.length() % size;
        int startLine = 0;
        int endLine = size;
        String splitString = "";
        while (numLines > 0) {
            splitString += (text.substring(startLine, endLine) + ";");
            endLine += size;
            startLine += size;
            numLines--;
        }
        splitString += text.substring(startLine);
        return splitString;
    }
}
