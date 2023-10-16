public class RewardValue {
    double cashValue;
    int milesValue;
    public RewardValue(double cash){
        this.cashValue = cash;
        this.milesValue = (int)(cashValue / 0.0035);
    }
    public RewardValue(int miles){
        this.milesValue = miles;
        this.cashValue = miles * 0.0035;
    }

    double getCashValue(){
        return cashValue;
    }
    int getMilesValue(){
        return milesValue;
    }
    
}