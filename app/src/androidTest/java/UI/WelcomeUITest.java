package UI;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.digitalcampus.mobile.learning.R;
import org.digitalcampus.oppia.activity.WelcomeActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class WelcomeUITest {

    @Rule
    public ActivityTestRule<WelcomeActivity> welcomeActivityTestRule =
            new ActivityTestRule<WelcomeActivity>(WelcomeActivity.class);

    @Test
    public void clickLoginButton() throws Exception{
        onView(withId(R.id.welcome_login))
                .perform(click());

        onView(withId(R.id.login_btn))
                .check(matches(isDisplayed()));
    }

    @Test
    public void clickRegisterButton() throws Exception{
        onView(withId(R.id.welcome_register))
                .perform(click());

        onView(withId(R.id.register_btn))
                .perform(scrollTo())
                .check(matches(isDisplayed()));
    }

    @Test
    public void clickResetTab() throws Exception{
        onView(withText(R.string.tab_title_reset))
                .perform(click());

        onView(withId(R.id.reset_btn))
                .check(matches(isDisplayed()));
    }

}
