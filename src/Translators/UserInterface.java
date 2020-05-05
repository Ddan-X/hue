package Translators;
/**
 * user interface
 *defines the methods that need to be implemented for any
 * @author dan
 */
import Model.UserInfo;


public interface UserInterface {
    public boolean isExist_User(String _user, String _password);
    
    public boolean insertUser(UserInfo _user);
    
    public String findEmail (String _username);
    
    public boolean findUserName(String _username);
    
    public boolean isExistEmail (String _email);
    
    public String findPassword(String _username);
    
     public UserInfo getUser(String _username, String _password);
}
