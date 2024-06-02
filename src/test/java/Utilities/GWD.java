package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); //Her bir thread e özel static
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();
    public static WebDriver wait;

    //threadDriver.get() ->bulunduğu hattaki driverı ver
    //threadDriver.set() ->bulunduğun hata bir tane driver set et.


    // Her bir sürecin kendine özel STATİC driverı olmalı : Local Static diyeceğiz
    // süreç = Thread
    // Thread.Sleep => ilgili süreci durduryor belli süre
    // her bir Thread in kendine özel STATİC i olmalı, yani LOCAL Static


    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");



        if (threadBrowserName.get()==null) // XML den çalışmayan durumlar için
            threadBrowserName.set("chrome");  // default chrome

        if (threadDriver.get() == null) { //1 kez oluştur

            switch (threadBrowserName.get())
            {
                case "firefox" : threadDriver.set(new FirefoxDriver()); break;
                case "edge" : threadDriver.set(new EdgeDriver()); break;
                default: threadDriver.set(new ChromeDriver());  //bulunduğum hatta driver yok idi, ben bir tane set ettim
            }

            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }


        return threadDriver.get();
    }



    public static void quitDriver() {

        //test sonucu ekranı bir süre beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver kapat
        if (threadDriver.get() != null) {
            threadDriver.get().quit();

            WebDriver driver = threadDriver.get(); // hattaki driverı aldım
            driver = null; // boş yaptım
            threadDriver.set(driver); // tekrar atadım.
        }
    }
}
