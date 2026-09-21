// Singleton: guarantees a single shared instance of the application settings
// and offers one global access point to it.
public class AppConfig {

    // Additional challenge: "volatile" makes the instance visible to every
    // thread as soon as it is published, avoiding a half-built object.
    private static volatile AppConfig instance;

    private final String databaseUrl;
    private final String environment;

    // Private constructor: no other class can call "new AppConfig()".
    private AppConfig() {
        this.databaseUrl = "jdbc:mysql://localhost/app";
        this.environment = "development";
    }

    // Global access point. Double-checked locking keeps the fast path lock free
    // and still creates a single instance when several threads arrive together.
    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getEnvironment() {
        return environment;
    }
}
