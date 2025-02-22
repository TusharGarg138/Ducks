public class RubberDuck extends Duck {
    public RubberDuck() {
        this.quackBehaviour = new Squeak();
        this.swimBehaviour = new Floating();
        this.flyBehaviour = new CannotFly();
    }

    public void display() {
        System.out.println("I am a rubber duck!!");
    }
}
