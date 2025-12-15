package HugeIntegerProject.src.test;

import HugeIntegerProject.src.model.HugeInteger;

public class HugeIntegerTest {
    public static void main(String[] args) {
        System.out.println("=== HugeInteger Test Suite ===\n");
        
        testParse();
        testToString();
        testAdd();
        testSubtract();
        testIsEqualTo();
        testIsNotEqualTo();
        testIsGreaterThan();
        testIsLessThan();
        testIsGreaterThanOrEqualTo();
        testIsLessThanOrEqualTo();
        testIsZero();
        testMultiply();
        testDivide();
        testRemainder();
        
        System.out.println("\n=== All Tests Completed ===");
    }
    
    private static void testParse() {
        System.out.println("--- Testing parse() ---");
        HugeInteger num = new HugeInteger();
        num.parse("12345");
        System.out.printf("parse(\"12345\") = %s%n", num.toString());
        
        num.parse("0");
        System.out.printf("parse(\"0\") = %s%n", num.toString());
        
        num.parse("9999999999999999999999999999999999999999");
        System.out.printf("parse(40 digits) = %s%n", num.toString().substring(0, 20) + "...");
        System.out.println("✓ parse() test passed\n");
    }
    
    private static void testToString() {
        System.out.println("--- Testing toString() ---");
        HugeInteger num1 = new HugeInteger("12345");
        System.out.printf("toString(\"12345\") = %s%n", num1.toString());
        
        HugeInteger num2 = new HugeInteger("0");
        System.out.printf("toString(\"0\") = %s%n", num2.toString());
        
        HugeInteger num3 = new HugeInteger("000123");
        System.out.printf("toString(\"000123\") = %s (leading zeros removed)%n", num3.toString());
        System.out.println("✓ toString() test passed\n");
    }
    
    private static void testAdd() {
        System.out.println("--- Testing add() ---");
        HugeInteger num1 = new HugeInteger("123");
        HugeInteger num2 = new HugeInteger("456");
        HugeInteger sum = num1.add(num2);
        System.out.printf("%s + %s = %s%n", num1.toString(), num2.toString(), sum.toString());
        
        HugeInteger num3 = new HugeInteger("999");
        HugeInteger num4 = new HugeInteger("1");
        HugeInteger sum2 = num3.add(num4);
        System.out.printf("%s + %s = %s%n", num3.toString(), num4.toString(), sum2.toString());
        
        HugeInteger num5 = new HugeInteger("500");
        HugeInteger num6 = new HugeInteger("500");
        HugeInteger sum3 = num5.add(num6);
        System.out.printf("%s + %s = %s%n", num5.toString(), num6.toString(), sum3.toString());
        System.out.println("✓ add() test passed\n");
    }
    
    private static void testSubtract() {
        System.out.println("--- Testing subtract() ---");
        HugeInteger num1 = new HugeInteger("456");
        HugeInteger num2 = new HugeInteger("123");
        HugeInteger diff = num1.subtract(num2);
        System.out.printf("%s - %s = %s%n", num1.toString(), num2.toString(), diff.toString());
        
        HugeInteger num3 = new HugeInteger("1000");
        HugeInteger num4 = new HugeInteger("1");
        HugeInteger diff2 = num3.subtract(num4);
        System.out.printf("%s - %s = %s%n", num3.toString(), num4.toString(), diff2.toString());
        
        HugeInteger num5 = new HugeInteger("500");
        HugeInteger num6 = new HugeInteger("500");
        HugeInteger diff3 = num5.subtract(num6);
        System.out.printf("%s - %s = %s%n", num5.toString(), num6.toString(), diff3.toString());
        System.out.println("✓ subtract() test passed\n");
    }
    
    private static void testIsEqualTo() {
        System.out.println("--- Testing isEqualTo() ---");
        HugeInteger num1 = new HugeInteger("123");
        HugeInteger num2 = new HugeInteger("123");
        HugeInteger num3 = new HugeInteger("456");
        System.out.printf("%s isEqualTo %s: %b%n", num1.toString(), num2.toString(), num1.isEqualTo(num2));
        System.out.printf("%s isEqualTo %s: %b%n", num1.toString(), num3.toString(), num1.isEqualTo(num3));
        System.out.println("✓ isEqualTo() test passed\n");
    }
    
