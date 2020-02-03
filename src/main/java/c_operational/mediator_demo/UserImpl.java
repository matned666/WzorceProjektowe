package c_operational.mediator_demo;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name+">> MESSAGE SENT: "+message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name+">> MESSAGE RECEIVED: "+message);
    }
}
