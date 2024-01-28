package p1_convert;

public class Convert {
  public static double massResult;
  public static double tempResult;

  private static double getKilogramValue(double massLb) {
    return massLb * 0.45337;
  }

  private static double getPoundValue(double massKg) {
    return massKg * 2.2;
  }

  private static double getFahrenheitValue(double tempC) {
    return (tempC * 9 / 5) + 32;
  }

  private static double getCelsiusValue(double tempF) {
    return (tempF - 32) * 5 / 9;
  }

  public static double getTemperature(double temp, int type) {
    switch (type) {
      case 1:
        tempResult = getFahrenheitValue(temp);
        break;
      case 2:
        tempResult = getCelsiusValue(temp);
        break;
      default:
        System.err.println("Invalid Choice! Only 1 or 2 is allowed");
        tempResult = 0;
        break;
    }
    return tempResult;
  }

  public static double getMass(double mass, int type) {
    switch (type) {
      case 1:
        massResult = getKilogramValue(mass);
        break;
      case 2:
        massResult = getPoundValue(mass);
        break;
      default:
        System.err.println("Invalid Choice! Only 1 or 2 is allowed");
        massResult = 0;
        break;
    }
    return massResult;
  }
}