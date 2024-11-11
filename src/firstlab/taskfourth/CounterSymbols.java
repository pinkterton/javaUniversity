package firstlab.taskfourth;


public class CounterSymbols {
    public static void main(String[] args) {
        String text = "May the force be with you!";

        SymbolClass[] counts = getCharacterCounts(text);

        for (SymbolClass charCount : counts)
            System.out.println("Character: '" + charCount.getCharacter() + "', Count: " + charCount.getCount());
    }

    private static SymbolClass[] getCharacterCounts(final String text) {
        final int ASCII_SIZE = 128;
        int[] frequency = new int[ASCII_SIZE];

        for (char c : text.toCharArray())
            frequency[c]++;

        SymbolClass[] tempCounts = new SymbolClass[ASCII_SIZE];
        int count = 0;

        for (int i = 0; i < ASCII_SIZE; i++)
            if (frequency[i] > 0)
                tempCounts[count++] = new SymbolClass((char) i, frequency[i]);

        SymbolClass[] result = new SymbolClass[count];
        System.arraycopy(tempCounts, 0, result, 0, count);

        return result;
    }
}
