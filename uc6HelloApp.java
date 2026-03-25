public class uc6HelloApp {
    public static void main(String[] args) {
        String greeting;

        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append each name followed by ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove the trailing ", " using substring
            if (nameBuilder.length() > 0) {
                String names = nameBuilder.substring(0, nameBuilder.length() - 2);
                greeting = "Hello, " + names + "!";
            } else {
                greeting = "Hello, World!";
            }
        }

        System.out.println(greeting);
    }
}