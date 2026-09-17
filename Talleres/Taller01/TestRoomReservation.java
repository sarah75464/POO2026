package Taller01;

public class TestRoomReservation {
    public static void main(String[] args) {
        RoomReservation reservation = new RoomReservation("Maria", "101A", 3, 120.0);

        System.out.println("Huesped: " + reservation.getGuest());
        System.out.println("Costo total inicial: " + reservation.getTotalCost());

        boolean modNoches1 = reservation.setNumberOfNights(5);
        System.out.println("Cambio a 5 noches: " + modNoches1 + " | Costo total: " + reservation.getTotalCost());

        boolean modNoches2 = reservation.setNumberOfNights(-2);
        System.out.println("Cambio a -2 noches: " + modNoches2 + " | Costo total: " + reservation.getTotalCost());

        boolean modPrecio1 = reservation.setPricePerNight(150.0);
        System.out.println("Cambio a precio 150.0: " + modPrecio1 + " | Costo total: " + reservation.getTotalCost());

        boolean modPrecio2 = reservation.setPricePerNight(0.0);
        System.out.println("Cambio a precio 0.0: " + modPrecio2 + " | Costo total: " + reservation.getTotalCost());
    }
}