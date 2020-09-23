public class Model {
    public String[] numbers = new String[10];

    public String[] numbers(String i) {
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == null) {
                numbers[j] = i;
                break;
            }
        }
        return numbers;
    }
}
