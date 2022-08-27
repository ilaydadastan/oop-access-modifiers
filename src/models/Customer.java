package models;

public class Customer extends User {
    int userId;
    SubscriptionStatus subscriptionStatus;

    enum SubscriptionStatus {
        REGISTERED,
        UNREGISTERED
    }
}
