package com.example.lottery.app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomUtils;

/** 로또6 도메인 클래스 */
public class Loto6 {

  private Set<Integer> numbers;

  private static final int LOTO6_NECESSARY_NUMBER = 6;

  public Loto6(builder builder) {
    this.numbers = builder.pickingNumbers;
  }

  public List<Integer> getNumbers() {
    return this.numbers.stream().sorted().collect(Collectors.toList());
  }

  public static class builder {
    private Set<Integer> pickingNumbers = new HashSet<>();

    /** 자동선택 메소드. 선택된 번호가 6개가 될때까지 1부터 43까지의 숫자를 골라 저장 */
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
