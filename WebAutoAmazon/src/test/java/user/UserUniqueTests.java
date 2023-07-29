package user;

import base.BaseTests_Cookies;
import org.testng.annotations.Test;
import pages.Amazon.UserUniquePage;

import static org.testng.Assert.*;

public class UserUniqueTests extends BaseTests_Cookies { //ALl done
    @Test (groups = "Happy")//Ok
    public void testTopPicksIsFound(){
        UserUniquePage usr =homePage.openUserUniquePage();
        assertEquals(usr.getTopPicksElement(),"Top picks for you");

    }
}
