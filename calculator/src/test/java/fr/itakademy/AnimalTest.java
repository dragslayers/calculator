import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimalTest {

  private Animal animal;

  @BeforeEach
  public void init() {
    this.animal = new Animal(200, 4, "t-rex");
  }

  @Test
  void grossi() {
    animal.eat();
    assertEquals(205, animal.getWeight());
  }
}
