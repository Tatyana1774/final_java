import java.util.Scanner;
public class ViewUser {
    public String prompt(String message) {
        System.out.print(message);
        String input = "";
        Scanner in = new Scanner(System.in);
        try {
            input = in.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            in.close();
        }
        return input;
    }
}
