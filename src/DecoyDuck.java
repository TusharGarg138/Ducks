public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.quackBehaviour = new MuteQuack();// Doesn't quack
        this.swimBehaviour = new Sink();
        this.flyBehaviour = new NoFly();        // Can't fly
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck!");
    }
}
