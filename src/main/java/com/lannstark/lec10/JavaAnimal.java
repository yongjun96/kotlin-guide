package com.lannstark.lec10;

public abstract class JavaAnimal {

  protected final String species;   // 동물의 종류
  protected final int legCount;     // 동물의 다리 갯수

  public JavaAnimal(String species, int legCount) {
    this.species = species;
    this.legCount = legCount;
  }

  abstract public void move();

  public String getSpecies() {
    return species;
  }

  public int getLegCount() {
    return legCount;
  }

}
