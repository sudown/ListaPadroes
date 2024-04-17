package Interfaces.Scenarios;

import Interfaces.Enemies.Enemy;

public interface Scenario {
  public Enemy createEnemy(String name);
}