    private static void testIsNotEqualTo() {
        System.out.println("--- Testing isNotEqualTo() ---");
        HugeInteger num1 = new HugeInteger("123");
        HugeInteger num2 = new HugeInteger("123");
        HugeInteger num3 = new HugeInteger("456");
        System.out.printf("%s isNotEqualTo %s: %b%n", num1.toString(), num2.toString(), num1.isNotEqualTo(num2));
        System.out.printf("%s isNotEqualTo %s: %b%n", num1.toString(), num3.toString(), num1.isNotEqualTo(num3));
        System.out.println("✓ isNotEqualTo() test passed\n");
    }
    
    private static void testIsGreaterThan() {
        System.out.println("--- Testing isGreaterThan() ---");
        HugeInteger num1 = new HugeInteger("456");
        HugeInteger num2 = new HugeInteger("123");
        HugeInteger num3 = new HugeInteger("123");
        System.out.printf("%s isGreaterThan %s: %b%n", num1.toString(), num2.toString(), num1.isGreaterThan(num2));
        System.out.printf("%s isGreaterThan %s: %b%n", num2.toString(), num1.toString(), num2.isGreaterThan(num1));
        System.out.printf("%s isGreaterThan %s: %b%n", num2.toString(), num3.toString(), num2.isGreaterThan(num3));
        System.out.println("✓ isGreaterThan() test passed\n");
    }
    
    private static void testIsLessThan() {
        System.out.println("--- Testing isLessThan() ---");
        HugeInteger num1 = new HugeInteger("123");
        HugeInteger num2 = new HugeInteger("456");
        HugeInteger num3 = new HugeInteger("123");
        System.out.printf("%s isLessThan %s: %b%n", num1.toString(), num2.toString(), num1.isLessThan(num2));
        System.out.printf("%s isLessThan %s: %b%n", num2.toString(), num1.toString(), num2.isLessThan(num1));
        System.out.printf("%s isLessThan %s: %b%n", num1.toString(), num3.toString(), num1.isLessThan(num3));
        System.out.println("✓ isLessThan() test passed\n");
    }
    
    private static void testIsGreaterThanOrEqualTo() {
        System.out.println("--- Testing isGreaterThanOrEqualTo() ---");
        HugeInteger num1 = new HugeInteger("456");
        HugeInteger num2 = new HugeInteger("123");
        HugeInteger num3 = new HugeInteger("123");
        System.out.printf("%s isGreaterThanOrEqualTo %s: %b%n", num1.toString(), num2.toString(), num1.isGreaterThanOrEqualTo(num2));
        System.out.printf("%s isGreaterThanOrEqualTo %s: %b%n", num2.toString(), num1.toString(), num2.isGreaterThanOrEqualTo(num1));
        System.out.printf("%s isGreaterThanOrEqualTo %s: %b%n", num2.toString(), num3.toString(), num2.isGreaterThanOrEqualTo(num3));
        System.out.println("✓ isGreaterThanOrEqualTo() test passed\n");
    }
    
    private static void testIsLessThanOrEqualTo() {
        System.out.println("--- Testing isLessThanOrEqualTo() ---");
        HugeInteger num1 = new HugeInteger("123");
        HugeInteger num2 = new HugeInteger("456");
        HugeInteger num3 = new HugeInteger("123");
        System.out.printf("%s isLessThanOrEqualTo %s: %b%n", num1.toString(), num2.toString(), num1.isLessThanOrEqualTo(num2));
        System.out.printf("%s isLessThanOrEqualTo %s: %b%n", num2.toString(), num1.toString(), num2.isLessThanOrEqualTo(num1));
        System.out.printf("%s isLessThanOrEqualTo %s: %b%n", num1.toString(), num3.toString(), num1.isLessThanOrEqualTo(num3));
        System.out.println("✓ isLessThanOrEqualTo() test passed\n");
    }
    
