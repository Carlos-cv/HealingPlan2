package facadetesting;

public class BookingFacade {
    public void createBooking(User user) {
        TicketSystem ts = new TicketSystem();
        PaymentSystem ps = new PaymentSystem();
        NotificationSystem ns = new NotificationSystem();

        boolean isBookingPossible = ts.validateAvailability("Movie");
        if(isBookingPossible) {
            ts.createTicket(100, user, "Movie");
            ps.chargeCard();
            ns.sendEmailUser(user, ts.getTicketNumber());
            ns.sendSms(user, ts.getTicketNumber());
        }
    }
}
