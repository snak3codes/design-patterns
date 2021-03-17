package Factory;
import java.util.Scanner;

public class EnemyShipClient {

    public static void main(String[] args) {

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";

        System.out.println("What type of ship (U / R)");
        if (userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine();
        }

        if (enemyShipOption.equals("U")) {
            theEnemy = new UFOEnemyShip();
        } else {
            theEnemy = new RocketEnemyShip();
        }

        doStuffEnemy(theEnemy);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.shoot();
    }
}
