package com.rithsagea.me;

import com.rithsagea.me.Bin;

public class BinaryFinder {
  public static void main(String[] args) {
    Bin generator = new Bin(8);
    int x = generator.convertBinToInt("10001001");
    System.out.println(x);
  }
}
