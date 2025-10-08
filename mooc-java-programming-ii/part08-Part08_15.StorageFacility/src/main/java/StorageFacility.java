import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());

        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return (storage.getOrDefault(storageUnit, new ArrayList<>()));
    }

    public void remove(String storageUnit, String item) {
        
        ArrayList<String> items = storage.get(storageUnit);

        if (items == null) {
            return;
        }

        items.remove(item);


        if (items.isEmpty()) {
            storage.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();

        for (String unit : storage.keySet()) {
            if (!(storage.get(unit).isEmpty())) {
                storageUnits.add(unit);
            }
        }

        return storageUnits;
    }


}
