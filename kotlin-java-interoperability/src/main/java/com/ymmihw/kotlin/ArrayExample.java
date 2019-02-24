package com.ymmihw.kotlin;

public class ArrayExample {

  public int sumValues(int[] nums) {
    int res = 0;

    for (int x : nums) {
      res += x;
    }

    return res;
  }

}
