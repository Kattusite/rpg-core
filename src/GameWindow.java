import javax.swing.JFrame;
import javax.swing.BorderLayout;
import javax.swing.BoxLayout;

/* Entry point for the game. Initializes the game window. */
public class GameWindow extends JFrame {

  private static final int WIDTH = 1000;
  private static final int HEIGHT = 700;

  public GameWindow() {
    super("Neoquest II");
    setSize(WIDTH, HEIGHT);

    this.setLayout(new BorderLayout());

    PartyPanel partyPanel   = new PartyPanel();
    MapPanel mapPanel       = new MapPanel();
    DirectionPanel dirPanel = new DirectionPanel();
    OutputPanel outPanel    = new OutputPanel();

    JPanel infoPanel = new JPanel();
    infoPanel.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
    infoPanel.add(dirPanel);
    infoPanel.add(outPanel);

    this.add(partyPanel, BorderLayout.NORTH);
    this.add(mapPanel,   BorderLayout.CENTER);
    this.add(infoPanel,  BorderLayout.EAST);

    setVisible(true);
  }

  public static void main(String[] args) {
    GameWindow gw = new GameWindow();

  }

}
