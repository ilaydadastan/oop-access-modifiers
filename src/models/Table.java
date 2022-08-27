package models;

public class Table {
    int no;
    Status status;

    enum Status {
        EMPTY,
        WAITING_FOR_ORDER,
        ORDERED,
        PAID
    }
}
