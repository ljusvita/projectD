package com.example.lottery.app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.RandomUtils;

/** 로또7 도메인 클래스 */
public class Loto7 {

  /** 선택된 번호를 저장하는 Set 타입 변수 */
  private Set<Integer> numbers;

  private static final int LOTO7_NECESSARY_NUMBER = 7;

  public Loto7(builder builder) {
    this.numbers = builder.pickingNumbers;
  }

  /**
   * getter. 로또7의 현재 선택된 번호를 정렬해서 List 로 반환
   *
   * @return 선택된 로또7 번호가 저장된, 정렬된 List
   */
  public List<Integer> getNumbers() {
    return this.numbers.stream().sorted().collect(Collectors.toList());
  }

  public static class builder {
    private Set<Integer> pickingNumbers = new HashSet<>();

    /** 자동선택 메소드. 선택된 번호가 7개가 될때까지 1부터 37까지의 숫자를 골라 저장 */
    public builder quickPick() {
      while (pickingNumbers.size() < LOTO7_NECESSARY_NUMBER) {
        pickingNumbers.add(RandomUtils.nextInt(1, 38));
      }
      return this;
    }

    public Loto7 build() {
      return new Loto7(this);
    }
  }
}
