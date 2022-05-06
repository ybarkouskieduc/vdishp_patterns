package lab2.factoryMethod;

import lab2.mediator.Chat;
import lab2.mediator.User;

public interface UserFactory {
    User createUser(Chat chat, String name);
}
