import io.qameta.allure.*;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Epic1")
public class CalculatorTest {

    @Test
    @Story("User story1")
    @Description("Description related to testAdd test")
    @Severity(SeverityLevel.NORMAL)
    @Tag("Tag1")
    @Link("http://www.google.com")
    public void testAdd() {
        Calculator calc = createCalc();

        Assertions.assertEquals(5, calc.Add(2,3));
    }
    //@Step("Calculator initiulazion")
    private Calculator createCalc(){
        return new Calculator();
    }

    @Test
    @Story("user Story2")
    @Description("Description related to testAddWithNegative test")
    //@Attachment()
    @Severity(SeverityLevel.BLOCKER)
    @Tag("Tag2")
    public void testAddWithNegative(){
        Calculator calc = createCalc();
        Assertions.assertEquals(-5, calc.Add(-2,-3));
    }
}
