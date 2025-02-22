public class MallardDuck {
    public MallardDuck() {
        this.quackBehaviour = new Quack();
        this.swimBehaviour = new SwimWithLegs();
        this.flyBehaviour = new CanFly();
    }

    public void display() {
        System.out.println("I am Mallard duck..");
    }
}
