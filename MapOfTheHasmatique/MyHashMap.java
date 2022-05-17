import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
    HashMap<String, String> trackList = new HashMap<String, String>();

    public void ourSoungs() {
        trackList.put("'November Rain'", " 'in the sweet November Rain' ");
        trackList.put("'Jump'", " 'The Mac Daddy will make you jump' ");
        trackList.put("'What I'm looking for'", " 'But I still haven't found what I'm looking for' ");

        Set<String> keys = trackList.keySet();

        for (String key : keys) {
            System.out.println("The title of the song is " + key + " and here's a short snippet " + trackList.get(key));
            // System.out.println(trackList.get(key));
        }
    }





}





