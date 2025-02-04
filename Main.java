import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] foo = {"abc", "123", "def", "a", "b", "cd", "efg"};
    System.out.print(countLength);
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;

    for (int i=0; i < arr.length; i++)
    {
      if (arr[i].length() == targetLength)
      {
        count++;
      }
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i=0; i < arr.length; i++)
    {
      if (arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i=0; i < arr.length; i++)
    {
      int target = arr[i];
      
      for (int k= i+1; k < arr.length; k++)
      {
        if (arr[k].equals(target))
        {
          return true;
        }
      }
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    int count = 0;
    int mode = arr[0];
    int max_count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      String target = arr[i];
      count = 0;
      for (int j = 0; j < arr.length; j++)
      if (arr[j] == target)
      {
        count++;
      }
    }

    if (count > max_count)
    {
      max_count = count;
      mode = arr[i];
    }
    return mode;
  }
}
