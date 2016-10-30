package training;

import org.omg.CORBA.Object;
import org.testng.annotations.*;


/**
 * Created by kwfm083 on 10/13/2016.
 */
@Test
public class TestNgExamples1 {

@AfterSuite
public  void  afterSuite() {
        System.out.println("After Siite");
    }

    @AfterClass
    public  void  afterClass() {
        System.out.println("After Class");
    }


    @AfterMethod
    public  void  afterMethod() {
        System.out.println("After Method");
    }
    @AfterTest
    public  void  afterTest() {
        System.out.println("After Test");
    }
@Test
    public void TestA() {
    System.out.println("TestA");
}

//    @Test(groups = "No", timeOut = 1000)
//    public void Test() {
//        Thread.sleep(5000);
//        System.out.println("TestB");
//    }
    @Test(dataProviderClass = Datas.class, dataProvider = "testA")
    public void TestB(boolean bool, String str, int val, Object obj) {
        System.out.println("TestB "  + bool + str +val + obj);
    }

        @Test(invocationCount = 10)
        public void TestC() {
                        System.out.println("TestC");

        }


    public void mtest() {
        System.out.println("mtest");

    }


    @Test(dependsOnMethods = "TestC")
    public void TestV() {
        System.out.println("TestV");

    }
        @BeforeTest
        public void beforeTest() {
            System.out.println("Before Test");

        }

        @BeforeMethod
        public void beforeMethod() {
            System.out.println("Before Method");

        }

        @BeforeClass
        public void beforeClass() {
            System.out.println("Before Class");

        }

        @BeforeSuite
        public void beforeSuite() {
            System.out.println("Before Suite");

        }
    }



