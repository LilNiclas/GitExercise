import java.util.Scanner;

public class SuperGreeter {

    public void start() {
        System.out.println("Det virker");

        System.out.print("Hvad hedder du: ");
        Scanner scan = new Scanner(System.in);
        String greet = scan.nextLine();
    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
    }





}
