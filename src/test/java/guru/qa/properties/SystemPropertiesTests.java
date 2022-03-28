package guru.qa.properties;

import jdk.jfr.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("properties")

public class SystemPropertiesTests {
    @Test
    void someTest1() {
        String browser = System.getProperty("browser");
        System.out.println(browser); //null
    }

    @Test
    void someTest2() {
        System.setProperty("some_browser", "safari");
        String browser = System.getProperty("some_browser");
        System.out.println(browser);// safari
    }

    @Test
    void someTest3() {
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser);// opera
        // gradle clean test  //opera
        // gradle clean test -Dbrowser=mozzilla //mozzzila
    }

    @Test
    void someTest4() {
        System.out.println(System.getProperty("any_value")); //null

        String browser = System.getProperty("any_value", "some");
        System.out.println(System.getProperty("any_value"));// some
        // gradle clean test  //opera
        // gradle clean test -Dbrowser=mozzilla //mozzzila
    }

    @Test
    void someTest5() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");
        String browserSize = System.getProperty("browserSize", "300X300");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);

         /*gradle clean test
          chrome
          91
         300X300
            */

        /*gradle clean test -Dbrowser=mozzila -Dversion=80 -DbrowserSize=600x600
        mozzila
        80
        600x600*/

    }

    @Test
    @Tag("smoke")
    void someTest6() {
        System.out.println("I wont to say:" + System.getProperty("someText"));
        /* gradle clean test -DsomeText=Hello
         I wont to say:Hello

         gradle clean smoke_test -DsomeText=Hello
         */
    }
}
