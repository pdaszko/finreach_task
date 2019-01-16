package finreach

import static com.codeborne.selenide.Selenide.*

class BasePage {

        LogInPage navigate() {
            open("https://cafetownsend-angular-rails.herokuapp.com")
        new LogInPage()
        }

}
