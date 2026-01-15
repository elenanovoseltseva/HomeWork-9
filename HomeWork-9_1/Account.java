
public abstract class Account {

    protected long balance;

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount){
        if (pay(amount) && account.add(amount)){
            System.out.println("Трансфер произведен.");
            return true;
        }
        System.out.println("Трансфер не произведен.");
        return false;
    }

    public void getBalance(){
        System.out.printf("%d%n", balance);
    }

}
