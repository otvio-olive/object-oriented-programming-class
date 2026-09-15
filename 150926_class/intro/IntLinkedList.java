public class IntLinkedList
  implements IntList
{
  @Override
  public void addAtTail(int value)
  {
    Node node = new Node(value);
    
    if (head == null)
      head = node;
    else
      tail.next = node;
    tail = node;
    ++count;
  }
  
  @Override
  public void addAtHead(int value)
  {
    Node node = new Node(value);

    if (tail == null)
      tail = node;
    node.next = head;
    head = node;
    ++count;
  }

  @Override
  public boolean contains(int value)
  {
    for (Node node = head; node != null; node = node.next)
      if (node.value == value)
        return true;
    return false;
  }

  @Override
  public boolean remove(int value)
  {
    // TODO
    return false;
  }

  @Override
  public int elementAt(int index)
  {
    if (index < 0 || index >= count)
      throw new IndexOutOfBoundsException();

    Node node = head;

    for (int i = 0; i <= index; ++i)
      node = node.next;
    return node.value;
  }

  @Override
  public int size()
  {
    return count;
  }

  @Override
  public IntLinkedListIterator iterator()
  {
    return new IntLinkedListIterator(this);
  }

  Node head()
  {
    return head;
  }

  static class Node
  {
    int value;
    Node next;

    Node(int value)
    {
      this.value = value;
    }

  } // Node

  private Node head;
  private Node tail;
  private int count;

} // IntLinkedList
