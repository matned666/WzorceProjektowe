package c_operational.mediator_demo;

public class MediatorMain {
    public static void main(String[] args) {

        ChatMediator controlTower = new ChatMediatorImpl();
        User user1 = new UserImpl(controlTower, "first plane");
        User user2 = new UserImpl(controlTower, "second plane");
        User user3 = new UserImpl(controlTower, "third plane");
        User user4 = new UserImpl(controlTower, "forth plane");

        controlTower.addUser(user1);
        controlTower.addUser(user2);
        controlTower.addUser(user3);
        controlTower.addUser(user4);

        user1.send("I am landing");

    }
}
