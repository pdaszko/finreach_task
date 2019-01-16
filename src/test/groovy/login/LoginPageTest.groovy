package login

import finreach.BasePage
import org.testng.annotations.Test

class LoginPageTest {

    @Test
    logInTest(){
        BasePage.navigate()
                .setLogin("Luke")
                .setPassword("Skywalker")

    }

}
