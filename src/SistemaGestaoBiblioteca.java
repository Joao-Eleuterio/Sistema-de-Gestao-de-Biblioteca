import model.User;

public class SistemaGestaoBiblioteca {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        User teste = new User();

        teste.setName("Joao");
        teste.setPassword("123");

        System.out.println(
                "User " + teste.getName() + " with password " + teste.getPassword() + " has a history of "
                        + ( (teste.getHistoric() == null || teste.getHistoric().isEmpty()) ? "0" : teste.getHistoric().size()) + " books"
        );




    }
}
