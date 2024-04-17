package Interfaces.Scenarios.ConcreteScenarios;

import Interfaces.Enemies.Enemy;
import Interfaces.Enemies.ConcreteEnimies.Mutant;
import Interfaces.Scenarios.Scenario;

public class Amazonia implements Scenario {

  @Override
  public Enemy createEnemy(String name) {
    return new Mutant(name);
  }
  
}
