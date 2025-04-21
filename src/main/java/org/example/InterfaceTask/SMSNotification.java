package org.example.InterfaceTask;

public class SMSNotification implements Notification{

    public boolean sent = false;

    @Override
    public void sendMessage(String message) {
        System.out.println("The SMS has been sent: " + message);
        sent = true;

    }

    @Override
    public void checkStatus() {
        if (sent) {
            System.out.println("The SMS has been sent.");
        } else {
            System.out.println("The SMS not has been sent.");
    }
    }
}
