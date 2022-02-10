public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();
          int oneYear = (int)payment.calculate(9.99, 12, 1_000_000);
        System.out.println("Ежемесячный платёж " + oneYear);

        int twoYear = (int) payment.calculate(9.99, 24, 1_000_000);
        System.out.println("Ежемесячный платёж " + twoYear);

        int threeYear = (int) payment.calculate(9.99, 36, 1_000_000);
        System.out.println("Ежемесячный платёж " + threeYear);
    }
}
