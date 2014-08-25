package net.slipp.composition;

public class Coffee implements MakeRule {
	public void brew() {
        System.out.println("필터를 활용해 커피를 내린다.");
    }
}
