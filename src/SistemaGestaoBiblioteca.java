import java.util.Scanner;

import controller.LibraryController;

public class SistemaGestaoBiblioteca {
    public static void main(String[] args) throws Exception {

        String homeMenu = "/--------------------------------------------\\\n" +
                "|                                            |\n" +
                "|   1 - Login                                |\n" +
                "|   2 - Register                             |\n" +
                "|   0 - Exit                                 |\n" +
                "|                                            |\n" +
                "\\--------------------------------------------/\n" +
                " Option: ";

        LibraryController libraryController = new LibraryController();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print(homeMenu);
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline after reading integer

                switch (option) {
                    case 1:
                        System.out.print("Email: ");
                        String emailLogin = scanner.nextLine();
                        System.out.print("Password: ");
                        String passwordLogin = scanner.nextLine();
                        if (!libraryController.login(emailLogin, passwordLogin)) {
                            System.out.println();
                            continue;
                        }
                        break;
                    case 2:
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Email: ");
                        String emailRegister = scanner.nextLine();
                        System.out.print("Password: ");
                        String passwordRegister = scanner.nextLine();
                        System.out.print("Level: ");
                        int levelRegister = scanner.nextInt();
                        if (!libraryController.register(name, passwordRegister, emailRegister, levelRegister)) {
                            System.out.println();
                            continue;
                        }
                        break;
                    case 0:
                        return;
                }
                int secondOption = 0;
                do {
                    //need to know wich user are logged in

                    //if its a client show this menu
                    System.out.print(
                            "/--------------------------------------------\\\n" +
                                    "|                                            |\n" +
                                    "|   1 - Loan a book                          |\n" +
                                    "|   2 - Return book                          |\n" +
                                    "|   3 - See historic                         |\n" +
                                    "|   4 - See books                            |\n" +
                                    "|   0 - Exit                                 |\n" +
                                    "|                                            |\n" +
                                    "\\--------------------------------------------/\n" +
                                    " Option: ");
                                    secondOption = scanner.nextInt();
                    scanner.nextLine();
                    switch (secondOption) {
                        case 1:
                            // Handle loaning a book
                            break;
                        case 2:
                            // Handle returning a book
                            break;
                        case 3:
                            // Handle seeing historic
                            break;
                        case 4:
                            // Handle seeing books
                            break;
                        case 0:
                            break; // Exit the program
                    }
                    //else show this one
                    System.out.println(
                        "/--------------------------------------------\\\n" +
                        "|                                            |\n" +
                        "|  1 - Add a new book                        |\n" +
                        "|  2 - Remove a book                         |\n" +
                        "|  0 - Exit                                  |\n" +
                        "|                                            |\n" +
                        "\\--------------------------------------------/\n" +
                        " Option: ");
                        secondOption = scanner.nextInt();
                    scanner.nextLine();
                    switch (secondOption) {
                        case 1:
                            // Handle add a book
                            break;
                        case 2:
                            // Handle returning a book
                            break;
                        case 0:
                            break; // Exit the program
                    }
                    

                }while(secondOption!= 0);
            }

        }
    }
}
