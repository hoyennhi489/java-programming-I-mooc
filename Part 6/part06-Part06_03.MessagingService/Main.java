public class Main {

    public static void main(String[] args) {

        MessagingService messagingService = new MessagingService();

        Message message1 = new Message("Alex", "Hello!");
        Message message2 = new Message("Maria", "How are you?");

        messagingService.add(message1);
        messagingService.add(message2);

        for (Message message : messagingService.getMessages()) {
            System.out.println(message);
        }
    }
}