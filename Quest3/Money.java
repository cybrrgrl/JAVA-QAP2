package Quest3;


public class Money {
    private long dollars;
    private long cents;

    // constructor for the double amount
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    // Copy constructor (again)
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // addition
    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return new Money(totalCents / 100.0);
    }

    // subtraction
    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        return new Money(totalCents / 100.0);
    }

    // comparing with compareTo
    public int compareTo(Money otherObject) {
        return Long.compare(this.toCents(), otherObject.toCents());
    }

    // Equals...
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    // Convert to cents
    private long toCents() {
        return (dollars * 100) + cents;
    }

    // convert to string/s
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
