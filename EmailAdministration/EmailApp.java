package EmailAdministration;

public class EmailApp {

    public static void main(String[] args) {
        EmailAdmin emailAdmin = new EmailAdmin("Sebastian", "Astalos");

        emailAdmin.setMailboxCapacity(1000);
        emailAdmin.setAlternateEmail("sebastian2002@outlook.com");
        emailAdmin.changePassword("newPassword123");

        System.out.println(emailAdmin.showInfo());
    }
}