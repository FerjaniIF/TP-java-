import java.io.IOException;

public class TestAuthentification {

    public static void main(String[] args) throws IOException {
        boolean authenticated = false;

        while(authenticated == false) {
            try {
                Authentification auth = new Authentification();

                if(auth.userLogin.equals(auth.LoginCorrect) && auth.userPwd.equals(auth.PwdCorrect)) {
                	System.out.println("Authentication successful!");
                	authenticated = true;
                }
                   
            } catch (WrongInputLength | WrongLoginException | WrongPwdException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Terminating program to avoid potential attacks.");
                System.exit(0);
            	}
        }
    }
}
