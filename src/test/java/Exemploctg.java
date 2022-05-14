import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Exemploctg {


    @Test
    @DisplayName("Quando pegar o site principal, entao deo ver o titulo viniciuspessoni")
    public void verificaHomePage(){

        WebDriver driver = new ChromeDriver();
        String bassPage = "https://viniciuspessoni.com/";
        String tituloEsperado = "TESTER GLOBAL";
        String tituloEncontrado = "N/I";

        driver.get(bassPage);

       tituloEncontrado = driver.findElement(By.cssSelector("<h1>TESTERGLOBAL</h1>")).getText();

        System.out.println("Titulo Encoontrado"+tituloEncontrado);


        assertThat(tituloEncontrado,containsString(tituloEsperado));
        driver.close();

    }
}
