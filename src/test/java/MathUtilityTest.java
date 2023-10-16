/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.leon.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Leon
 */
public class MathUtilityTest {
    
    //Test case #1: Verify getFactorial(with n = 0)
    //Steps/Procedures:
    //      1. Given n=0 
    //      2. Call/invoke getFactorial(n=0)
    // Expected result:
    //                  the method must reutrn 1 as the result of 0! = 1
    //Status: PASSED | FAILED chờ lúc chạy hàm mới biết status dúng sai 
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument2ReturnsOk() {
        assertEquals(2, MathUtility.getFactorial(2));
    }
}
