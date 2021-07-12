## Test-Driven Development

Using the UML diagram below, create tests for the `Pitcher` class. **Hint:** you should write five tests.

![Pitcher UML Diagram](.guides/img/pitcher_uml_diagram.jpg)

Then create the `Player` class. Your class should pass all of your tests.


{Test It}(sh .guides/bg.sh code/exercise1/Pitcher.java code/exercise1/PitcherTester.java code/exercise1/PitcherTestRunner.java code/exercise1/BaseballPlayer.java code/exercise1 PitcherTestRunner 1)

|||guidance
## Unit Test Solution
Here is one possible solution for the unit test:

```java
/*
* Pitcher unit test
*/

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class PitcherTester {
  
  Pitcher testPitcher;
  
  @Before
  public void setup() {
    testPitcher = new Pitcher("Pedro Martinez", "Red Sox", "pitcher", 217, 42, 284);
  }
  
  @Test
  public void checkInningsPitched() {
    double actual = testPitcher.getInningsPitched();
    double expected = 217.0;
    String feedback = "inningsPitched attribute was not correct";
    
    assertEquals(feedback, expected, actual, 0.01);
  }
  
  @Test
  public void checkEarnedRuns() {
    int actual = testPitcher.getEarnedRuns();
    int expected = 42;
    String feedback = "earnedRuns attribute was not correct";
    
    assertEquals(feedback, expected, actual);
  }
  
  @Test
  public void checkStrikeouts() {
    int actual = testPitcher.getStrikeouts();
    int expected = 284;
    String feedback = "strikeouts attribute was not correct";
    
    assertEquals(feedback, expected, actual);
  }
  
  @Test
  public void checkEra() {
    double actual = testPitcher.era();
    double expected = 1.74;
    String feedback = "era method was not correct";
    
    assertEquals(feedback, expected, actual, 0.01);
  }
  
  @Test
  public void checkInheritance() {
    boolean actual = testPitcher instanceof BaseballPlayer;
    boolean expected = true;
    String feedback = "Pitcher did not inherit from BaseballPlayer";
    
    assertEquals(feedback, expected, actual);
  }
}
```

## Class Solution
Here is one possible solution for the `Pitcher` class:

```java
/*
* Pitcher class
*/

public class Pitcher extends BaseballPlayer {

  private double inningsPitched;
  private int earnedRuns;
  private int strikeouts;

  public Pitcher(String name, String team, String position, double inningsPitched, int earnedRuns, int strikeouts){
    super(name, team, position);
    this.inningsPitched = inningsPitched;
    this.earnedRuns = earnedRuns;
    this.strikeouts = strikeouts;
  }
      
  public double getInningsPitched() {
    return inningsPitched;
  }
  
  public int getEarnedRuns() {
    return earnedRuns;
  }
  
  public int getStrikeouts() {
    return strikeouts;
  }
  
  public double era() {
    return earnedRuns / inningsPitched * 9;
  }
}
```

|||