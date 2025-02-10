class Configuration {

    // Attributes
    private static Configuration instance = null;
    private String theme = "dark";

    // Constructor
    private Configuration() {}

    // Methods
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }

        return instance;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}

class Main {

    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        System.out.println(config.getTheme()); // dark
    }
}
