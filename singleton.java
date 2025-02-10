/**
 * Singleton Pattern Implementation
 *
 * The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
 * This is useful when exactly one object is needed to coordinate actions across the system.
 */

class Configuration {

    // Static variable to hold the single instance of Configuration
    private static Configuration instance = null;

    // Attribute to store the theme setting, initialized to "dark"
    private String theme = "dark";

    // Private constructor to prevent instantiation from outside the class
    private Configuration() {}

    // Static method to return the single instance of Configuration
    public static Configuration getInstance() {
        // Create the instance if it does not exist
        if (instance == null) {
            instance = new Configuration();
        }

        // Return the single instance
        return instance;
    }

    // Method to get the current theme
    public String getTheme() {
        return theme;
    }

    // Method to set the theme to the provided value
    public void setTheme(String theme) {
        this.theme = theme;
    }
}

class Main {

    public static void main(String[] args) {
        // Retrieve the singleton instance of Configuration
        Configuration config = Configuration.getInstance();

        // Print the current theme
        System.out.println(config.getTheme()); // Output: dark
    }
}
