package model;

public class Transaction {
    private int id;
    private String customerName;
    private int moneySub;
    private int moneyPlus;

    public Transaction() {
    }

    public Transaction(int id, String customerName, int moneySub, int moneyPlus) {
        this.id = id;
        this.customerName = customerName;
        this.moneySub = moneySub;
        this.moneyPlus = moneyPlus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getMoneySub() {
        return moneySub;
    }

    public void setMoneySub(int moneySub) {
        this.moneySub = moneySub;
    }

    public int getMoneyPlus() {
        return moneyPlus;
    }

    public void setMoneyPlus(int moneyPlus) {
        this.moneyPlus = moneyPlus;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", moneySub=" + moneySub +
                ", moneyPlus=" + moneyPlus +
                '}';
    }
}
