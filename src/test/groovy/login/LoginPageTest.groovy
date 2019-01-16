package login

import finreach.BasePage
import org.testng.annotations.Test

class LoginPageTest {

    @Test
    logInTest(){
        BasePage.navigate("https://cafetownsend-angular-rails.herokuapp.com")
    }

}
