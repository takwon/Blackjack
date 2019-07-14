package kr.kta.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	private List<Card> myCards = new ArrayList();

	public void setCard(Card c) {
		myCards.add(c);
	}

	public int openCards(boolean isShow) {
		int sum = 0;

		for (Card c : myCards) {
			sum += c.getScore();
			if (isShow) {
				System.out.println(c);
			}
		}

		return sum;
	}
}
