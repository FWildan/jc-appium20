import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import io.appium.java_client.pagefactory.MobileElementLocatorFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TransactionTest {
    private AppiumDriver<MobileElement> driver;

    public TransactionTest(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "input_expense")
    private MobileElement expenseInput;

    @FindBy(id = "input_income")
    private MobileElement incomeInput;

    @FindBy(id = "btn_save")
    private MobileElement saveButton;

    @Test
    public void testAddTransaction() {
        // Tambahkan transaksi pengeluaran
        expenseInput.sendKeys("100");
        saveButton.click();

        // Tambahkan transaksi pemasukan
        incomeInput.sendKeys("200");
        saveButton.click();

        // Validasi transaksi pengeluaran dan pemasukan
        // menggunakan assercions atau metode lainnya untuk validasi
    }
}