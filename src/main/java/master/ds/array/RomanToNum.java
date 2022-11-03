package master.ds.array;
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/
public class RomanToNum {
    public static int romanToInt(String s) {
        int cur_index = 0;
        int res_number = 0;
        while(cur_index<s.length()){
            char ch = s.charAt(cur_index);
            String subStr = "";
            if(cur_index+1 < s.length()){
                subStr = s.substring(cur_index, cur_index+2);
            }
            if(ch == 'I' && cur_index+1 < s.length() && (subStr.equals("IV") || subStr.equals("IX"))){
                if(subStr.equals("IV")){
                    res_number = res_number+4;
                    cur_index=cur_index+2;
                }
                else if(subStr.equals("IX")){
                    res_number = res_number+9;
                    cur_index=cur_index+2;
                }
            } else if(ch == 'X' && cur_index+1 < s.length() && (subStr.equals("XL") || subStr.equals("XC"))){
                if(subStr.equals("XL")){
                    res_number = res_number+40;
                    cur_index=cur_index+2;
                }
                else if(subStr.equals("XC")){
                    res_number = res_number+90;
                    cur_index=cur_index+2;
                }
            } else if(ch == 'C' && cur_index+1 < s.length() && (subStr.equals("CD") || subStr.equals("CM"))){
                if(subStr.equals("CD")){
                    res_number = res_number+400;
                    cur_index=cur_index+2;
                }
                else if(subStr.equals("CM")){
                    res_number = res_number+900;
                    cur_index=cur_index+2;
                }
            } else{
                if(ch == 'M')
                    res_number = res_number+1000;
                else if(ch == 'D')
                    res_number = res_number+500;
                else if(ch == 'C')
                    res_number = res_number+100;
                else if(ch == 'L')
                    res_number = res_number+50;
                else if(ch == 'X')
                    res_number = res_number+10;
                else if(ch == 'V')
                    res_number = res_number+5;
                else if(ch == 'I')
                    res_number = res_number+1;

                cur_index=cur_index+1;
            }
        }
        return res_number;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
