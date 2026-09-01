// A compilation unit can define more than one class. Here,
// there are two classes named Test and Welcome. The
// compilation with javac produces two class files, one
// for each class.
//
// However, a compilation unit can define just one *public*
// class. In this case, such a class should have the same
// name of the compilation unit.

class Test
{
  public static void main(String[] args)
  {
    System.out.println("Test");
  }

} // Test

class Welcome
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to LPOO");
    if (args.length > 0)
    {
      System.out.println("Command line:");
      for (int i = 0; i < args.length;)
        System.out.println(args[i++]);
    }
  }

} // Welcome
