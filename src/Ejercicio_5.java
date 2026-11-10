//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class Ejercicio_5 {
//    public static void main(String[] args) {
//        WebDriver dr = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(5));
//
//        try {
//            dr.get("https://demoqa.com/webtables");
//            dr.manage().window().maximize();
//
//            wait.until(ExpectedConditions.elementToBeClickable(By.id("addNewRecordButton"))).click();
//
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName"))).sendKeys("Carlos");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName"))).sendKeys("Ramírez");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userEmail"))).sendKeys("carlos@gmail.com");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("age"))).sendKeys("25");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("salary"))).sendKeys("2500000");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("department"))).sendKeys("Sistemas");
//
//            dr.findElement(By.id("submit")).click();
//
//            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("table"), "Carlos"));
//            dr.findElement(By.id("searchBox")).sendKeys("Carlos");
//
//            WebElement tabla = dr.findElement(By.tagName("table"));
//            String Resultado_T = tabla.getText();
//
//            System.out.println("Texto de la tabla: " + Resultado_T);
//
//            if (Resultado_T.contains("Carlos") && Resultado_T.contains("Ramírez")) {
//                System.out.println("Prueba exitosa  : )");
//            } else {
//                System.out.println("Prueba fallida  : (");
//            }
//
//        } finally {
//            dr.quit();
//        }
//    }
//}