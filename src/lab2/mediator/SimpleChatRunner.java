package lab2.mediator;

import lab2.Main;
import lab2.factoryMethod.AdminFactory;
import lab2.factoryMethod.SimpleUserFactory;
import lab2.factoryMethod.UserFactory;

import java.io.Serializable;
import java.util.Scanner;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        UserFactory adminFactory = new AdminFactory();
        UserFactory simpleUserFactory = new SimpleUserFactory();
        Scanner scanner = new Scanner(System.in);
        User currentUser = null;
        while(true) {
            System.out.println("1.Choose role");
            System.out.println("2.Send message");
            System.out.println("3.Back to menu");
            System.out.print("Choose:");
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("1.Admin\n2.User");
                    if (scanner.nextLine().equals("1")) {
                        System.out.print("Enter nickname:");
                        User admin = adminFactory.createUser(chat,scanner.nextLine());
                        chat.setAdmin(admin);
                        currentUser = admin;
                    } else {
                        System.out.print("Enter nickname:");
                        User user = simpleUserFactory.createUser(chat,scanner.nextLine());
                        chat.addUserToChat(user);
                        currentUser = user;
                    }
                    break;
                case "2":
                    System.out.print("Enter message:");
                    if (currentUser != null)
                    currentUser.sendMessage(scanner.nextLine());
                    break;
                case "3":
                    Main.main(args);
                    break;
            }
        }
    }
}
