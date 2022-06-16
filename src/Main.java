public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double creditSum = 1_000_000; //сумма кредита
        double years = 1; //срок кредита в годах
        double yearInterest = 9.9; //годовая проценная ставка
        double paymentSum; //сумма платежа
        paymentSum = service.calculate(creditSum, yearInterest, years);
        System.out.println("Сумма кредита: " + creditSum);
        System.out.println("Годовая процентная ставка: " + yearInterest);
        System.out.println("Срок кредита в годах: " + years);
        System.out.println("Ваш ежемесячный платеж: " + (int)paymentSum);
    }
}