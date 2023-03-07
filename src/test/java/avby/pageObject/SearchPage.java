package avby.pageObject;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SearchPage extends BasePage {
    private static final Label PAGE_LOCATOR = new Label(By.xpath("//h1[@class='journal-heading__title' and text()='Обзоры']"));
    private static final By pageLocator = By.xpath("//h1[@class='journal-heading__title' and text()='%s']");
    private static final String NAV_MARK = "//span[@class='catalog__title' and text()='%s']";
    private static final String NAV_MARK_MODEL = "//span[@class='dropdown-floatlabel__value' and text()='%s']";
    private static final String NAV_MARK_MODEL_AUTO = "//div[@class='dropdown' and @id='p-6-0-3-model']//button[@class='dropdown__listbutton' and text()='%s']";
    private static final String TYPE_OF_GEAR = "//span[@class='button-group__text' and text()='%s']";
    private static final String GENERATION_AUTO = "//span[@class='dropdown-floatlabel__value' and text()='%s']";
    private static final String GENERATION_AUTO_CLICK = "//span[@class='dropdown__card-text' and text()='%s']";
    private static final String SELECT_YEAR_OF_MANUFACTURE = "//span[@class='dropdown-floatlabel__value' and text()='%s']";
    private static final String SELECT_YEAR = "//button[@class='dropdown__listbutton' and text()='%s']";
    private static final Button TYPE_OF_ENGINE = new Button(By.xpath("//button[@name='p-15-engine_type']//span[@class='dropdown-button__value']"));
    private static final String SELECT_TYPE_OF_ENGINE = "//span[@class='checkbox__description' and text()='дизель']";
    private static final String SHOW = "//span[@class='button__text' and text()='%s']";

    public SearchPage() {
        super(pageLocator, "'Search' Page");
    }

    @Step("Проверка загрузившейся страницы.")
    public void isPageOpened() {
        Assert.assertTrue(PAGE_LOCATOR.isDisplayed(), "ERROR: Страница 'Review page' не была загружена!!!");
    }

    @Step(" Выбор марки Renault.")
    public void navigateMark(String markPage) {
        Label navMarkPage = new Label(By.xpath(String.format(NAV_MARK, markPage)));
        navMarkPage.clickAndWait();
    }

    @Step(" Выбор модель.")
    public void navigateMarkModel(String modelPage) {
        Label navMarkModelPage = new Label(By.xpath(String.format(NAV_MARK_MODEL, modelPage)));
        navMarkModelPage.clickAndWait();
    }

    @Step(" Выбор модель Scenic.")
    public void navigateMarkModeAuto(String autoPage) {
        Label navMarkModelAutoPage = new Label(By.xpath(String.format(NAV_MARK_MODEL_AUTO, autoPage)));
        navMarkModelAutoPage.clickAndWait();
    }

    @Step(" Выбор коробки передач механика.")
    public void clickTypeOfGear(String typeGear) {
        Label clTypeOfGear = new Label(By.xpath(String.format(TYPE_OF_GEAR, typeGear)));
        clTypeOfGear.clickAndWait();
    }

    @Step(" Выбор поколение авто.")
    public void clickGenerationAuto(String generAuto) {
        Label clGenAuto = new Label(By.xpath(String.format(GENERATION_AUTO, generAuto)));
        clGenAuto.clickAndWait();
    }

    @Step(" Выбор поколение авто 'IV, 2016…'.")
    public void clickGenerationAutoClick(String generAutoCl) {
        Label clGenAutoCl = new Label(By.xpath(String.format(GENERATION_AUTO_CLICK, generAutoCl)));
        clGenAutoCl.clickAndWait();
    }

    @Step(" Выбор года.")
    public void clickManufactureYear(String manufYear) {
        Label manufactureYear = new Label(By.xpath(String.format(SELECT_YEAR_OF_MANUFACTURE, manufYear)));
        manufactureYear.clickAndWait();
    }

    @Step(" Выбор года fdnj '2018'.")
    public void clickManufactureYearAuto(String autoYear) {
        Label manufactureYearAuto = new Label(By.xpath(String.format(SELECT_YEAR, autoYear)));
        manufactureYearAuto.clickAndWait();
    }

    @Step(" Тип двигателя.")
    public void clickTypeOfEngine() {
        TYPE_OF_ENGINE.clickAndWait();
    }

    @Step(" Выбор типа двигателя 'дизель'.")
    public void clickSelectTypeOfEngine(String typeEngine) {
        Label selectTypeOfEngine = new Label(By.xpath(String.format(SELECT_TYPE_OF_ENGINE, typeEngine)));
        selectTypeOfEngine.clickAndWait();
    }

    @Step(" Нажать показать 'Показать'.")
    public void clickShow(String showAuto) {
        Label show = new Label(By.xpath(String.format(SHOW, showAuto)));
        show.clickAndWait();
    }
}
