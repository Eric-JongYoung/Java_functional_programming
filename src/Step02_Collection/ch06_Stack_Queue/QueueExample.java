package Step02_Collection.ch06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "조로"));
        messageQueue.offer(new Message("sendSMS", "루피"));
        messageQueue.offer(new Message("sendKakaoTalk", "상디"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail" :
                    System.out.println(message.to+ "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS" :
                    System.out.println(message.to+ "님에게 문자를 보냅니다.");
                    break;
                case "sendKakaoTalk" :
                    System.out.println(message.to+ "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}

class Message{
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
