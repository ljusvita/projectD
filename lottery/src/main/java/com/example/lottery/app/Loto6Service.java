package com.example.lottery.app;

import java.util.List;

public class Loto6Service {

  public Loto6 pick() {
    Loto6 loto6 = new Loto6();
    loto6.setNumbers(List.of(1, 2, 3, 4, 5, 6));
    return loto6;
  }
}
