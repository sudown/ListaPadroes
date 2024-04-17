import Interfaces.Enemies.Enemy;
import Interfaces.Scenarios.ConcreteScenarios.Amazonia;
import Interfaces.Scenarios.ConcreteScenarios.Rio;
import Interfaces.Scenarios.ConcreteScenarios.Sertao;

public class App {
    public static void main(String[] args) throws Exception {
        Enemy mutant = new Amazonia().createEnemy("Mutano");
        Enemy cangaceiro = new Sertao().createEnemy("Lampiao");
        Enemy criminoso = new Rio().createEnemy("Baiano");

        mutant.attack();
        cangaceiro.attack();
        criminoso.attack();
    }
}
