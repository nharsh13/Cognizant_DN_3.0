
public class FinancialForecasting {

    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: 
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }
    public static void main(String[] args) {
        double initialValue = 1000; 
        double growthRate = 0.05;   
        int years = 10;            
        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("The future value after %d years is: %.2f%n", years, futureValue);
    }
}
  
