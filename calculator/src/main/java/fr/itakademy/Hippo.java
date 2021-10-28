public class Hippo extends Animal {

  private int power;

  public Hippo(int weight, int height, String name, int power) {
    super(weight, height, name);
    this.power = power;
  }

  public Hippo swim() {
    // fais perdre du poids à l'hippopotame
    this.weight -= 5;
    return this;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }
}
