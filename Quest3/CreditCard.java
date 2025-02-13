package Quest3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Construct
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); // copy construct
        this.balance = new Money(0); // Initialize balance to $0.00, which is where all fresh bank accounts start.
    }

    // Accessor method
    public Money getBalance() {
        return new Money(balance); // Return a new object (avoid security risk)
    }

    public Money getCreditLimit() {
        return new Money(creditLimit); // return a new object
    }

    public String getPersonals() {
        return owner.toString();
    }

    // charging method
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // pay method
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}

