package inner;

public class Main {
    public static void main(String[] args) {
        //Велосипед
        Bicycle bicycle = new Bicycle("Format 1313", 12);
        Bicycle.Seat seat = bicycle.new Seat();
        seat.up();
        bicycle.start();

        //Самолет
        System.out.println(Airplane.Booking.getMaxPassengersCount());
        Airplane.Booking booking = new Airplane.Booking();
        booking.book("A1");
        //booking.book("H1");

        //Валидатор
        PhoneValidator phoneValidator = new PhoneValidator();
        phoneValidator.validatePhoneNumber("+79991234567");

        //Thread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i ++){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("i am anonymous");
                }
            }
        });

        thread.start();
    }
}
