package c_operational.mediator_demo;

public abstract class User {

    ChatMediator mediator;
    String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);

}
