package Taller01;

public class RoomReservation {
    private String guest;
    private String roomNumber;
    private int numberOfNights;
    private double pricePerNight;

    public RoomReservation(String guest, String roomNumber, int numberOfNights, double pricePerNight) {
        if (guest != null && !guest.trim().isEmpty()) {
            this.guest = guest;
        } else {
            this.guest = "Pendiente";
        }

        this.roomNumber = roomNumber;

        if (numberOfNights > 0) {
            this.numberOfNights = numberOfNights;
        } else {
            this.numberOfNights = 1;
        }

        if (pricePerNight > 0) {
            this.pricePerNight = pricePerNight;
        } else {
            this.pricePerNight = 100.0;
        }
    }

    public String getGuest() {
        return this.guest;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public double getPricePerNight() {
        return this.pricePerNight;
    }

    public double getTotalCost() {
        return this.numberOfNights * this.pricePerNight;
    }

    public boolean setNumberOfNights(int numberOfNights) {
        if (numberOfNights > 0) {
            this.numberOfNights = numberOfNights;
            return true;
        }
        return false;
    }

    public boolean setPricePerNight(double pricePerNight) {
        if (pricePerNight > 0) {
            this.pricePerNight = pricePerNight;
            return true;
        }
        return false;
    }
}