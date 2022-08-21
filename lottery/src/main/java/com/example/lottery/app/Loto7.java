package com.example.lottery.app;

import java.util.List;

public class Loto7 {

  private List<Integer> numbers;

  public Loto7() {
    this.numbers = List.of();
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void quickPick() {
    this.numbers = List.of(1, 2, 3, 4, 5, 6, 7);
  }
}
