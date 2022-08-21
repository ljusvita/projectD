package com.example.lottery.app;

import java.util.Set;

public class Loto7 {

  private Set<Integer> numbers;

  public Loto7() {
    this.numbers = Set.of();
  }

  public void setNumbers(Set<Integer> numbers) {
    this.numbers = numbers;
  }

  public Set<Integer> getNumbers() {
    return numbers;
  }

  public void quickPick() {
    this.numbers = Set.of(1, 2, 3, 4, 5, 6, 7);
  }
}
