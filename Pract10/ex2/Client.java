package Pract10.ex2;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Спасибо за заказ!");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Клиент выбрал " +
                "стул =" + chair;
    }
}