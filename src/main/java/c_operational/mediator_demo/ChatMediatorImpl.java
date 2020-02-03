package c_operational.mediator_demo;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User el: this.users){
            if(!el.equals(user)) el.receive(message);
        }
        System.out.println("CONTROL TOWER>>"+user.name+">>MESSAGE SENT");
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
