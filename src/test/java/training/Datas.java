package training;

import org.testng.annotations.DataProvider;

/**
 * Created by kwfm083 on 10/13/2016.
 */
public class Datas {
    @DataProvider
    public Object[][] login() {
        return new Object[][] { {false, "", ""},
                                {false, "123", ""},
                                {true, "epam", "1234"},



        };
    }
    @DataProvider (name = "testA")
    public Object[][] testA() {
        return new Object[][] { {false, "", 123, new Object()},
                             {true, "epam", 1234, new Object()},



        };
    }
    @DataProvider (name = "LoginEpam")
    public Object[][] LoginEpam() {
        return new Object[][] { {false, "", 123, new Object()},
                {true, "epam", 1234, new Object()},



        };
    }
}
