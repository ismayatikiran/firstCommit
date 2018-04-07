import org.testng.Assert;
public class ApplyCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator() ;
        Assert.assertEquals(cal.addition(10,15), 25);
        Assert.assertEquals(cal.subtraction(10,15), 5);
        Assert.assertEquals(cal.multiplication(10,15), 150);




    }

}
