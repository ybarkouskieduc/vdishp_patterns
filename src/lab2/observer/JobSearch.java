package lab2.observer;

import lab2.Main;

import java.util.Scanner;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add vacancy");
            System.out.println("2. Add subscriber");
            System.out.println("3. Remove vacancy");
            System.out.println("4. Get back");
            System.out.println("Choose: ");

            switch (scanner.nextLine()) {
                case "1":
                    System.out.print("Enter vacancy name:");
                    String nameVacancy = scanner.nextLine();
                    jobSite.addVacancy(nameVacancy);
                    break;
                case "2":
                    System.out.print("Enter name:");
                    String name = scanner.nextLine();
                    Observer subscriber = new Subscriber(name);
                    jobSite.addObserver(subscriber);
                    break;
                case "3":
                    System.out.print("Enter name of vacancy:");
                    String nameOfVacancy = scanner.nextLine();
                    jobSite.removeVacancy(nameOfVacancy);
                    break;
                case "4":
                    Main.main(args);
                    break;
            }
        }
    }
}
