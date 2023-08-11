import java.util.Scanner;

public class NigeriaGeopoliticalApp {

    public enum Zone {
        NORTHWEST("North-West", "Jigawa", "Kaduna", "Kano", "Katsina", "Kebbi", "Sokoto", "Zamfara"),
        NORTHEAST("North-East", "Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
        NORTHCENTRAL("North-Central", "Benue", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau", "Federal Capital Territory (FCT)"),
        SOUTHWEST("South-West", "Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo"),
        SOUTHEAST("South-East", "Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
        SOUTHSOUTH("South-South", "Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers");

        private final String name;
        private final String[] states;

        Zone(String name, String... states) {
            this.name = name;
            this.states = states;
        }

        public String getName() {
            return name;
        }

        public String[] getStates() {
            return states;
        }

        public static String getZoneByState(String state) {
            for (Zone zone : Zone.values()) {
                for (String zoneState : zone.getStates()) {
                    if (zoneState.equalsIgnoreCase(state)) {
                        return zone.getName();
                    }
                }
            }
            return "Null";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your state: ");
        String state = scanner.nextLine();
        state = state.substring(0, 1).toUpperCase() + state.substring(1).toLowerCase();

        String zone = Zone.getZoneByState(state);

        if (!zone.equals("Null")) {
            System.out.println("You belong to the " + zone + " geopolitical zone.");
        } else {
            System.out.println("Sorry, we could not determine your political zone.");
        }
    }
}
