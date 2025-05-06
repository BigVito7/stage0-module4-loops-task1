package school.mjc.stage0.loops.task1;

public class RepeatIsBad {
    public static void main(String[] args) {
        new RepeatIsBad().repeatIsBad();
    }

    public void repeatIsBad() {
        printMessage(20);
    }

    private void printMessage(int count) {
        if (count <= 0) {
            return;
        }
        System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
        printMessage(count - 1);
    }
}