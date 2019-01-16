package finreach

import static com.codeborne.selenide.Selenide.*

class BasePage {

        static void navigate() {
            open("https://cafetownsend-angular-rails.herokuapp.com")
        }

}
