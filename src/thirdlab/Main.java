package thirdlab;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Amenity saun = new Amenity("Saun", 55, 0);
        Amenity playground = new Amenity("Playground", 15, 0);
        hotel.addHotelAmenity(saun);
        hotel.addHotelAmenity(playground);

        Amenity oneGibWifi = new Amenity("ONE_GIB_WiFi", 5, 0);
        Amenity kitchen = new Amenity("Kitchen", 8, 1);

        Cottage cottage1 = new Cottage("Polissya", Category.STANDARD, 4, 130);
        cottage1.addAmenity(oneGibWifi);
        cottage1.addAmenity(kitchen);

        Amenity sofaBed = new Amenity("Sofa Bed", 5, 1);

        Cottage cottage2 = new Cottage("Zalissya", Category.LUXURY, 8, 360);
        cottage2.addAmenity(sofaBed);

        hotel.addCottage(cottage1);
        hotel.addCottage(cottage2);

        List<Amenity> fullAmenities = Stream.concat(cottage1.getAmenities().stream(), hotel.getHotelAmenities().stream())
                .collect(Collectors.toList());
        System.out.println("Full amenities for Cottage Polissya: " + fullAmenities);

        User user1 = new User("Mykola Fedorovuch");
        try {
            Booking booking1 = new Booking(user1, LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 5), cottage1);
            cottage1.book(booking1);
        } catch (BookingConflictException e) {
            System.out.println("Booking conflict: " + e.getMessage());
        }

        System.out.println("Cottages with WiFi: " + hotel.findCottagesByAmenity("ONE_GIB_WiFi"));
        System.out.println("Luxury Cottages: " + hotel.findCottagesByCategory(Category.LUXURY));

        System.out.println("Total income: " + hotel.calculateIncome());
        System.out.println("Total expenses: " + hotel.calculateExpenses());
    }
}
