package kr.kta.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> cards = new ArrayList(); // type�� List�� �� ������ ArrayList�� linkedList�ε� ��밡���� �� �ְ� �ϱ� ���Ͽ�
	// List<Card>, CardŸ�Ը� ó��

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
