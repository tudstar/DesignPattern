package mediatorDesignPattern;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("HI! John!");
        john.sendMessage("Hello! Robert");
    }
}
