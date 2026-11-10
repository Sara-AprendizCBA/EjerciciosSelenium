//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;
//
//public class Ejercicio_3 {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        try {
//            driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//            driver.manage().window().maximize();
//
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("my-text"))).sendKeys("Prueba ADSO");
//            driver.findElement(By.name("my-password")).sendKeys("Sena2026");
//            driver.findElement(By.name("my-textarea")).sendKeys("Automatización con Selenium");
//
//            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))).click();
//
//            String textoMensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message"))).getText();
//
//            if (textoMensaje.equals("Received!")) {
//                System.out.println("Prueba exitosa: El formulario se envió y muestra: " + textoMensaje);
//            } else {
//                System.out.println("Prueba fallida");
//            }
//
//        } finally {
//            driver.quit();
//        }
//    }
//}