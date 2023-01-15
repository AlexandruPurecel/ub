package ubung;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Temperatur {
    public double wert;
    public String mas;
    public int monat;

    public Temperatur(int wert, String mas, int monat) {
        this.wert = wert;
        this.mas = mas;
        this.monat = monat;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public double displayTemperature(String unit) {
        if (unit.equalsIgnoreCase("Fahrenheit")) {
            return (wert * 9/5) + 32;
        } else if (unit.equalsIgnoreCase("Celsius")) {
            return wert;
        } else {
            throw new IllegalArgumentException("invalid");
        }
    }

 //  @Test
   /// public void testDisplayTemperature() {
       // Temperatur temperatur = new Temperatur(25, "Celsius", 1);
       // double fahrenheit = temperatur.displayTemperature("Fahrenheit");
       // double celsius = temperatur.displayTemperature("Celsius");
      //  assertEquals(77, fahrenheit, 0);
       // assertEquals(25, celsius, 0);
   // }



}



