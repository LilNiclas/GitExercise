import java.util.Scanner;

public class SuperGreeter {

    public void start() {
        System.out.println("Det virker");

        System.out.print("Hvad hedder du? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.print("Hej " + name + ", hvor gammel er du?");
        int askAboutAge = scan.nextInt();
        System.out.print(askAboutAge + " er en fin alder");
    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
    }





}
