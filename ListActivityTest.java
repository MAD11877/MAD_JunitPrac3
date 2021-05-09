package sg.edu.np.mad.madpractical;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)

public class ListActivityTest extends TestCase {

    @Rule
    public ActivityScenarioRule<ListActivity> listActivityActivityScenarioRule =
            new ActivityScenarioRule<>(ListActivity.class);

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testRecyclerListVisible(){
        onView(withId(R.id.rv)).check(matches(isDisplayed()));
    }

    public void tearDown() throws Exception {
    }
}