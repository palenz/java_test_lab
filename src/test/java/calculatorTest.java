import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatorTest {

    Calculator calculator;


    @Test
    public void add(){
        calculator = new Calculator(3, 2);
        assertEquals(5, this.calculator.add(), 0.01);
    }

    @Test
    public void substractsToOne(){
        calculator = new Calculator(100, 99);
        assertEquals(1, calculator.substract(),0.01);
    }

    @Test
    public void multiply(){
        calculator = new Calculator(2, 3);
        assertEquals(6, calculator.multiply(), 0.01);
    }

    @Test
    public void divideToOneAndAHalf(){
        calculator = new Calculator(3, 2);
        assertEquals(1.5, calculator.divide(), 0.01);
    }




}
