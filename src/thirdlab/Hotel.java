package thirdlab;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Hotel {
    private final List<Cottage> cottages;
    private final List<Amenity> hotelAmenities;

    public Hotel() {
        this.cottages = new ArrayList<>();
        this.hotelAmenities = new ArrayList<>();
    }

    public void addCottage(Cottage cottage) {
        cottages.add(cottage);
    }

    public void addHotelAmenity(Amenity amenity) {
        hotelAmenities.add(amenity);
    }

    public List<Amenity> getHotelAmenities() {
        return hotelAmenities;
    }

    public List<Cottage> findCottagesByAmenity(String amenityName) {
        return cottages.stream()
                .filter(cottage -> cottage.getAmenities().stream()
                        .anyMatch(a -> a.getName().equalsIgnoreCase(amenityName)))
                .collect(Collectors.toList());
    }

    public List<Cottage> findCottagesByCategory(Category category) {
        return cottages.stream()
                .filter(cottage -> cottage.getCategory() == category)
                .collect(Collectors.toList());
    }

    public double calculateIncome() {
        return cottages.stream()
                .flatMap(cottage -> cottage.getBookings().values().stream())
                .mapToDouble(booking -> {
                    double price = booking.getCottage().getBasePrice();
                    if (isLowSeason(booking.getStartDate())) {
                        price *= 0.8; // Apply 20% discount for low season
                    }
                    return price;
                })
                .sum();
    }

    public double calculateExpenses() {
        return hotelAmenities.stream().mapToDouble(Amenity::getCost).sum() +
                cottages.stream()
                        .flatMap(c -> c.getAmenities().stream())
                        .mapToDouble(amenity -> amenity.getCost())
                        .sum();
    }

    private boolean isLowSeason(LocalDate date) {
        return date.getMonthValue() == 11 || date.getMonthValue() == 3;
    }
}
