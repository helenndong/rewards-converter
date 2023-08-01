public class RewardValue {

    double cashValue;
    int milesValues;

    final double CONVERSION_RATE = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValues = milesValue;
    }

    public double getCashValue() {
        return milesValues * CONVERSION_RATE ;
    }
    public int getMilesValue() {
        return (int) (cashValue / CONVERSION_RATE);
    }
}
