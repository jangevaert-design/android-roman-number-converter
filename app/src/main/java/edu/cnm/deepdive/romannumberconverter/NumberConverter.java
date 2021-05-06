package edu.cnm.deepdive.romannumberconverter;

import java.util.HashMap;

public class NumberConverter {

  public String toRoman(int numberInput) {
    if (numberInput < 0 || numberInput > 10_000) {
      return "Sorry, I can't do that.";
    }
    String returnValue = "";

    while (numberInput >= 1_000) {
      returnValue += "M";
      numberInput = numberInput - 1_000;
    }

    while (numberInput >= 900) {
      returnValue += "CM";
      numberInput = numberInput - 900;
    }

    while (numberInput >= 500) {
      returnValue += "D";
      numberInput = numberInput - 500;
    }

    while (numberInput >= 400) {
      returnValue += "CD";
      numberInput = numberInput - 400;
    }

    while (numberInput >= 100) {
      returnValue += "C";
      numberInput = numberInput - 100;
    }

    while (numberInput >= 90) {
      returnValue += "XC";
      numberInput = numberInput - 90;
    }

    while (numberInput >= 50) {
      returnValue += "L";
      numberInput = numberInput - 50;
    }

    while (numberInput >= 40) {
      returnValue += "XL";
      numberInput = numberInput - 40;
    }

    while (numberInput >= 10) {
      returnValue += "X";
      numberInput = numberInput - 10;
    }

    while (numberInput >= 9) {
      returnValue += "IX";
      numberInput = numberInput - 9;
    }

    while (numberInput >= 5) {
      returnValue += "V";
      numberInput = numberInput - 5;
    }

    while (numberInput >= 4) {
      returnValue += "IV";
      numberInput = numberInput - 4;
    }

    while (numberInput >= 1) {
      returnValue += "I";
      numberInput = numberInput - 1;
    }

    //return a String value of the numeral.
    return returnValue;
  }

  public int toNumber(String numeral) {
    if (numeral == null || numeral.length() == 0)
      return -1;

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int len = numeral.length(), result = map.get(numeral.charAt(len - 1));
    for (int i = len - 2; i >= 0; i--) {
      if (map.get(numeral.charAt(i)) >= map.get(numeral.charAt(i + 1)))
        result += map.get(numeral.charAt(i));
      else
        result -= map.get(numeral.charAt(i));
    }

    return result;
  }

}
