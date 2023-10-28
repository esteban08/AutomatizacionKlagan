package co.com.klagan.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class googlePage {
public static final Target TEXTAREA = Target.the("Option Search").located(By.id("APjFqb"));
public static final Target SEARCH = Target.the("Search").locatedBy("(//input[@class='gNO89b'])[1]");
public static final Target OPTION = Target.the("Option Wikipedia").locatedBy("(//h3[@class='LC20lb MBeuO DKV0Md'])[8]");
public static final Target HISTORY = Target.the("Option history consult year").locatedBy("(//a[@class='vector-toc-link'])[9]");
public static final Target TITLE = Target.the("The user view").locatedBy("(//a[@title='Termostato'])[1]");
}
