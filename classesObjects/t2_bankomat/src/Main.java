public class Main {
    public static void main(String[] args) {
        System.out.println("2. Creating class for Bankomat");
        Bankomat bankomat = new Bankomat(20,20,30);
        boolean operation = bankomat.takeMoney(5600);
        System.out.println("Operation result: " + String.valueOf(operation));
        bankomat.addMoney(10,10,10);
        operation = bankomat.takeMoney(5600);
        System.out.println("Operation result: " + String.valueOf(operation));
    }
}

class Bankomat{
    int count_20;
    int count_50;
    int count_100;

    public Bankomat(int count_20, int count_50, int count_100){
        this.count_20 = count_20;
        this.count_50 = count_50;
        this.count_100 = count_100;
    }

    public Bankomat(){
        this.count_20 = 10;
        this.count_50 = 10;
        this.count_100 = 10;
    }

    public void addMoney(int count_20, int count_50, int count_100){
        this.count_20 += count_20;
        this.count_50 += count_50;
        this.count_100 += count_100;
    }

    public boolean takeMoney(int amount){
        boolean need100 = true;
        boolean need50 = true;
        boolean need20 = true;
        int start20 = this.count_20;
        int start50 = this.count_50;
        int start100 = this.count_100;
        int give20 = 0;
        int give50 = 0;
        int give100 = 0;
        while (need100 && this.count_100 > 0){
            if (amount < 100){
                need100 = false;
            } else {
                amount -= 100;
                give100 += 1;
                this.count_100 -=1;
            }
        }
        while (need50 && this.count_50 > 0){
            if (amount < 50){
                need50 = false;
            } else {
                amount -= 50;
                give50 += 1;
                this.count_50 -=1;
            }
        }
        while (need20 && this.count_20 > 0) {
            if (amount < 20){
                need20 = false;
            } else {
                amount -= 20;
                give20 +=1;
                this.count_20 -=1;
            }
        }
        if (give20 + give50 + give100 == 0 || amount > 0){
            this.count_20 = start20;
            this.count_50 = start50;
            this.count_100 = start100;
            return false;
        } else {
            System.out.println("Given 20 banknotes: " + give20);
            System.out.println("Given 50 banknotes: " + give50);
            System.out.println("Given 100 banknotes: " + give100);
            return true;
        }

    }


}