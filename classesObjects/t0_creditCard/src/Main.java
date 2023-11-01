public class Main {
    public static void main(String[] args) {
        System.out.println("0. Create Credit Card class with attributes");
        CreditCard card1 = new CreditCard("BY111", 1000);
        CreditCard card2 = new CreditCard("BY222", 1000);
        CreditCard card3 = new CreditCard("BY333", 1000);
        card1.addAmountMoney(500);
        card2.addAmountMoney(600);
        card3.takeAmountMoney(300);
        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();
    }
}

class CreditCard{
    String accountNumber;
    int amountMoney;

    public CreditCard(String accountNumber, int amountMoney){
        this.accountNumber = accountNumber;
        this.amountMoney = amountMoney;
    }

    public void addAmountMoney(int n) {
        this.amountMoney = this.amountMoney + n;
    }
    public void takeAmountMoney(int n) {
        this.amountMoney = this.amountMoney - n;
    }

    public void cardInfo(){
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Amount money: " + this.amountMoney);
    }
}