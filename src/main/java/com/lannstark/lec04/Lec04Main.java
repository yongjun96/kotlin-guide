package com.lannstark.lec04;

import com.lannstark.lec04.JavaMoney;

public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = new JavaMoney(2_000L);
    JavaMoney money3 = money2;

    System.out.println(money2 == money3); // 주소 확인 true

    System.out.println(money1.plus(money2));
  }

}
