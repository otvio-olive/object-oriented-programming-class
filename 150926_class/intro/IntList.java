public interface IntList
  extends IntCollection
{
  void addAtTail(int value);
  void addAtHead(int value);

  @Override
  default void add(int value)
  {
    addAtTail(value);
  }

  int elementAt(int index);
  
} // IntList
