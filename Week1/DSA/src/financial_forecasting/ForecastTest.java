package financial_forecasting;

public class ForecastTest {

    public static void main(String[] args) {

        FinancialForecast forecast =
                new FinancialForecast(100000, 0.10, 5);

        double futureValue =
                ForecastCalculator.predictFutureValue(
                        forecast.getCurrentValue(),
                        forecast.getAnnualGrowthRate(),
                        forecast.getYears());

        System.out.printf("Current Value : ₹%.2f%n",
                forecast.getCurrentValue());

        System.out.printf("Growth Rate   : %.0f%%%n",
                forecast.getAnnualGrowthRate() * 100);

        System.out.println("Years         : " + forecast.getYears());

        System.out.printf("Future Value  : ₹%.2f%n",
                futureValue);
    }
}