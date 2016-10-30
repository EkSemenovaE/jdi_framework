package com.epam.uitest;
import org.testng.annotations.DataProvider;

/**
 * Created by kwfm083 on 10/28/2016.
 */
public class Provider {
    @DataProvider(name = "loginTest")
    public  static Object[][] login() {
        String repeate ="hngngngngghnhnhn";
        return new Object[][]{  {false, "", "", "* Login Faild"},
                {false, "epam", "34", "* Login Faild"},
                {false, "1234", "1234", "* Login Faild"},
                {false, "epa", "1234", "* Login Faild"},
                {false, "true", "1234", "* Login Faild"},
                {false, "true", "true", "* Login Faild"},
                {false, "1234", "epam", "* Login Faild"},
                {false, "", "1234", "* Login Faild"},
                {false, "e p a m", "1234", "* Login Faild"},
                {true, "epam", "epam", "PITER CHAILOVSKII"},
                {true, "epam", "1234", "PITER CHAILOVSKII"}
        };

    }


    @DataProvider(name = "checkboxTest")
    public Object [][] checkbox(){
        return new Object[][]{  {false,false,false,false},
                {false,false,false,true},
                {false,false,true,false},
                {false,false,true,true},
                {false,true,false,false},
                {false,true,false,true},
                {false,true,true,false},
                {false,true,true,true},
                {true,false,false,false},
                {true,false,false,true},
                {true,false,true,false},
                {true,false,true,true},
                {true,true,false,false},
                {true,true,false,true},
                {true,true,true,false},
                {true,true,true,true},
                {false,false,false,false},
        };
    }

}
