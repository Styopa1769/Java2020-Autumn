package inner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Airplane{

    private int manufactureYear;

    public Airplane(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Booking {

        private static List<String> strings = new ArrayList<String>();

        static {
            strings.add("A");
            strings.add("B");
            strings.add("C");
            strings.add("D");
        }

        private static Map<String, Boolean> seats = new HashMap<String, Boolean>();

        static {
            for (int i = 0; i < 10; i++) {
                for (String string : strings) {
                    seats.put(string+i, false);
                }
            }
        }

        public static int getMaxPassengersCount() {

            return seats.size();
        }

        public void book(String seat){
            if (seats.containsKey(seat)){
                seats.put(seat, true);
                System.out.println("Seat " + seat + "booked");
            }
            else {
                throw new IllegalArgumentException("No such seat");
            }
        }
    }
}
