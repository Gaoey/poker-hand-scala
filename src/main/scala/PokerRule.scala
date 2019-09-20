object PokerRule {
  def sort(cards: Seq[Card]): Seq[Card] = cards.sortBy(_.face.priority)
  def pair(cards: Seq[Card]): Seq[Card] = cards.groupBy(_.face.priority).filter(_._2.size == 2).flatMap(_._2).toSeq
  def triple(cards: Seq[Card]): Seq[Card] = cards.groupBy(_.face.priority).filter(_._2.size == 3).flatMap(_._2).toSeq
  def straight(cards: Seq[Card]): Seq[Card] = ???
  def flush(cards: Seq[Card]): Seq[Card]  = ???
}
