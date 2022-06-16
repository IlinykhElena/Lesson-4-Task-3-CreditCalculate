public class CreditPaymentService {
    public double calculate(double creditSum, double yearInterest, double years){
        double mounthInterest = yearInterest/1200;
        double mounthAmount = years * 12;
        double paymentSum = creditSum * (mounthInterest + mounthInterest / (Math.pow((mounthInterest + 1), mounthAmount) -1));
        return paymentSum;
    }
}
