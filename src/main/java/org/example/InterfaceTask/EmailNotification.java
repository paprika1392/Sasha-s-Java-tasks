package org.example.InterfaceTask;

public class EmailNotification implements Notification{

    public boolean sent = false;

    @Override
    public void sendMessage(String message) {
        System.out.println("The email has been sent: " + message);
        sent = true;
    }

    @Override
    public void checkStatus() {
        if (sent) {
            System.out.println("Status: Email has been sent.");
        } else {
            System.out.println("Status: Email not has been sent.");
        }

    }
}
