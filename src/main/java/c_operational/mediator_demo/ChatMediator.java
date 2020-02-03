package c_operational.mediator_demo;

public interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);

}
