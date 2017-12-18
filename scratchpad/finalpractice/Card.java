package finalpractice;

import java.util.Comparator;

public class Card implements Comparable<Card>
{
	public enum Rank 
	{ ACE, TWO, THREE, FOUR, FIVE, SIX,
		SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
		
		@Override
		public String toString()
		{
			return name().substring(0, 1) + name().substring(1).toLowerCase();
		}
	}
	
	/**
	 * A card's suit.
	 */
	public enum Suit
	{
		CLUBS, DIAMONDS, SPADES, HEARTS
	}
	
	private Rank aRank;
	private Suit aSuit;
	
	/**
	 * @param pRank The index of the rank in RANKS
	 * @param pSuit The index of the suit in SUITS
	 * @pre pRank != null && pSuit != null
	 */
	public Card(Rank pRank, Suit pSuit)
	{
		assert pRank != null && pSuit != null;
		aRank =  pRank;
		aSuit = pSuit;
	}
	
	public static Comparator<Card> createByRankComparator()
	{
		return (o1,o2) -> o1.getRank().compareTo(o2.getRank());
	}
	
	public static Comparator<Card> createBySuitComparator()
	{
		return new Comparator<Card>() {

			@Override
			public int compare(Card o1, Card o2)
			{
				return o1.aSuit.compareTo(o2.aSuit);
			}};
	}
	
	/**
	 * @return The index in RANKS corresponding to the rank of the card.
	 */
	public Rank getRank()
	{
		return aRank;
	}
	
	/**
	 * @return The index in SUITS corresponding to the suit of the card.
	 */
	public Suit getSuit()
	{
		return aSuit;
	}
	
	/**
	 * Assigns a new rank to the card.
	 * @param pRank The new rank.
	 */
	public void setRank(Rank pRank)
	{
		aRank = pRank;
	}
	
	/**
	 * Assigns a new suit to the card.
	 * @param pSuit The new suit.
	 */
	public void setSuit(Suit pSuit)
	{
		aSuit = pSuit;
	}
	
	@Override
	public String toString()
	{
		return getRank() + " of " + getSuit();
	}

	@Override
	public int compareTo(Card pCard)
	{
		return getRank().compareTo(pCard.getRank());
	}
}
