package com.rithsagea.me;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Bin {
  private List<Integer> bindig;
  
  public Bin() {
    // do nothing
  }
  
  List<Integer> findpow( int x ) {
    List<Integer> powers = new ArrayList<Integer>();
    powers.add(1);
    for (int y = 0; y < x - 1; y++) {
      powers.add(powers.get(y)*2);
    }
    Collections.reverse(powers);
    return powers;
  }
  
  public Bin(int binarytype) {
    bindig = findpow(binarytype);
  }
  
  int convertBinToInt( String x ) {
    int re = 0;
    char[] binarray = x.toCharArray();
    for (int y = 0; y < x.length(); y ++) {
      if (binarray[y] == '1') {
       re += Integer.parseInt(bindig.get(y) + ""); 
      }
    }
    return re;
  }
  
  String convertIntToBin( int x ) {
    String re = "";
    return re;
  }
  
  @Test
  public void test() {
    int size = 1000000;
    long t0 = System.currentTimeMillis();
    String s = buildString1(size);
    long t1 = System.currentTimeMillis();
    System.out.println("Method 1 take time = " + (t1 - t0));
    
    t0 = System.currentTimeMillis();
    s = buildString2(size);
    t1 = System.currentTimeMillis();
    System.out.println("Method 2 take time = " + (t1 - t0));
  }
  
  private String buildString1(int size) {
    String s = "";
    for (int i=0; i<size; i++) s += "a";
    return s;
  }
  
  private String buildString2(int size) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<size; i++) sb.append('a');
    return sb.toString();
  }
}
