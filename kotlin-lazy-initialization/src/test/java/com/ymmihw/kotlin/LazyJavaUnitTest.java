package com.ymmihw.kotlin;

import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

public class LazyJavaUnitTest {

  @Test
  public void giveHeavyClass_whenInitLazy_thenShouldReturnInstanceOnFirstCall() {
    // when
    ClassWithHeavyInitialization classWithHeavyInitialization =
        ClassWithHeavyInitialization.getInstance();
    ClassWithHeavyInitialization classWithHeavyInitialization2 =
        ClassWithHeavyInitialization.getInstance();

    // then
    assertTrue(classWithHeavyInitialization == classWithHeavyInitialization2);
  }
}
