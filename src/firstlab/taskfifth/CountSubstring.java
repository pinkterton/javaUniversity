package firstlab.taskfifth;

public class CountSubstring {
    public static void main(String[] args) {

        String[][] matrix = {
                {"magazine", "blanket", "apple", "grape"},
                {"laptop", "grape", "microphone", "linux"},
                {"banana", "testament", "palliative", "dwell"},
                {"jack-o-lantern", "house", "daze", "godawful"}
        };

        String substring = "gra";

        try {
            final int count = countSubstringInMatrix(matrix, substring);
            System.out.println("Number of occurrences: " + count);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int countSubstringInMatrix(final String[][] matrix, final String substring) {
        if (matrix == null || substring == null || substring.isEmpty())
            throw new IllegalArgumentException("Matrix or substring cannot be null or empty.");

        int count = 0;
        int fromIndex = 0;
        for (String[] row : matrix) {
            for (String element : row) {
                while ((fromIndex = element.indexOf(substring, fromIndex)) != -1) {
                    count++;
                    fromIndex += substring.length();
                }
            }
        }
        return count;
    }
}