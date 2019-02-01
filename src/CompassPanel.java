import javax.swing.JPanel;
import javax.swing.GridLayout;
import javax.swing.JButton;

/* A panel containing a compass rose for movement */
public class CompassPanel extends JPanel {

  // Constants
  private static final int NW = 0;
  private static final int N  = 1;
  private static final int NE = 2;
  private static final int W  = 3;
  private static final int C  = 4;
  private static final int E  = 5;
  private static final int SW = 6;
  private static final int S  = 7;
  private static final int SE = 8;

  private static final String[] dirs = {
    "NW", "N", "NE",
    "W",  "C",  "E",
    "SW", "S", "SE"
  };

  private static final int HEIGHT = 200;
  private static final int WIDTH  = 200;

  private static final int NUM_BUTTONS = 9;
  private static final int SIDE_LEN = Math.sqrt(NUM_BUTTONS);

  // Instance Variables
  private JButton[] buttons;

  public CompassPanel() {
    super();
    this.setSize(HEIGHT, WIDTH);
    this.setLayout(new GridLayout(SIDE_LEN, SIDE_LEN));

    buttons = new JButton[NUM_BUTTONS]

    for (int i = 0; i < NUM_BUTTONS; i++) {
      buttons[i] = new JButton(dirs[i]);
      this.add(buttons[i]);
    }

  }


}
