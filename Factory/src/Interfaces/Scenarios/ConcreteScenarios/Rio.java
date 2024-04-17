package Interfaces.Scenarios.ConcreteScenarios;

import Interfaces.Enemies.Enemy;
import Interfaces.Enemies.ConcreteEnimies.Criminoso;
import Interfaces.Scenarios.Scenario;

public class Rio implements Scenario {

  @Override
  public Enemy createEnemy(String name) {
    return new Criminoso(name);
  }
  
}
