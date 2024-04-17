package Interfaces.Scenarios.ConcreteScenarios;

import Interfaces.Enemies.Enemy;
import Interfaces.Enemies.ConcreteEnimies.Cangaceiro;
import Interfaces.Scenarios.Scenario;

public class Sertao implements Scenario {

  @Override
  public Enemy createEnemy(String name) {
    return new Cangaceiro(name);
  }
  
}
