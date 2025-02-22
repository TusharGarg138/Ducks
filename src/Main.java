public class Main {
    public static void main (String[] args) {
        Duck rd = new RedHeadDuck(); // Use Duck as the reference type
        System.out.println("------------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("-----------------------");

        Duck rb = new RubberDuck(); // Use Duck as the reference type
        System.out.println("------------------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("-----------------------");

        Duck md = new MallardDuck(); // Use Duck as the reference type
        System.out.println("------------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("-----------------------");
    }
}
