package modele;
/**
 * L'interface ConstantesPlanning contient les constantes utilisées dans l'application'.
 */
public interface ConstanteScenario {
    /**
     * Les scenario disponibles.
     */
    final String[] SCENARIO = {"Scenario 0","Scenario 1","Scenario 2","Scenario 3","Scenario 4","Scenario 5","Scenario 6","Scenario 7","Scenario 8","Scenario 9","Scenario 10"};

    /**
     * Les solutions disponibles.
     */
    final String[] SOLUTION = {"Efficace", "Exhaustive"};
    final Integer[] NUM_SCENARIO = {0,1,2,3,4,5,6,7,8,9,10};
    final String[] SCENARIOTXT = {"scenario_0.txt","scenario_1.txt","scenario_2.txt","scenario_3.txt","scenario_4.txt","scenario_5.txt","scenario_6.txt","scenario_7.txt","scenario_8.txt","scenario_9.txt","scenario_10.txt"};
}
