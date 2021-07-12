public class BaseballPlayer {

  private String name;
  private String team;
  private String position;

  public BaseballPlayer(String name, String team, String position) {
    this.name = name;
    this.team = team;
    this.position = position;
  }
      
  public String getName() {
    return name;
  }
  
  public String team() {
    return team;
  }
  
  public String position() {
    return position;
  }
}