import java.time.LocalDateTime;

public class CreditAccount extends Account {

    public long maxLimit;

    public CreditAccount(long maxLimit) {
        this.maxLimit = maxLimit;
        super();
    }

    @Override
    public boolean add(long amount) {

        if (balance + amount <= 0){
            balance += amount;
            System.out.printf("Кредитный счет баланс после добавления %d \n", balance);
            return true;
        }
        System.out.println("Кредитный счет ушел в плюс.");
        return false;
    }

    @Override
    public boolean pay(long amount) {

        if (balance - amount >= maxLimit){
            balance -= amount;
            System.out.printf("Кредитный счет баланс после списания %d \n", balance);
            return true;
        }
        System.out.println("Кредитный счет перевалил лимит.");
        return false;
    }

}

