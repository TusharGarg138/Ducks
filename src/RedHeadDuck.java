public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.quackBehaviour = new Squeak();
        this.swimBehaviour = new SwimWithLegs();
        this.flyBehaviour = new CanFly();
    }

    public void display() {
        System.out.println("I am a red head duck duck!!");
    }
}
