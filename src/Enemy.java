/* A class defining hostile combat-eligible entities */
public class Enemy extends Entity {

  public Enemy(String name, String mapSprite, String combatSprite,
               int HP, int maxHP, double combatSpeed) {
    super(name, mapSprite, combatSprite, HP, maxHP, combatSpeed);
  }

}
