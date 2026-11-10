//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class Ejercicio_1 {
//    public  static void main(String[] args){
//        WebDriver dr = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(5));
//
//        try {
//            dr.get("https://demoqa.com/text-box");
//            dr.manage().window().maximize();
//
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName"))).sendKeys("Laura Martínez");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userEmail"))).sendKeys("laura@gmail.com");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("currentAddress"))).sendKeys("Calle 25 # 10-20");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("permanentAddress"))).sendKeys("Carrera 15 # 30-40");
//
//
//            wait.until(ExpectedConditions.elementToBeClickable(By.id("submit"))).click();
//
//
//            WebElement resultadoName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
//            String Resultado_N = resultadoName.getText();
//            System.out.println("Texto del campo " +  Resultado_N);
//
//
//            WebElement resultadoEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//            String  Resultado_E = resultadoEmail.getText();
//            System.out.println("Texto del campo " +  Resultado_E);
//
//            if (Resultado_N.contains("Laura Martínez") && Resultado_E.contains("laura@gmail.com")) {
//                System.out.println("Prueba exitosa  : )");
//            } else {
//                System.out.println("Prueba fallida  : (");             }
//        }finally {
//            dr.quit();
//        }
//    }
//}
