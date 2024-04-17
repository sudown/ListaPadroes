package Interfaces.Enemies;

public abstract class Enemy {
  public String name;

  public void attack(){
    System.out.println("Enemy " + this.name + " attack" );
  }
}