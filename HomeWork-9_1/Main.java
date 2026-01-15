public class Main {

    public static void main(String[] args) {
        Account current = new SimpleAccount();
        Account credit = new CreditAccount(-100_000);

        current.add(200_000);
        credit.pay(20_000);
        current.pay(2000_000);
        credit.pay(200_000);
        credit.add(100);
        current.transfer(credit, 10000);

        credit.transfer(current, 1005000);

        System.out.printf("Дебетовый счет баланс:%n%d \n.", current.balance);
        System.out.printf("Кредитный счет баланс:%n%d \n.", credit.balance);

    }
}
