package suits;

import login.Login;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import preferences.EditPreferences;
import profile.EditProfile;
import watchlist.Watchlist;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                Login.class,
                Watchlist.class,
                EditProfile.class,
                EditPreferences.class

        }
)
public class SmokeIMDb {
}
