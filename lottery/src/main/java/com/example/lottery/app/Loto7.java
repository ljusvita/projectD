package com.example.lottery.app;

import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.RandomUtils;

public class Loto7 {

  private Set<Integer> numbers;

  public Loto7() {
    this.numbers = new HashSet<>();
  }

  public void setNumbers(Set<Integer> numbers) {
    this.numbers = numbers;
  }

  public Set<Integer> getNumbers() {
    return numbers;
  }

  public void quickPick() {
    while (this.numbers.size() < 7) {
      this.numbers.add(RandomUtils.nextInt(1, 38));
    }
  }
}
