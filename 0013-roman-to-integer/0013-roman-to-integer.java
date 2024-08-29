class Solution {
    
    public static int romanToInt(String s) {
        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int current = valueOfRoman(s.charAt(i));
            if (i + 1 < length && valueOfRoman(s.charAt(i + 1)) > current) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    private static int valueOfRoman(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral character");
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));    // Output: 3
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}
