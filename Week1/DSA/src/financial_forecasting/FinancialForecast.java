package financial_forecasting;

public class FinancialForecast {

    private double currentValue;
    private double annualGrowthRate;
    private int years;

    public FinancialForecast(double currentValue, double annualGrowthRate, int years) {
        this.currentValue = currentValue;
        this.annualGrowthRate = annualGrowthRate;
        this.years = years;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getAnnualGrowthRate() {
        return annualGrowthRate;
    }

    public int getYears() {
        return years;
    }
}