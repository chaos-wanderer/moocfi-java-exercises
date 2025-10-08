import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }


    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(registry.containsKey(licensePlate))) {
            registry.put(licensePlate, owner);
            return true;
        }

        return false;

    }

    public String get(LicensePlate licensePlate) {
        return (registry.getOrDefault(licensePlate, null));
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : registry.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (LicensePlate lp : registry.keySet()) {
            String owner = registry.get(lp);
            if (!(owners.contains(owner))) {
                owners.add(owner);
            }
        }

        for (String o : owners) {
            System.out.println(o);
        }
    }
    
}
