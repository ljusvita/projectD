package com.example.lottery.app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.RandomUtils;

/** 로또6 도메인 클래스 */
public class Loto6 {

  /*
  로또6 고른 번호
   */
  private Set<Integer> numbers;

  /*
  로또6에 필요한 숫자
   */
  private static final int NECESSARY_LOTO6_NUMBERS = 6;

  /*
  로또6 생성자
   */
  public Loto6(builder builder) {
    this.numbers = builder.pickingNumbers;
  }

  /*
  로또6 숫자 취득
   */
  public List<Integer> getNumbers() {
    return this.numbers.stream().sorted().collect(Collectors.toList());
  }

  /** 로또6 생성을 위한 빌더 */
  public static class builder {
    /*
    선택중인 번호
     */
    private Set<Integer> pickingNumbers = new HashSet<>();

    /** 자동선택 메소드. 선택된 번호가 6개가 될때까지 1부터 43까지의 숫자를 골라 저장 */
    public Loto6.builder quickPick() {
      while (pickingNumbers.size() < NECESSARY_LOTO6_NUMBERS) {
        pickingNumbers.add(RandomUtils.nextInt(1, 43));
      }
      return this;
    }

    /*
    로또6 생성
     */
    public Loto6 build() {
      return new Loto6(this);
    }
  }
}
