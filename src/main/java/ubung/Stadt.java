package ubung;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class Stadt {
    public String name;
    public String land;
    public ArrayList<Temperatur> temperaturs;

    public Stadt(String name, String land ) {
        this.name = name;
        this.land = land;
        temperaturs = new ArrayList<Temperatur>();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public ArrayList<Temperatur> getTemperaturs() {
        return temperaturs;
    }

    public void setTemperaturs(ArrayList<Temperatur> temperaturs) {
        this.temperaturs = temperaturs;
    }

    public void addTemp(Temperatur temperatur){
        int month = temperatur.getMonat();
        for(Temperatur t : temperaturs){
            if(t.getMonat() == month){
                t.wert = temperatur.getWert();
                return;

            }
        }
        temperaturs.add(temperatur);
    }

   // @Test
    //public void testAddTemperature() {
        //Stadt stadt = new Stadt("test1", "test2");
        //Temperatur temperatur1 = new Temperatur(25, "Celsius", 1);
        //Temperatur temperatur2 = new Temperatur(30, "Celsius", 2);
       // Temperatur temperatur3 = new Temperatur(28, "Celsius", 2);
       // stadt.addTemp(temperatur1);
       // stadt.addTemp(temperatur2);
       //stadt.addTemp(temperatur3);
       // List<Temperatur> temperatures = stadt.getTemperaturs();
       // assertEquals(2, temperatures.size());
        //assertEquals(28, temperatures.get(1).getWert(), 0);
 //  }

}

