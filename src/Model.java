public class Model {

    public int[] numbers = new int[10];
    public String[] calculationString = new String[10];
    public String operation = new String("");
    public int sum;

    public void operation(String s) {
        switch (s) {
            case "+" -> operation = "addition";
            case "-" -> operation = "subtraction";
            case "*" -> operation = "multiplication";
            case "/" -> operation = "division";
        }
    }

    public void updateNumbers(int i) {
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] == 0) {
                numbers[a] = i;
                break;
            }
        }
    }

    public void updateCalculationString(String s) {
        for (int b = 0; b < calculationString.length; b++) {
            if (calculationString[b] == null) {
                calculationString[b] = s;
                break;
            }
        }
    }

    public void calculateSum() {
        switch (operation) {
            case "addition" -> {
                sum = numbers[0] + numbers[1];
            }
            case "subtraction" -> {
                sum = numbers[0] - numbers[1];
            }
            case "multiplication" -> {
                sum = numbers[0] * numbers[1];
            }
            case "division" -> {
                sum = numbers[0] / numbers[1];
            }
        }
    }
}
