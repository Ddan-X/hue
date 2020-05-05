package Habit_API;

/**
 *Twitter api interface 
 * defines the methods that need to be implemented for any
 * @author dan
 */
import twitter4j.Twitter;
import twitter4j.auth.AccessToken;


public interface TwitterInterface {
    
    public Twitter connectTwitter();
     
    public AccessToken getAccessToken();
}
