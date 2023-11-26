import java.io.IOException;
import java.util.Scanner;

public class Authentification {
	final protected String LoginCorrect = "scott";
	final protected String PwdCorrect = "tiger";
	protected String userLogin;
    protected String userPwd;
	
	public Authentification() throws WrongInputLength, WrongLoginException, WrongPwdException {
		this.userLogin = getUserLogin();
        this.userPwd = getUserPwd();
	}
	
	public String getUserLogin() throws WrongInputLength, WrongLoginException{
		System.out.println("Enter login:");
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        if (login.length() > 10) {
        	throw new WrongInputLength();
        }
        else if (!login.equals(LoginCorrect)) {
        	throw new WrongLoginException();
        }
        else {
            System.out.println("Login entered.");
        	return login;
        }
}
	
	public String getUserPwd() throws WrongPwdException{
		System.out.println("Enter password:");
        Scanner sc = new Scanner(System.in);
        String pwd = sc.nextLine();
        if (!pwd.equals(PwdCorrect)) {
        	throw new WrongPwdException();
        }
        else {
        	System.out.println("Password entered.");
        	return pwd;
        }
}
}
	
class WrongLoginException extends Exception {
    WrongLoginException() {
        super("Login incorrect !");
    }
}

class WrongPwdException extends Exception {
    WrongPwdException() {
        super("Mot de passe errone !");
    }
}

class WrongInputLength extends Exception {
    WrongInputLength() {
        super("La longueur du login ou du mot de passe depasse 10 caracteres !");
    }
}
