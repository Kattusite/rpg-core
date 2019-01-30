/* A class defining combat-eligible entities (Heroes and Enemies) */
public class Entity {

  private String name;
  private String mapSprite; // filename of image tile for map, if one exists
  private String combatSprite; // filename of image for combat encounters

  private int HP;
  private int maxHP;

  private int level;

  private double combatSpeed; // Used to decide combat order

  /* Create an entity with the given initial values */
  public Entity(String name, String mapSprite, String combatSprite,
                int HP, int maxHP, double combatSpeed) {
    this.name = name;
    this.mapSprite = mapSprite;
    this.combatSprite = combatSprite;

    // maxHP cannot be negative or zero
    if (maxHP <= 0)
      throw new IllegalArgumentException("Max HP must be positive!");
    this.maxHP = maxHP;

    // HP cannot be negative or above HP
    if (HP < 0 || HP > maxHP)
      throw new IllegalArgumentException("HP must be in [0, maxHP]");
    this.HP = HP;

    // Validate the combat speed (unimplemented)
    if (false)
      throw new IllegalArgumentException("Illegal combat speed");
    this.combatSpeed = combatSpeed;
  }

  public void attack(Entity target) {

  }

}
