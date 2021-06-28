import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        System.out.println(flipNHeads(2));
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println(currnetTime());
        }
    }

    public static String pluralize(String word, int num) {
        if (num == 0 || num > 1) {
            return word + "s";
        }
        return word;
    }

    public static String flipNHeads(int n) {
        int flip = 0;
        int heads = 0;
        for (int i = 0; i < n;) {
            String name = coin();
            if (name == "heads") {
                i++;
                flip++;
                heads++;
                System.out.println(name);
            } else {
                i = 0;
                flip++;
                heads = 0;
                System.out.println(name);
            }
        }

        return "It took " + flip + " flips to flip " + heads + " heads in a row";
    }

    public static String coin() {
        String name = "";
        Double random = Math.random();
        if (random < 0.5) {
            name = "tails";
        } else if (random >= 0.5) {
            name = "heads";
        }
        return name;
    }

    public static String currnetTime() {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return time;
    }
}