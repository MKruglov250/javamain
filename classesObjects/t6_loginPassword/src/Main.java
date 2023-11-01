import java.util.Objects;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println("6. Login and password confirmation");
        LoginPassword loginPassword = new LoginPassword();
        boolean checks = LoginPassword.getCredentials("123","pwd1","pwd1");

    }
}

class LoginPassword{
    String login;
    String password;
    String confirmPassword;

    public LoginPassword(){
    }

    public static boolean getCredentials (String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException{
        if (login.length() > 20){
            throw new WrongLoginException("Login is longer than 20 chars");
        }
        if (login.contains(" ")) throw new WrongLoginException("Login has spaces");
        boolean b = Objects.equals(password, confirmPassword);
        boolean hasDigits = false;
        for(int i = 0; i < password.length() && !hasDigits; i++) {
            if(Character.isDigit(password.charAt(i))) {
                hasDigits = true;
            }
        }
        if (password.length() > 20) throw new WrongPasswordException("Password is longer than 20 symbols");
        if (password.contains(" ")) throw new WrongPasswordException("Password has spaces");
        if (!b) throw new WrongLoginException("Passwords do not match");
        if (!hasDigits) throw new WrongLoginException("Password doesn't have digits");
        if (WrongLoginException.count + WrongPasswordException.count > 0) return false;
        else return true;
    }
}

class WrongLoginException extends Exception{
    static int count = 0;
    public WrongLoginException (String message){
        super(message);
        count++;
    }
}

class WrongPasswordException extends Exception{
    static int count = 0;
    public WrongPasswordException (String message){
        super(message);
        count++;
    }
}
