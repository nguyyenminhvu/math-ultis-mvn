/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.admin.mathultil.test;

import org.admin.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ACER
 */
public class MathUtilityAdvencedTest {

    public static Object[][] initTestData() {
        Object[][] TestData = {{0, 1}, {1, 1}, {2, 2}, {5, 120}, {6, 720}};
        return TestData;
    }

    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void TestFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFatorial(n));
    }
}
//TDD VS DDT
//TDD - Test Driven Development
// Ky thuat viet code chinhs dan xen, xen ke cung voi viet Test Case/ Test Script(Junit, TestNG, xUnit, MSTest...)


//DDT - Data Driven Testing
//la ki thuat bo tro/ mo rong them cho ki thuat TDD
//la ki thuat test code ma ta tach rieng nhung bo data test ra 1 cho (PARAMETERIZED TESTING)
// KI THUAT KIEM THU CODE MA HUONG VE THAM SO HOA CAC DATA TEST
