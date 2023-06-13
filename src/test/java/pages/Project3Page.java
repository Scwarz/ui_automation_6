package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Project3Page {
    public Project3Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".mr-1[value='One way']")
    public WebElement oneWayButton;

    @FindBy(css = ".mr-1[value='Round trip']")
    public WebElement roundTripButton;

    @FindBy(css = ".field:nth-child(2) > label")
    public WebElement cabinClassLabel;

    @FindBy(css = ".field:nth-child(2) option")
    public WebElement cabinClassDropDown;

    @FindBy(css = ".field:nth-child(2) option")
    public List<WebElement> cabinClassList;

    @FindBy(css = ".field:nth-child(3) > label")
    public WebElement fromLabel;

    @FindBy(css = ".field:nth-child(3) option")
    public WebElement fromDropDown;

    @FindBy(css = ".field:nth-child(4) > label")
    public WebElement toLabel;

    @FindBy(css = ".field:nth-child(4) option")
    public WebElement toDropDown;

    @FindBy(css = ".field:nth-child(5) > label")
    public WebElement departLabel;

    @FindBy(xpath = "//div[@class='field'][5]//div[contains(@class, 'react-date-picker')]")
    public WebElement departDatePicker;

    @FindBy(css = ".field:nth-child(6) > label")
    public WebElement returnLabel;

    @FindBy(xpath = "//div[@class='field'][6]//div[contains(@class, 'react-date-picker')]")
    public WebElement returnDatePicker;

    @FindBy(css = ".field:nth-child(7) > label")
    public WebElement numberOfPassengersLabel;

    @FindBy(css = ".field:nth-child(7) select")
    public WebElement numberOfPassengerSelect;

    @FindBy(css = ".field:nth-child(7) option")
    public WebElement numberOfPassengersDropDown;

    @FindBy(css = ".field:nth-child(8) select")
    public WebElement passengerOneSelect;

    @FindBy(css = ".field:nth-child(9) select")
    public WebElement passengerTwoSelect;

    @FindBy(css = ".field:nth-child(8) > label")
    public WebElement passengerOneLabel;

    @FindBy(css = ".field:nth-child(8) option")
    public WebElement passengerOneDropDown;

    @FindBy(css = "button[class*='Button_c_button__w4+7K null']")
    public WebElement bookButton;

    @FindBy(css = ".field:nth-child(3) select")
    public WebElement fromStateSelect;

    @FindBy(css = ".field:nth-child(4) select")
    public WebElement toStateSelect;

    @FindBy(css = ".field:nth-child(5) .control input[name='month']")
    public WebElement month;

    @FindBy(css = ".field:nth-child(5) .control input[name='day']")
    public WebElement day;

    @FindBy(css = ".field:nth-child(5) .control input[name='year']")
    public WebElement year;

    @FindBy(css = ".field:nth-child(6) .control input[name='month']")
    public WebElement monthReturn;

    @FindBy(css = ".field:nth-child(6) .control input[name='day']")
    public WebElement dayReturn;

    @FindBy(css = ".field:nth-child(6) .control input[name='year']")
    public WebElement yearReturn;

    @FindBy(css = ".ml-3 h3")
    public WebElement fromToConfirm;

    @FindBy(css = ".ml-3 div:nth-child(2) h3")
    public WebElement returnFrom;

    @FindBy(css = ".ml p")
    public WebElement returnConfirmDate;

    @FindBy(css = ".ml-3 p")
    public List<WebElement> dateOfFlightShow;

}
