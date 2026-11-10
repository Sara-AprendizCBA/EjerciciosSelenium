//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class Ejercicio_2 {
//    public  static void main(String[] args){
//        WebDriver dr = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(5));
//
//        try {
//            dr.get("https://demoqa.com/radio-button");
//            dr.manage().window().maximize();
//
//            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='yesRadio']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='impressiveRadio']"))).click();
//
//
//
//            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='impressiveRadio']"))).click();
//
//
//            WebElement radioImpressive = dr.findElement(By.id("impressiveRadio"));
//            boolean Seleccionado = radioImpressive.isSelected();
//
//            WebElement mensaje_E = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("text-success")));
//            String Confirmacion = mensaje_E.getText();
//
//
//            if (Seleccionado && Confirmacion.contains("Impressive")) {
//                System.out.println("Prueba exitosa: El botón está seleccionado y el mensaje es: " + Confirmacion);
//            } else {
//                System.out.println("Prueba fallida.");
//            }
//
//        }finally {
//            //dr.quit();
//        }
//    }
//}
