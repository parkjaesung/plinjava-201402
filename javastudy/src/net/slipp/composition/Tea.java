package net.slipp.composition;

public class Tea implements MakeRule {
    public void brew() {
        System.out.println("티백을 담근다.");
    }
}
