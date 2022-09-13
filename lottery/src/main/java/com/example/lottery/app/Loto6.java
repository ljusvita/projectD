package com.example.lottery.app;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomUtils;

/** 로또6 도메인 클래스 */
public class Loto6 {

  private List<Integer> numbers;

  public Loto6() {
    this.numbers = new ArrayList<>();
  }

  public void setNumbers(List<Integer> numbers6) {
    this.numbers = numbers6;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void quickPick() {
    while (this.numbers.size() < 6) {
      this.numbers.add(RandomUtils.nextInt(1, 43));
    }
  }
}
