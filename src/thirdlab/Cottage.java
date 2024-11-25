package thirdlab;
import java.time.LocalDate;
import java.util.*;

public class Cottage {
    private final String id;
    private final Category category;
    private final double basePrice;
    private int maxGuests;
    private final List<Amenity> amenities;
    private final Map<LocalDate, Booking> bookings;

    public Cottage(String id, Category category, int maxGuests, double basePrice) {
        this.id = id;
        this.category = category;
        this.maxGuests = maxGuests;
        this.basePrice = basePrice;
        this.amenities = new ArrayList<>();
        this.bookings = new HashMap<>();
    }

    public void addAmenity(Amenity amenity) {
        amenities.add(amenity);
        updateGuestCapacity();
    }

    public void updateGuestCapacity() {
        maxGuests += amenities.stream()
                .mapToInt(Amenity::getAdditionalCapacity)
                .sum();
    }

    public List<Amenity> getAmenities() {
        return amenities;
    }

    public Map<LocalDate, Booking> getBookings() {
        return bookings;
    }

    public Category getCategory() {
        return category;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isAvailable(LocalDate startDate, LocalDate endDate) {
        return bookings.values().stream().
                noneMatch(booking -> !booking.getStartDate().isAfter(endDate) && !booking.getEndDate().isBefore(startDate));
    }

    public void book(Booking booking) throws BookingConflictException {
        if (!isAvailable(booking.getStartDate(), booking.getEndDate())) {
            throw new BookingConflictException("Cottage is not available for the selected dates.");
        }
        if (bookings.values().stream().anyMatch(b -> b.getUser().equals(booking.getUser()) && b.overlaps(booking))) {
            throw new BookingConflictException("User has another active booking during the selected period.");
        }
        bookings.put(booking.getStartDate(), booking);
    }

}
