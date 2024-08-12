package com.lannstark.lec08;

public class Lec08Main {

  public static void main(String[] args) {

  }

  public static void printAll(String... strings) {
    for (String str : strings) {
      System.out.println(str);
    }
  }

  public void repeat(String str, int num, boolean useNewLine){
      for(int i = 1; i <= num; i++){
        if(useNewLine){
          System.out.println(str);
        }else {
          System.out.println(str);
        }
      }
  }

  // 오버로딩
  public void repeat(String str, int num){
    repeat(str, num, true);
  }

  // 오버로딩
  public void repeat(String str){
    repeat(str, 3, true);
  }
}
