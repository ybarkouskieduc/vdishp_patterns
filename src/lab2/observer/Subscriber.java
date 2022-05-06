package lab2.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear "+name+"\n we have some changes in vacancies"+ vacancies+
                "\n==============================================================\n");
    }
}
