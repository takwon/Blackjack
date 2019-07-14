package kr.kta.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> cards = new ArrayList(); // type은 List로 한 이유는 ArrayList를 linkedList로도 사용가능할 수 있게 하기 위하여
	// List<Card>, Card타입만 처리

	public CardDeck( ) {
		
		for(int i = 0; i < Card.shapes.length; i++) {
			for(int z = 1; z <= Card.MAX_NO; z++) {
				Card c = new Card(Card.shapes[i], z);
				cards.add(c);
			}
		}
	}

	/*
	 * for(int i = 0; i < cards.size(); i++) { System.out.println(cards.get(i)); }
	 */

	public Card getCard() {

		if (cards.size() == 0) {
			return null;
		}
		int randomIdx = (int) (Math.random() * cards.size());

		Card c = cards.get(randomIdx);
		cards.remove(c);

		return c;
	}
}
