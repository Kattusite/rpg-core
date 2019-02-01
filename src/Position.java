public class Position {
  private final int x;
  private final int y;

  public static final Position NW = new Position(-1, -1);
  public static final Position N  = new Position( 0, -1);
  public static final Position NE = new Position(+1, -1);
  public static final Position W  = new Position(-1,  0);
  public static final Position C  = new Position( 0,  0);
  public static final Position E  = new Position(+1,  0);
  public static final Position SW = new Position(-1, +1);
  public static final Position S  = new Position( 0, +1);
  public static final Position SE = new Position(+1, +1);

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int x() {
    return x;
  }

  public int y() {
    return y;
  }

  public Position subtract(Position that) {
    return new Position(this.x - that.x, this.y - that.y);
  }

  public Position add(Position that) {
    return new Position(this.x + that.x, this.y + that.y);
  }

  public Position neighbor(String dir) {
    int newX = this.x;
    int newY = this.y;

    switch (dir) {
      case "NW":
        return this.add(NW);
      case "N":
        return this.add(N);
      case "NE":
        return this.add(NE);
      case "W":
        return this.add(W);
      case "C":
        return this.add(C);
      case "E":
        return this.add(E);
      case "SW":
        return this.add(SW);
      case "S":
        return this.add(S);
      case "SE":
        return this.add(SE);
      default:
        throw new IllegalArgumentException("Not a valid direction");
    }
  }

}
