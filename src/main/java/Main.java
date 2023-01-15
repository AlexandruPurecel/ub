import ubung.Stadt;
import ubung.Temperatur;
import ubung.Temperaturapp;

public class Main {
    public static void main(String[] args) {
        Temperaturapp app = new Temperaturapp();
        Temperatur temp1 = new Temperatur(20, "Celsius", 1);
        Temperatur temp2 = new Temperatur(25, "Celsius", 2);
        app.addTempToStadt("New York", "USA", temp1);
        app.addTempToStadt("Paris", "France", temp2);
        for (Stadt stadt : app.getStadts()) {
            System.out.println("City: " + stadt.getName() + " - " + stadt.getLand());
            for (Temperatur temp : stadt.getTemperaturs()) {
                System.out.println("\tMonth: " + temp.getMonat() + " - Temperature: " + temp.getWert() + " " + temp.getMas());
            }
        }


    }

    }