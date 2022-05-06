package lab2.factoryMethod;

import lab2.mediator.Admin;
import lab2.mediator.Chat;
import lab2.mediator.User;

public class AdminFactory implements UserFactory{
    @Override
    public User createUser(Chat chat, String name) {
        return new Admin(chat,name);
    }
}
