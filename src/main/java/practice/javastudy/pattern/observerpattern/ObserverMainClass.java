package practice.javastudy.pattern.observerpattern;

public class ObserverMainClass {

    public static void main(String[] args) {

        // 토픽 생성 후, 구독자가 구독
        Topic topic = new Topic();
        TopicSubscriber a = new TopicSubscriber("a", topic);
        TopicSubscriber b = new TopicSubscriber("b", topic);
        TopicSubscriber c = new TopicSubscriber("c", topic);

        // 토픽에 구독자들 등록
        topic.register(a);
        topic.register(b);
        topic.register(c);

        // 1. 토픽의 메세지를 업데이트 한다.
        // 2. postMessage() 호출 -> 안에 있는 notifyObservers() 호출
        topic.postMessage("Observer Pattern");
    }
}
