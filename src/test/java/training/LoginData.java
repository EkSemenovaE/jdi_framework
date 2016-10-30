package training;
import org.testng.annotations.DataProvider;

/**
 * Created by kwfm083 on 10/17/2016.
 */
public class LoginData {
    @DataProvider(name="login")
    public static Object [][] login(){
        return new Object[][]{
                {true,"epam","1234"},
                {false,"epam","epam"},
                {false,"epam",""},
                {false,"","1234"},
        };
    }
}