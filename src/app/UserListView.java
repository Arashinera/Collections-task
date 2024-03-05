package app;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class UserListView {

    public static int choice;

    public static void showUserList(List<User> users){

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            do {
                System.out.println("""
                                        
                    Choose opinion:
                    1)Get User List
                    2)Get Certain User
                    3)Exit""");
                choice = input.nextInt();
            } while (choice < 1 || choice > 3);

            if (choice == 1) {
                for (User user : users) {
                    System.out.println(user);
                }
            } else if (choice == 2) {
                System.out.print("Please, input index to find certain user: ");
                choice = input.nextInt();

                if (choice >= 0 && choice < users.size()) {
                    User selectedUser = users.get(choice);
                    System.out.println(selectedUser);
                } else {
                    System.out.println("Invalid index. Please provide a valid index within the range.");
                }
            } else {
                System.exit(0);
            }
        } catch (InputMismatchException exception){
            System.out.println("You need to provide input value... Please, Try again.");
        }

        input.close();
    }
}
