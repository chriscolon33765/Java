import java.util.ArrayList;

public class MyExceptions {

    ArrayList<Object> newList = new ArrayList<Object>();

    public void numAndInt() {
        newList.add("I'm running");
        newList.add("32");
        newList.add("Are we there yet?");
        newList.add("17");

        for(int i = 0; i < newList.size(); i++) {
            try {
            Integer castedValue = (Integer) newList.get(i);
            }
            catch(Exception e) {
                System.out.println(e);
            }
            }
            
            
        }
    }