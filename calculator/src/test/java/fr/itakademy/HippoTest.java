import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HippoTest {

  private Hippo hippo;

  @BeforeEach
  public void init() {
    this.hippo = new Hippo(500, 1, "hippo",0);
  }

  @Test
  void grossi() {
    hippo.eat();
    assertEquals(505, hippo.getWeight());
  }

  @Test
  void nage() {
    hippo.swim();
    assertEquals(495, hippo.getWeight());
  }
}
