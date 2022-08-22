package com.example.lottery.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.RandomUtils;

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
    List<Integer> list = new ArrayList<>();
    //  TODO: 7개숫자 고르는 반복문 작성
    for (int i = 0; i < 7; i++) {
      list.add(RandomUtils.nextInt(1, 38));
    }
    this.numbers = new HashSet<>(list);
  }
}
