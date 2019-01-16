package login

import finreach.BasePage
import org.testng.annotations.Test

class LoginPageTest {

    @Test
    void logInTest(){
        new BasePage()
                .navigate()
                .setLogin("Luke")
                .setPassword("Skywalker")
    }

}
