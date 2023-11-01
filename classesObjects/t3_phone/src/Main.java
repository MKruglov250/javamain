import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("3. Phone class");
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(223322, "iPhone");
        Phone phone3 = new Phone(880055552, "Samsung", 300);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        long number1 = phone1.getNumber();
        long number2 = phone2.getNumber();
        long number3 = phone3.getNumber();
        System.out.println("Phone 1 number:" + number1 + "; Phone 2 number: " + number2 + "; Phone 3 number: " + number3);
        phone1.receiveCall("Friend");
        phone2.receiveCall("Mother", 355300200);
        phone3.receiveCall("Sister");
        phone1.sendMessage("Hi, can you hear me?", 111222, 333444, 555666, 789098);
    }
}

class Phone{
    long number;
    String model;
    int weight;

    public Phone(long number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(){
    }

    public Phone(long number, String model){
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name){
        System.out.println("Calling: " + name);
    }

    public void receiveCall(String name, long number){
        System.out.println("Calling: " + name + "(" + number + ")");
    }

    public long getNumber(){
        return this.number;
    }

    public void sendMessage(String message, int...args){
        System.out.println("Message sent to numbers: " + Arrays.toString(args));
    }
}