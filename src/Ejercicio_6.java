import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Ejercicio_6 {
    public static void main(String[] args) {
        WebDriver dr = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(5));

        try {
            dr.get("https://www.selenium.dev/selenium/web/dynamic.html");
            dr.manage().window().maximize();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("reveal"))).click();

            WebElement inputRevelado = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));
            inputRevelado.sendKeys("Prueba Selenium ADSO");

            String textoIngresado = inputRevelado.getDomProperty("value");
            System.out.println("Texto en el campo: " + textoIngresado);

            if (textoIngresado.equals("Prueba Selenium ADSO")) {
                System.out.println("Prueba exitosa  : )");
            } else {
                System.out.println("Prueba fallida  : (");
            }

            File captura = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);

            File archivoDestino = new File("evidencia_selenium.png");

            FileHandler.copy(captura, archivoDestino);


            System.out.println("Evidencia guardada en: " + archivoDestino.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            dr.quit();
        }
    }
}