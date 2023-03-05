package ATM;

public class AccountATM {
    public AccountATM(String name, Integer balance, Integer numKart, String pinCod) {
        this.name = name;
        this.balance = balance;
        this.numKart = numKart;
        this.pinCod = pinCod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getNumKart() {
        return numKart;
    }

    public void setNumKart(Integer numKart) {
        this.numKart = numKart;
    }

    public String getPinCod() {
        return pinCod;
    }

    public void setPinCod(String pinCod) {
        this.pinCod = pinCod;
    }

    String name;
        Integer balance;
        Integer numKart;
        String pinCod;

}
