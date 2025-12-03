public class Sign {
    private String text;
    private int size;

    public Sign(String message, int width) {
        text = message;
        size = width;
    }

    public int numberOfLines() {
        int numLines;
        if (text.isEmpty()) numLines = 0;
        else if (text.length() <= size) numLines = 1;
        else if (text.length() % size == 0) numLines = text.length() / size;
        else numLines = text.length() / size + 1;
        return numLines;
    }

    public String getLines() {
        int numLines = numberOfLines();
        int startLine = 0;
        int endLine = size;
        String splitString = "";
        if (text.isEmpty()) return null;
        while (numLines > 1) {
            splitString += (text.substring(startLine, endLine) + ";");
            endLine += size;
            startLine += size;
            numLines--;
        }
        splitString += text.substring(startLine);
        return splitString;
    }
}
