package com.example.lottery.app;

import java.util.List;

/** 로또미니 도메인 클래스 */
public class MiniLoto {
  private List<Integer> numbers;

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }
}
