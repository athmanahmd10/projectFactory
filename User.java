public class User {

public String login = "soueid@hotmail.fr";
private String password = "aziz";


public boolean authentificate(String vLogin, String vPassword){
   
    if(login.equals(vLogin) && password.equals(vPassword)){
        System.out.println("Connexion réuissie");
        System.out.println("Login > "+ vLogin);
        System.out.println("Password > "+ vPassword);
        return true;
    }
    return false;
}
    
}
