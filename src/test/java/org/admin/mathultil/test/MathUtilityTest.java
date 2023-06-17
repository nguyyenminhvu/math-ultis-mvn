/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.admin.mathultil.test;

import org.admin.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {

    @Test
    public void TestFactorialGivenRightArgumentReturnsWell() {
        assertEquals(1, MathUtility.getFatorial(0));
        assertEquals(1, MathUtility.getFatorial(1));
        assertEquals(2, MathUtility.getFatorial(2));
        assertEquals(6, MathUtility.getFatorial(3));
        assertEquals(120, MathUtility.getFatorial(5));
    }
    //TDD: TEST DRIVEN DEVELOPMENT
    //DDT: DATA DRIVEN TESTING
    
}
