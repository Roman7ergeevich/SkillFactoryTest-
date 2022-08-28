import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Main {
    @Before
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gas\\untitled11\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://skillfactory.ru/catalogue"); // Загрузка  каталога программ обучения

        @Test
        public void buttonTest()  {
            WebElement link = driver.findElement((By.xpath("//*[@id=\"rec469350955\"]/div/div/div[3]/a/img"))); // Загрузка главной страницы
            link.click();
            driver.navigate().back(); // Возврат назад

            WebElement link1 = driver.findElement((By.xpath("//*[@id=\"rec469350955\"]/div/div/div[6]/a"))); // Загрузка  страницы с бесплатными материалами
            link1.click();
            driver.navigate().back(); // Возврат назад

            WebElement link2 = driver.findElement((By.xpath("//*[@id=\"rec469350955\"]/div/div/div[7]/a"))); // Загрузка страницы  "Контакты"
            link2.click();
            driver.navigate().back(); // Возврат назад

            WebElement link3 = driver.findElement((By.xpath("//*[@id=\"rec469350955\"]/div/div/div[9]/a"))); // Загрузка страницы  "Корпоративное обучение"
            link3.click();
            driver.navigate().back(); // Возврат назад

            WebElement link4 = driver.findElement((By.xpath("//*[@id=\"rec372511587\"]/div/div/div/div[1]/div[2]/div"))); // Загрузка программ обучения по направлению  "Data Science"
            link4.click();
            driver.navigate().back(); // Возврат назад

            WebElement link5 = driver.findElement((By.xpath("//*[@id=\"rec372511587\"]/div/div/div/div[1]/div[3]/div"))); // Загрузка программ  обучения  по  направлению  "Анализ данных"
            link5.click();
            driver.navigate().back(); // Возврат назад

            WebElement link6 = driver.findElement((By.xpath("//*[@id=\"rec372511587\"]/div/div/div/div[1]/div[4]/div"))); // Загрузка программ  обучения  по  направлению  "Программирование"
            link6.click();
            driver.navigate().back(); // Возврат назад

            WebElement link7 = driver.findElement((By.xpath("//*[@id=\"rec372511587\"]/div/div/div/div[1]/div[5]/div"))); // Загрузка программ  обучения  по  направлению  "Дизайн"
            link7.click();
            driver.navigate().back(); // Возврат назад

            WebElement link8 = driver.findElement((By.xpath("//*[@id=\"rec372511587\"]/div/div/div/div[1]/div[6]/div"))); // Загрузка программ  обучения  по  направлению  "Маркетинг"
            link8.click();
            driver.navigate().back(); // Возврат назад

            WebElement link9 = driver.findElement((By.xpath("//*[@id=\"rec372511587\"]/div/div/div/div[1]/div[7]/div"))); // Загрузка программ  обучения  по  направлению  "Менеджмент"
            link9.click();
            driver.navigate().back(); // Возврат назад

            WebElement link10 = driver.findElement((By.xpath("//*[@id=\"rec372511587\"]/div/div/div/div[1]/div[8]/div"))); // Загрузка программ  обучения  по  направлению  "Высшее образование"
            link10.click();
            driver.navigate().back(); // Возврат назад

            WebElement link11 = driver.findElement((By.xpath("//*[@id=\"rec372511587\"]/div/div/div/div[1]/div[9]/div"))); // Загрузка программ  обучения  по  направлению  "Разработка игр"
            link11.click();
            driver.navigate().back(); // Возврат назад

            WebElement link11 = driver.findElement((By.xpath("//*[@id=\"rec372511587\"]/div/div/div/div[1]/div[9]/div"))); // Загрузка программ  обучения  по  направлению  "Разработка игр"
            link11.click();
            driver.navigate().back(); // Возврат назад

            //Проверка работы ссылок подраздела "Программирование"

            WebElement link12 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[62]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Веб-разработка"
            link12.click();
            driver.navigate().back(); // Возврат назад

            WebElement link13 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[63]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Backend-разработка"
            link13.click();
            driver.navigate().back(); // Возврат назад

            WebElement link14 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[63]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Тестирование"
            link14.click();
            driver.navigate().back(); // Возврат назад

            WebElement link15 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[65]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Разработка приложений"
            link15.click();
            driver.navigate().back(); // Возврат назад

            WebElement link16 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[66]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Безопасность"
            link16.click();
            driver.navigate().back(); // Возврат назад

            WebElement link17 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[71]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Инфраструктура"
            link17.click();
            driver.navigate().back(); // Возврат назад

            WebElement link18 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[72]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Разработка игр"
            link18.click();
            driver.navigate().back(); // Возврат назад

            WebElement link19 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[73]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Создание сайтов"
            link19.click();
            driver.navigate().back(); // Возврат назад

            WebElement link20 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[74]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Курсы Java"
            link20.click();
            driver.navigate().back(); // Возврат назад

            WebElement link21 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[75]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Курсы Python"
            link21.click();
            driver.navigate().back(); // Возврат назад

            WebElement link22 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[76]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Курсы JavaScript"
            link22.click();
            driver.navigate().back(); // Возврат назад

            WebElement link23 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[77]/div/a"))); // Загрузка программы  обучения  подраздела программирование  "Курсы PHP"
            link23.click();
            driver.navigate().back(); // Возврат назад

            WebElement link24 = driver.findElement((By.xpath("//*[@id=\"rec298827602\"]/div/div/div[3]/div/a[2]"))); // проверка работы кнопки "Почта"
            link24.click();
            driver.navigate().back(); // Возврат назад

        @AfterClass
        public void driverClose() {

            driver.quit();
        }

        }
    }
}
