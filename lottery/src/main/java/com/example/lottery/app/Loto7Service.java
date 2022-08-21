package com.example.lottery.app;

import java.util.Set;

public class Loto7Service {
  public Loto7 pick() {
    Loto7 loto7 = new Loto7();
    loto7.setNumbers(Set.of(1, 2, 3, 4, 5, 6, 7));

    return loto7;
  }
}
