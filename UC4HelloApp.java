public class UC4HelloApp {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) {
                System.out.print(args[i]);
            } else {
                System.out.print(args[i] + ", ");
            }
        }
        System.out.println("!");
    }
}