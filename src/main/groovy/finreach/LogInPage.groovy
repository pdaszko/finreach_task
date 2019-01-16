package finreach
import static com.codeborne.selenide.Selenide.*

class LogInPage {

    String LOGIN = 'input[ng-model="user.name"]'

    LogInPage setLogin(String login){
        $(LOGIN).sendKeys(login)
        return this
    }

    LogInPage setPassword(String password){
        $(LOGIN).sendKeys(password)
        return this
    }
}
