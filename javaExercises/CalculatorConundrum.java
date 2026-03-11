class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {

        return switch (operation) {
            case "+" -> operand1 + " " + operation + " " + operand2 + " = " + add(operand1, operand2);
            case "*" -> operand1 + " " + operation + " " + operand2 + " = " + multiply(operand1, operand2);
            case "/" -> {
                try { yield operand1 + " " + operation + " " + operand2 + " = " + divide(operand1, operand2);
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed");
                }
            }
            case null -> throw new IllegalArgumentException("Operation cannot be null");
            case "" -> throw new IllegalArgumentException("Operation cannot be empty");
            default -> throw new IllegalOperationException("Operation " + "'" + operation + "'" + " does not exist");
        };
    }

    public int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public int multiply(int operand1, int operand2) {
        return operand1 * operand2;
    }

    public int divide(int operand1, int operand2) {
        return operand1 / operand2;
    }

    class IllegalOperationException extends Exception {
        public IllegalOperationException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) throws CalculatorConundrum.IllegalOperationException {
        CalculatorConundrum calculator = new CalculatorConundrum();
        System.out.println(calculator.calculate(10, 20, "+"));
    }


}