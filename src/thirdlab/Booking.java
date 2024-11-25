package thirdlab;
import java.time.LocalDate;

public class Booking {
    private final User user;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Cottage cottage;

    public Booking(User user, LocalDate startDate, LocalDate endDate, Cottage cottage) {
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cottage = cottage;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Cottage getCottage() {
        return cottage;
    }

    public boolean overlaps(Booking other) {
        return !startDate.isAfter(other.endDate) && !endDate.isBefore(other.startDate);
    }

}
