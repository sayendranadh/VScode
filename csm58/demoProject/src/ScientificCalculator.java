class ScientificCalculator implements AdvancedCalculator {

  public double calculate(double x, double y) {
    return x + y;
  }

  public double power(double x, double y) {
    return Math.pow(x, y);
  }
}