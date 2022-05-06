package lab2.factoryMethod;

import lab2.mediator.Chat;
import lab2.mediator.SimpleUser;
import lab2.mediator.User;

public class SimpleUserFactory implements UserFactory {
    @Override
    public User createUser(Chat chat, String name) {
        return new SimpleUser(chat,name);
    }
}
