package com.example.lottery.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.RandomUtils;

/** 로또6 도메인 클래스 */
public class Loto6 {

  private Set<Integer> numbers;

  private static final int LOTO6_NECESSARY_NUMBER = 6;

  public Loto6() {
    this.numbers = new HashSet<>();
  }

  public Loto6(builder builder) {
    this.numbers = builder.pickingNumbers;
  }

  public void setNumbers(Set<Integer> numbers6) {
    this.numbers = numbers6;
  }

  public Set<Integer> getNumbers() {
    return numbers;
  }

  public void quickPick() {
    while (this.numbers.size() < 6) {
      this.numbers.add(RandomUtils.nextInt(1, 43));
    }
  }

  public static class builder {

    private Set<Integer> pickingNumbers = new HashSet<>();

    /** 자동선택 메소드. 선택된 번호가 7개가 될때까지 1부터 37까지의 숫자를 골라 저장 */
    public Loto6.builder quickPick() {
      while (pickingNumbers.size() < LOTO6_NECESSARY_NUMBER) {
        pickingNumbers.add(RandomUtils.nextInt(1, 43));
      }
      return this;
    }

    public Loto6 build() {
      return new Loto6(this);
    }
  }
}
