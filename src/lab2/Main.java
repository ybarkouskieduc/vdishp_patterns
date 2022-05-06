package lab2;

import lab2.mediator.SimpleChatRunner;
import lab2.observer.JobSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose what you want to do");
        System.out.println("1.Chat(Mediator)");
        System.out.println("2.JobSearch(Observer)");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.next()) {
            case "1" -> SimpleChatRunner.main(args);
            case "2" -> JobSearch.main(args);
        }
    }
}
