import org.testng.annotations.Test;

import java.io.IOException;

public class FirstTest extends BasePage {

    @Test
    public void FTest() throws IOException {
        GPage GP = new GPage(driver);
        GP.Search("Selenium");
    }
}
