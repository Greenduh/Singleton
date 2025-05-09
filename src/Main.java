public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Повідомлення");

        method();

        Logger logger2 = Logger.getInstance();
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
    }

    public static void method() {
        Logger logger = Logger.getInstance();
        logger.log("Повідомлення з іншого методу");
    }
}
