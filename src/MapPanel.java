import javax.swing.JPanel;

/* A window containing a map viewport, directional movement buttons,
 * and party information */
public class MapPanel extends JPanel {

  private static final int WIDTH  = 600;
  private static final int HEIGHT = 600;

  private static final int TILE_WIDTH  = 40;
  private static final int TILE_HEIGHT = 40;

  public MapWindow (Map map, Party party, Position pos) {
    super();
    this.setSize(WIDTH, HEIGHT);

  }

}
