package services;
class SmsSender { 
    public void sendSms(String mobile, String message){
        System.out.println("Sending SMS to " + mobile + ": " + message);
    }
}