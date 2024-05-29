package logger;

public class Logger implements Observer{
    private static Logger log;
    private static String logfile = "Logger file: \n";

    public Logger() {}

    // Метод для получения единственного экземпляра логгера
    public static Logger getLog() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }

    @Override
    public void update(String result) {
        logfile += result + "\n";
        //System.out.println(result);
    }

    public static void logInfo(){
        System.out.println(logfile);
    }
}
