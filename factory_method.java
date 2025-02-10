/**
 * The Factory Method Design Pattern is a creational pattern that provides an interface for creating objects in a superclass,
 * but allows subclasses to alter the type of objects that will be created. This pattern promotes loose coupling by eliminating
 * the need to bind application-specific classes into the code. The client code interacts with the factory and the product
 * interfaces, making it easier to introduce new types of products without modifying the client code.
 */

class NotificationFactory {

    // Constructor for NotificationFactory
    NotificationFactory() {}

    /**
     * Factory method to create a notification based on the type provided.
     * @param type The type of notification to create (e.g., "email", "sms", "push").
     * @return A Notification object of the specified type.
     */
    public Notification createNotification(String type) {
        if (type == "email") {
            return new EmailNotification();
        } else if (type == "sms") {
            return new SMSNotification();
        } else {
            return new PushNotification();
        }
    }
}

// Notification interface that all notification types will implement
interface Notification {
    void notifyUser();
}

// Concrete implementation of Notification for email notifications
class EmailNotification implements Notification {

    /**
     * Method to notify the user via email.
     */
    public void notifyUser() {
        System.out.println("Sending an email notification");
    }
}

// Concrete implementation of Notification for SMS notifications
class SMSNotification implements Notification {

    /**
     * Method to notify the user via SMS.
     */
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}

// Concrete implementation of Notification for push notifications
class PushNotification implements Notification {

    /**
     * Method to notify the user via push notification.
     */
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}

// Main class to demonstrate the factory method pattern
class Main {

    public static void main(String[] args) {
        // Create a factory instance
        NotificationFactory factory = new NotificationFactory();

        // Create different types of notifications using the factory
        Notification sms = factory.createNotification("sms");
        Notification email = factory.createNotification("email");
        Notification push = factory.createNotification("push");

        // Notify the user using the created notifications
        sms.notifyUser(); // Output: Sending an SMS notification
        email.notifyUser(); // Output: Sending an email notification
        push.notifyUser(); // Output: Sending a push notification
    }
}
