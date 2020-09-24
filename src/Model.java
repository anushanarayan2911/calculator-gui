public class Model {

    public int[] numbers = new int[10];
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

    public void numbers(int i) {
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] == 0) {
                numbers[a] = i;
                break;
            }
        }
    }

    public void calculateSum() {
        System.out.print(numbers[0]);
        System.out.print(numbers[1]);
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
