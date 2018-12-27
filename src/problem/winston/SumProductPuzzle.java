package problem.winston;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumProductPuzzle {
  public static void main(String[] args) {
    new SumProductPuzzle().run();
  }

  private void run() {    
    // list1 = all integers has more than one product decomposition.
    HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
    for (int i = 2; i < 100; i++) {
      for (int j = i + 1; j < 100; j++) {
        int k = i * j;
        if (!map1.containsKey(k)) {
          map1.put(k, 0);
        }
        map1.put(k, map1.get(k) + 1);
      }
    }
    List<Integer> list1 = new ArrayList<Integer>();
    for (int i : map1.keySet()) {
      if (map1.get(i) > 1) list1.add(i);
    }
    //printList(list1);
    
    // list2 = all integers whose decomposition(sum) product belong to list1.
    List<Integer> list2 = new ArrayList<Integer>();
    for (int sum = 51; sum < 100; sum++) {
      boolean good = true;
      for (int i = 2; i * 2 < sum; i++) {
        int product = i * (sum - i);
        if (!list1.contains(product)) {
          good = false;
        }
      }
      if (good) list2.add(sum);
    }
    printList(list2);
    
    // set3 = all integers are products, whose sum belong to set2 ONCE. 
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 2; i * i < 100; i++) {
      for (int j = i + 1; i * j < 100; j++) {
        if (!list2.contains(i + j)) continue;
        int k = i * j;
        if (!map.containsKey(k)) {
          map.put(k, 0);
        }
        map.put(k, map.get(k) + 1);
      }
    }
    Set<Integer> set3 = new HashSet<Integer>();
    for (int i : map.keySet()) {
      if (map.get(i) == 1) set3.add(i);
    }
    printSet(set3);
    
    // list3 = solution candidate
    for (int sum : list2) {
      //System.out.println(sum);
      int count = 0;
      for (int i = 2; i < sum/2; i++) {
        int j = sum - i;
        if (set3.contains(i * j)) {
          //System.out.println(i + ", " + j);
          count++;
        }
      }
      if (count == 1) System.out.println(sum);
    }
  }
  
  private void printList(List<Integer> list) {
    for (int i : list) System.out.print(i + ",");
    System.out.println("\n");
  }
  
  private void printSet(Set<Integer> list) {
    for (int i : list) System.out.print(i + ",");
    System.out.println("\n");
  }
  
  private ArrayList<Integer> getPrimes() {
    ArrayList<Integer> list = new ArrayList<Integer>();
    boolean[] b = new boolean[100];
    for (int i = 2; i < 100; i++) {
      if (!b[i]) {
        list.add(i);
        for (int j = i; j < 100; j+=i) {
          b[j] = true;
        }
      }
    }
    return list;
  }
}
