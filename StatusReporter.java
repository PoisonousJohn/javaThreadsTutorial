public class StatusReporter implements Runnable {
    private final IReception reception;

    public StatusReporter(IReception reception) {
        this.reception = reception;
    }

    @Override
    public void run() {
        try {
            while (true) {
                clearConsole();
                printStatus();
                Thread.sleep(1000);
            }
        } catch (Exception exception) {

        }
    }

    private static void clearConsole() {
        System.out.print("\033\143");
    }

    private void printStatus() {
        System.out.println("Queue size: " + reception.getQueueSize());
        System.out.println("Job in progress: " + reception.getInProgressSize());
    }

}
