package homeWork15;

public class WinnerUtil extends Thread {

    public static final int COUNT_OF_NIGHTS = 100;
    public static final int LENGTH_OF_NIGHT = 100;

    private WinnerUtil() {
    }

    public static void declareWinner(Assistant whiteAssistant, Assistant blackAssistant) {
        final int WHITE_DOCTORS_ROBOTS = whiteAssistant.totalRobotsCount();
        final int BLACK_DOCTORS_ROBOTS = blackAssistant.totalRobotsCount();

        if (WHITE_DOCTORS_ROBOTS != BLACK_DOCTORS_ROBOTS) {
            System.out.println("Победил " + (WHITE_DOCTORS_ROBOTS > BLACK_DOCTORS_ROBOTS ? whiteAssistant.getName() : blackAssistant.getName()));
        } else {
            System.out.println("Победила дружба");
        }
    }
}
