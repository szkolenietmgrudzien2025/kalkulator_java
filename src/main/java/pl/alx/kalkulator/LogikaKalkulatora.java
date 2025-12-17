package pl.alx.kalkulator;

public class LogikaKalkulatora {

    public String[] dostepneOperacje() {
        return new String[] { "+", "-", "*" };
    }

    public long oblicz(long liczba1, long liczba2, String operacja) {
        return switch(operacja) {
            case "+" -> liczba1 + liczba2;
            case "-" -> liczba1 - liczba2;
            case "*" -> liczba1 * liczba2;
            default -> throw new IllegalArgumentException("Nieznana operacja " + operacja);
        };
    }

}
