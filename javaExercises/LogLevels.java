public class LogLevels {
    // Logline format: "[ERROR]: Invalid operation"

    // Returns a log line's message
    public static String message(String logLine) {
        return logLine.split("]: ")[1].trim();
    }

    // Returns a log line's level in lowercase
    public static String logLevel(String logLine) {
        return logLine.split("]: ")[0].substring(1).toLowerCase();
    }
 
    // Reformats log line such that message is first
    public static String reformat(String logLine) {
        String msg = message(logLine);
        String loglevel = logLevel(logLine);
        String reformString = String.format("%s (%s)", msg, loglevel);
        return reformString;
    }
}