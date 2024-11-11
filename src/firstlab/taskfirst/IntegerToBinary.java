package firstlab.taskfirst;

public class IntegerToBinary {
        public static void main(String[] args) {
            int number = 3;

            System.out.println(convertToBinary(number));
            ;
        }
        private static String convertToBinary(int number) {
            StringBuilder binaryNumber = new StringBuilder(" ");
            if (number == 0)
                return "0";
            while (number > 0) {
                int tempNumber = number % 2;
                binaryNumber.insert(0, tempNumber);
                number /= 2;
            }
            return binaryNumber.toString();
    }
}

