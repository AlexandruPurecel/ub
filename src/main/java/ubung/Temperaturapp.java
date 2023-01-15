package ubung;

import java.util.ArrayList;

public class Temperaturapp {

        private ArrayList<Stadt> stadts;

        public Temperaturapp() {
            this.stadts = new ArrayList<Stadt>();
        }

        public ArrayList<Stadt> getStadts() {
            return stadts;
        }

        public void setStadts(ArrayList<Stadt> stadts) {
            this.stadts = stadts;
        }


        public Stadt getStadt(String name, String land){
            for(Stadt stadt:stadts){
                if(stadt.getName().equals(name) && stadt.getLand().equals(land)){
                    return stadt;
                }
            }
            return null;
        }

        public void addTempToStadt(String name,String land,Temperatur temperatur){
            Stadt stadt = getStadt(name,land);
            if(stadt == null){
                stadt = new Stadt(name,land);
                stadts.add(stadt);
            }
            stadt.addTemp(temperatur);

        }
}
