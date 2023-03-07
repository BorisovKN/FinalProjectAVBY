package avby.pageObject;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.InPut;
import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class AdPage extends BasePage {
    private static final By pageLocator = By.xpath("//h1[@class='heading__text']");
    private static final Button SUBMIT_AN_AD = new Button(By.xpath("//a[@class='button button--primary button--block button--small']"));
    private static final String TIRES_AND_WHEELS = "//span[@class='category-item__title' and text()='%s']";
    private static final String CLICK_WHEELS = "//span[@class='catalog__description-text' and text()='%s']";
    private static final Button QUANTITY = new Button(By.xpath("//button[contains(@class,'dropdown__control') and @name='p-7-selling_count']"));
    private static final Button CHOOSE_QUANTITY = new Button(By.xpath("//button[@class='dropdown__listbutton' and @data-item-label='4' and @data-property-label='Количество']"));
    private static final Button TYPE_OF_WHEELS = new Button(By.xpath("//button[contains(@class,'dropdown__control') and @name='p-31-disk_type']"));
    private static final Button CHOOSE_TYPE_OF_WHEELS = new Button(By.xpath("//button[@class='dropdown__listbutton' and @data-item-label='литые']"));
    private static final String CONDITION = "//span[@class='button-group__text' and text()='%s']";
    private static final Button DISC_WIDTH = new Button(By.xpath("//button[@class='dropdown__control dropdown-button' and @name='p-32-disk_width_inch']"));
    private static final Button CHOOSE_DISC_WIDTH = new Button(By.xpath("//button[@class='dropdown__listbutton' and @data-item-label='6']"));
    private static final Button DISC_DIAMETER = new Button(By.xpath("//button[@class='dropdown__control dropdown-button' and @name='p-33-disk_diameter_inch']"));
    private static final Button CHOOSE_DISC_DIAMETER = new Button(By.xpath("//button[@class='dropdown__listbutton' and @data-item-label='17' and @data-property-name='disk_diameter_inch']"));
    private static final Button PCD = new Button(By.xpath("//button[@class='dropdown__control dropdown-button' and @name='p-34-disk_pitch_circle_diameter']"));
    private static final Button CHOOSE_PCD = new Button(By.xpath("//button[@class='dropdown__listbutton' and @data-item-label='5x114.3']"));
    private static final Button ET = new Button(By.xpath("//button[@class='dropdown__control dropdown-button' and @name='p-35-disk_et']"));
    private static final Button CHOOSE_ET = new Button(By.xpath("//button[@class='dropdown__listbutton' and @data-item-label='45']"));
    private static final Button DIA = new Button(By.xpath("//button[@class='dropdown__control dropdown-button' and @name='p-36-disk_dia']"));
    private static final Button CHOOSE_DIA = new Button(By.xpath("//button[@class='dropdown__listbutton' and @data-item-label='70.1']"));
    private static final Button ONWARD = new Button(By.xpath("//button[@class='button button--primary button--small']"));
    private static final Button CHOOSE_PHOTO = new Button(By.xpath("//span[contains(@class,'button form-inputfile')]/../input"));
    private static final Label DESCRIPTION = new Label(By.xpath("//textarea[@class='form-control']"));
    private static final InPut INPUT_PRICE = new InPut(By.xpath("//input[@class='form-control' and @name='p-42-price_amount']"));
    private static final InPut INPUT_NAME = new InPut(By.xpath("//input[@class='form-control' and @name='p-44-seller_name']"));
    private static final InPut INPUT_PHONE = new InPut(By.xpath("//input[@class='form-control' and @name='p-47-0-46-phone_number']"));
    private static final Label CHECK_BOX = new Label(By.xpath("//span[@class='checkbox__description' and contains(text(),'Ознакомлен с')]"));
    private static final Button CLICK_PUBLISH = new Button(By.xpath("//button[@class='button button--action button--large']"));


    @Step("Открытие страницы подачи объявления.")
    public void submitAnAd() {
        SUBMIT_AN_AD.clickAndWait();
    }
    public AdPage() {
        super(pageLocator, "'Ad' Page");
    }

    @Step("Выбрать 'Шины и диски'.")
    public void clickTiresAndWheels(String tiresWheels) {
        Label clickTiresWheels = new Label(By.xpath(String.format(TIRES_AND_WHEELS, tiresWheels)));
        clickTiresWheels.moveToElement();
        clickTiresWheels.clickAndWait();
    }

    @Step("Выбрать 'Диски'.")
    public void clickWheels(String tiresWheels) {
        Label clickWheel = new Label(By.xpath(String.format(CLICK_WHEELS, tiresWheels)));
        clickWheel.clickAndWait();
    }

    @Step("Нажать количество.")
    public void quantity() {
        QUANTITY.clickAndWait();
    }

    @Step("Выбрать количество.")
    public void chooseQuantity() {
        CHOOSE_QUANTITY.clickAndWait();
    }

    @Step("Нажать тип диска.")
    public void typeOfWheels() {
        TYPE_OF_WHEELS.clickViaJS();
    }

    @Step("Выбрать тип диска.")
    public void chooseTypeOfWheels() {
        CHOOSE_TYPE_OF_WHEELS.clickAndWait();
    }

    @Step("Выбрать 'с пробегом'.")
    public void conditionWheels(String tiresWheels) {
        Label condition = new Label(By.xpath(String.format(CONDITION, tiresWheels)));
        condition.clickViaJS();
    }

    @Step("Нажать ширина диска.")
    public void discWidth() {
        DISC_WIDTH.scrollIntoView();
        DISC_WIDTH.clickAndWait();
    }

    @Step("Выбрать ширину диска.")
    public void chooseDiscWidth() {
        CHOOSE_DISC_WIDTH.scrollIntoView();
        CHOOSE_DISC_WIDTH.click();
    }

    @Step("Нажать диаметр диска.")
    public void discDiameter() {
        DISC_DIAMETER.scrollIntoView();
        DISC_DIAMETER.clickViaJS();
    }

    @Step("Выбрать диаметр диска.")
    public void chooseDiscDiameter() {
        CHOOSE_DISC_DIAMETER.scrollIntoView();
        CHOOSE_DISC_DIAMETER.clickViaJS();
    }

    @Step("Нажать сверловка.")
    public void pCD() {
        PCD.scrollIntoView();
        PCD.clickViaJS();
    }

    @Step("Выбрать сверловку.")
    public void choosePCD() {
        CHOOSE_PCD.scrollIntoView();
        CHOOSE_PCD.clickViaJS();
    }

    @Step("Нажать ЕТ.")
    public void eT() {
        ET.scrollIntoView();
        ET.clickViaJS();
    }

    @Step("Выбрать ЕТ.")
    public void chooseET() {
        CHOOSE_ET.scrollIntoView();
        CHOOSE_ET.clickViaJS();
    }

    @Step("Нажать DIA.")
    public void clickDIA() {
        DIA.scrollIntoView();
        DIA.clickViaJS();
    }

    @Step("Выбрать DIA.")
    public void chooseDIA() {
        CHOOSE_DIA.scrollIntoView();
        CHOOSE_DIA.clickViaJS();
    }

    @Step("Нажать далее.")
    public void clickONWARD() {
        ONWARD.scrollIntoView();
        ONWARD.clickViaJS();
    }

    @Step("Нажать выбрать фото.")
    public void clickChoosePhoto() {
        CHOOSE_PHOTO.scrollIntoView();
        CHOOSE_PHOTO.sendKeys(System.getProperty("user.dir") + "\\src\\test\\photo\\car.jpg");
    }

    @Step("Нажать далее.")
    public void clickONWARDS() {
        ONWARD.scrollIntoView();
        ONWARD.clickViaJS();
    }

    @Step("Ввести описание.")
    public void inputDescription() {
        DESCRIPTION.scrollIntoView();
        DESCRIPTION.sendKeys("Диски литые в комплекте с зимней резиной");
    }

    @Step("Ввести цену.")
    public void inputPrice() {
        INPUT_PRICE.scrollIntoView();
        INPUT_PRICE.sendKeys("650");
    }

    @Step("Ввести цену.")
    public void inputName() {
        INPUT_NAME.scrollIntoView();
        INPUT_NAME.sendKeys("Иван");
    }

    @Step("Ввести номер.")
    public void inputPhone() {
        INPUT_PHONE.scrollIntoView();
        INPUT_PHONE.sendKeys("336929823");
    }

    @Step("Нажать чекбокс.")
    public void checkBox() {
        CHECK_BOX.scrollIntoView();
        CHECK_BOX.clickViaJS();
    }

    @Step("Нажать опубликовать.")
    public void clickPublish() {
        CLICK_PUBLISH.scrollIntoView();
        CLICK_PUBLISH.clickViaJS();
    }

}
