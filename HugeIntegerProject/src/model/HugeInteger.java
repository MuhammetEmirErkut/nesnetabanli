package HugeIntegerProject.src.model;

public class HugeInteger {
    private static final int SIZE = 40;
    private int[] digits = new int[SIZE];
    
    public HugeInteger() {}
    
    public HugeInteger(String value) {
        parse(value);
    }
    
    public void parse(String value) {
        if (value == null || value.length() > SIZE) {
            throw new IllegalArgumentException("String must be " + SIZE + " digits or less");
        }
        int start = SIZE - value.length();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("String must contain only digits");
            }
            digits[start + i] = c - '0';
        }
    }
    
    public String toString() {
        int start = 0;
        while (start < SIZE && digits[start] == 0) start++;
        if (start == SIZE) return "0";
        
        StringBuilder sb = new StringBuilder(SIZE - start);
        for (int i = start; i < SIZE; i++) {
            sb.append(digits[i]);
        }
        return sb.toString();
    }
    
    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        for (int i = SIZE - 1; i >= 0; i--) {
            int sum = digits[i] + other.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) throw new ArithmeticException("Overflow");
        return result;
    }
    
    public HugeInteger subtract(HugeInteger other) {
        if (compareTo(other) < 0) {
            throw new ArithmeticException("Result would be negative");
        }
        HugeInteger result = new HugeInteger();
        int borrow = 0;
        for (int i = SIZE - 1; i >= 0; i--) {
            int diff = digits[i] - other.digits[i] - borrow;
            borrow = diff < 0 ? 1 : 0;
            result.digits[i] = (diff + 10) % 10;
        }
        return result;
    }
    
    // Helper method for comparisons
    private int compareTo(HugeInteger other) {
        for (int i = 0; i < SIZE; i++) {
            if (digits[i] != other.digits[i]) {
                return digits[i] - other.digits[i];
            }
        }
        return 0;
    }
    
    public boolean isEqualTo(HugeInteger other) {
        return compareTo(other) == 0;
    }
    
    public boolean isNotEqualTo(HugeInteger other) {
        return compareTo(other) != 0;
    }
    
    public boolean isGreaterThan(HugeInteger other) {
        return compareTo(other) > 0;
    }
    
    public boolean isLessThan(HugeInteger other) {
        return compareTo(other) < 0;
    }
    
    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return compareTo(other) >= 0;
    }
    
    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return compareTo(other) <= 0;
    }
    
    public boolean isZero() {
        for (int digit : digits) {
            if (digit != 0) return false;
        }
        return true;
    }
    
    public HugeInteger multiply(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        for (int i = SIZE - 1; i >= 0; i--) {
            if (digits[i] == 0) continue;
            HugeInteger temp = new HugeInteger();
            int carry = 0;
            for (int j = SIZE - 1; j >= 0; j--) {
                int pos = i + j - (SIZE - 1);
                if (pos < 0 || pos >= SIZE) continue;
                int product = digits[i] * other.digits[j] + carry;
                temp.digits[pos] = product % 10;
                carry = product / 10;
            }
            if (carry > 0) throw new ArithmeticException("Overflow");
            result = result.add(temp);
        }
        return result;
    }
    
    public HugeInteger divide(HugeInteger other) {
        if (other.isZero()) throw new ArithmeticException("Division by zero");
        if (isLessThan(other)) return new HugeInteger("0");
        
        HugeInteger quotient = new HugeInteger("0");
        HugeInteger one = new HugeInteger("1");
        HugeInteger remainder = new HugeInteger();
        System.arraycopy(this.digits, 0, remainder.digits, 0, SIZE);
        
        while (remainder.isGreaterThanOrEqualTo(other)) {
            remainder = remainder.subtract(other);
            quotient = quotient.add(one);
        }
        return quotient;
    }
    
    public HugeInteger remainder(HugeInteger other) {
        if (other.isZero()) throw new ArithmeticException("Division by zero");
        if (isLessThan(other)) {
            HugeInteger result = new HugeInteger();
            System.arraycopy(this.digits, 0, result.digits, 0, SIZE);
            return result;
        }
        
        HugeInteger remainder = new HugeInteger();
        System.arraycopy(this.digits, 0, remainder.digits, 0, SIZE);
        while (remainder.isGreaterThanOrEqualTo(other)) {
            remainder = remainder.subtract(other);
        }
        return remainder;
    }
}
