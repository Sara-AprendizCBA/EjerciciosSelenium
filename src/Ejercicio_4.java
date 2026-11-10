//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;
//
//public class Ejercicio_4 {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        try {
//            driver.get("https://demoqa.com/buttons");
//            driver.manage().window().maximize();
//
//            WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("doubleClickBtn")));
//
//            Actions actions = new Actions(driver);
//            actions.moveToElement(btn).doubleClick().perform();
//
//            WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("doubleClickMessage")));
//
//            if (mensaje.getText().contains("You have done a double click")) {
//                System.out.println("Prueba exitosa: " + mensaje.getText());
//            } else {
//                System.out.println("Prueba fallida");
//            }
//        } finally {
//            driver.quit();
//        }
//    }
//}