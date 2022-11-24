class Main {
    public static void main(String[] args) {
        IReception reception = new Reception();
        try {
            final Thread statusReporterThread = new Thread(new StatusReporter(reception));
            statusReporterThread.start();
            while (true) {
                final int input = System.in.read();
                switch (input) {
                    case '+':
                        System.out.println("Plus command");
                        break;
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception" + exception.toString());
        }
    }

}