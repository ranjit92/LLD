import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayBoard {
    private int id;
    private Map<String, Integer> freeCount = new HashMap<>();

    public DisplayBoard(int id){
        this.id = id;
    }

    public void update(Collection<ParkingSpot> sports){
        freeCount.clear();
        for(ParkingSpot sport : sports){
            if(sport.isFree){
                String type = sport.getClass().getSimpleName();
                freeCount.put(type, freeCount.getOrDefault(type, 0) + 1);
            }
        }
    }

    public void showFreeSlot(){
        System.out.println("Showing free slots by type");
        for(String key : freeCount.keySet()){
            System.out.println(key + " - " + freeCount.get(key));
        }
    }
}
