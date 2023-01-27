package Step02_Collection.ch06_Stack_Queue;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        // 동전을 끼움
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼낸 동전 : " + coin.getValue() + "원");
        }
    }
}

class Coin{
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}