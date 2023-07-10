package user;

import base.BaseTests2;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserUniquePage;

import static org.testng.Assert.*;

public class UserUniqueTests extends BaseTests2 { //ALl done
    @Test //Ok
    public void testTopPicksIsFound(){
        UserUniquePage usr =homePage.openUserUniquePage();
        assertEquals(usr.getTopPicksElement(),"Top picks for you");

    }
}
