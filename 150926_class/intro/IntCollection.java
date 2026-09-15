import intro; //?

public interface IntCollection
{
  void add(int value);
  boolean contains(int value);
  boolean remove(int value);
  int size();
  IntIterator iterator();

} // IntCollection