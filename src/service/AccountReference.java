package service;

public abstract class AccountReference {
    private static int accountID = 0;

    public static synchronized int newAccountID() {
        return ++accountID;
    }
}
