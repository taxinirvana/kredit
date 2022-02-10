public class CreditPaymentService {
      public double calculate(double interestRateint, int creditTerm, int amount) {
        double percent = interestRateint / 100 / 12;
        double a = Math.pow(1+percent, creditTerm);
        double payment = (amount *  (percent + (percent / (a - 1))));


        return payment;
    }
}
