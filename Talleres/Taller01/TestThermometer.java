package Taller01;

public class TestThermometer {
    public static void main(String[] args) {
        Thermometer termometro = new Thermometer(25.0);
        System.out.println("Temperatura inicial: " + termometro.getTemperature() + " °C");

        double nuevaTemp1 = 80.0;
        if (termometro.setTemperature(nuevaTemp1)) {
            System.out.println("Modificación a " + nuevaTemp1 + " °C: ACEPTADA. Temperatura actual: " + termometro.getTemperature() + " °C");
        } else {
            System.out.println("Modificación a " + nuevaTemp1 + " °C: RECHAZADA.");
        }

        double nuevaTemp2 = 150.0;
        if (termometro.setTemperature(nuevaTemp2)) {
            System.out.println("Modificación a " + nuevaTemp2 + " °C: ACEPTADA.");
        } else {
            System.out.println("Modificación a " + nuevaTemp2 + " °C: RECHAZADA. Se conserva: " + termometro.getTemperature() + " °C");
        }

        double nuevaTemp3 = -60.0;
        if (termometro.setTemperature(nuevaTemp3)) {
            System.out.println("Modificación a " + nuevaTemp3 + " °C: ACEPTADA.");
        } else {
            System.out.println("Modificación a " + nuevaTemp3 + " °C: RECHAZADA. Se conserva: " + termometro.getTemperature() + " °C");
        }
    }
}