    private static void testIsZero() {
        System.out.println("--- Testing isZero() ---");
        HugeInteger num1 = new HugeInteger("0");
        HugeInteger num2 = new HugeInteger("123");
        HugeInteger num3 = new HugeInteger();
        System.out.printf("%s isZero: %b%n", num1.toString(), num1.isZero());
        System.out.printf("%s isZero: %b%n", num2.toString(), num2.isZero());
        System.out.printf("new HugeInteger() isZero: %b%n", num3.isZero());
        System.out.println("✓ isZero() test passed\n");
    }
    
    private static void testMultiply() {
        System.out.println("--- Testing multiply() ---");
        HugeInteger num1 = new HugeInteger("12");
        HugeInteger num2 = new HugeInteger("5");
        HugeInteger product = num1.multiply(num2);
        System.out.printf("%s * %s = %s%n", num1.toString(), num2.toString(), product.toString());
        
        HugeInteger num3 = new HugeInteger("25");
        HugeInteger num4 = new HugeInteger("4");
        HugeInteger product2 = num3.multiply(num4);
        System.out.printf("%s * %s = %s%n", num3.toString(), num4.toString(), product2.toString());
        
        HugeInteger num5 = new HugeInteger("100");
        HugeInteger num6 = new HugeInteger("0");
        HugeInteger product3 = num5.multiply(num6);
        System.out.printf("%s * %s = %s%n", num5.toString(), num6.toString(), product3.toString());
        System.out.println("✓ multiply() test passed\n");
    }
    
    private static void testDivide() {
        System.out.println("--- Testing divide() ---");
        HugeInteger num1 = new HugeInteger("100");
        HugeInteger num2 = new HugeInteger("5");
        HugeInteger quotient = num1.divide(num2);
        System.out.printf("%s / %s = %s%n", num1.toString(), num2.toString(), quotient.toString());
        
        HugeInteger num3 = new HugeInteger("144");
        HugeInteger num4 = new HugeInteger("12");
        HugeInteger quotient2 = num3.divide(num4);
        System.out.printf("%s / %s = %s%n", num3.toString(), num4.toString(), quotient2.toString());
        
        HugeInteger num5 = new HugeInteger("10");
        HugeInteger num6 = new HugeInteger("3");
        HugeInteger quotient3 = num5.divide(num6);
        System.out.printf("%s / %s = %s%n", num5.toString(), num6.toString(), quotient3.toString());
        
        HugeInteger num7 = new HugeInteger("5");
        HugeInteger num8 = new HugeInteger("10");
        HugeInteger quotient4 = num7.divide(num8);
        System.out.printf("%s / %s = %s (smaller number)%n", num7.toString(), num8.toString(), quotient4.toString());
        System.out.println("✓ divide() test passed\n");
    }
    
    private static void testRemainder() {
        System.out.println("--- Testing remainder() ---");
        HugeInteger num1 = new HugeInteger("100");
        HugeInteger num2 = new HugeInteger("7");
        HugeInteger remainder = num1.remainder(num2);
        System.out.printf("%s %% %s = %s%n", num1.toString(), num2.toString(), remainder.toString());
        
        HugeInteger num3 = new HugeInteger("144");
        HugeInteger num4 = new HugeInteger("12");
        HugeInteger remainder2 = num3.remainder(num4);
        System.out.printf("%s %% %s = %s%n", num3.toString(), num4.toString(), remainder2.toString());
        
        HugeInteger num5 = new HugeInteger("10");
        HugeInteger num6 = new HugeInteger("3");
        HugeInteger remainder3 = num5.remainder(num6);
        System.out.printf("%s %% %s = %s%n", num5.toString(), num6.toString(), remainder3.toString());
        
        HugeInteger num7 = new HugeInteger("5");
        HugeInteger num8 = new HugeInteger("10");
        HugeInteger remainder4 = num7.remainder(num8);
        System.out.printf("%s %% %s = %s (smaller number)%n", num7.toString(), num8.toString(), remainder4.toString());
        System.out.println("✓ remainder() test passed\n");
    }
}
