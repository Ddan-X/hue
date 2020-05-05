package Translators;

/**
 *Twitter user interface
 * defines the methods that need to be implemented for any
 * @author luod1
 */
import Model.TwitterUserInfo;

public interface TwitterUserInterface {

    public TwitterUserInfo selectTwitterUser(int _twitterId);

    public boolean insertTwitterUser(TwitterUserInfo _user);

    public boolean updateAccessToken(TwitterUserInfo _user);
}
