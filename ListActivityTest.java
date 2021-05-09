package sg.edu.np.mad.madpractical;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
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

    @Test
    public void testRecyclerListContent(){
        for(int i=0; i<20; i++) {
            onView(withId(R.id.rv)).perform(RecyclerViewActions.actionOnItemAtPosition(i, click()));
        }
    }

    @Test
    public void testRecyclerChild(){
        onView(withId(R.id.rv)).perform(RecyclerViewActions.actionOnItemAtPosition(10, ChildViewAction.clickChildViewWithId(R.id.img_profile)));
    }



    public void tearDown() throws Exception {
    }
}
