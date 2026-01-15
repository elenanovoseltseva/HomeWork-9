public class SimpleAccount extends Account {

    @Override
    public boolean add(long amount) {
        balance += amount;
        System.out.printf("Дебетовый счет баланс после добавления %d \n", balance);
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Дебетовый счет баланс после списания %d \n", balance);
            return true;
        }
        System.out.println("Дебетовый счет ушел в минус.");
        return false;
    }
}
