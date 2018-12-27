package guipackage;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class FeatureTest {
  @Test
  public void test2() {
    CoolCollection c = new CoolCollection();
    c.add("ABCDE");
    c.add(123);
    c.add(24.5);
    
    CoolCollection c2 = new CoolCollection();
    c2.add("ABCDE");
    c2.add(24.5);
    
    // 2. remove all elements
    c.removeAll(c2);

    for (Object obj : c) {
      System.out.println(obj);
    }
  }

  private class CoolCollection extends ArrayList {

  }
}
