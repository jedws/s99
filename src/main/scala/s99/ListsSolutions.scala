package s99

object ListsSolutions {

  def last[T](list: List[T]): T =
    list match {
      case t :: Nil => t
      case _ :: ts  => last(ts)
      case Nil      => throw new NoSuchElementException
    }

  def penultimate[T](list: List[T]): T =
    list match {
      case t :: _ :: Nil => t
      case _ :: ts       => penultimate(ts)
      case Nil           => throw new NoSuchElementException
    }

  def nth[T](n: Int, list: List[T]): T = {
    def go(n: Int, list: List[T]): T =
      if (n == 0) list.head
      else go(n - 1, list.tail)
    go(n, list)
  }

  def listLength[T](list: List[T]): Int = {
    def go(n: Int, list: List[T]): Int =
      if (list.isEmpty) n
      else go(n + 1, list.tail)
    go(0, list)
  }

  def reverse[T](list: List[T]): List[T] =
    list.foldLeft(List[T]()) { _.::(_) }

  def isPalindrome[T](list: List[T]): Boolean =
    list == reverse(list)

  def flatten[A](list: List[List[A]]): List[A] = ???

  def compress[T](list: List[T]): List[T] = ???
  def pack[T](list: List[T]): List[List[T]] = ???
  def encode[T](list: List[T]): List[(Int, T)] = ???
  def encodeModified[T](list: List[T]): List[Any] = ???
  def decode[T](list: List[(Int, T)]): List[T] = ???
  def encodeDirect[T](list: List[T]): List[(Int, T)] = ???
  def duplicate[T](list: List[T]): List[T] = ???
  def duplicateN[T](n: Int, list: List[T]): List[T] = ???
  def drop[T](n: Int, list: List[T]): List[T] = ???
  def split[T](n: Int, list: List[T]): (List[T], List[T]) = ???
  def slice[T](i: Int, j: Int, list: List[T]): List[T] = ???
  def rotate[T](n: Int, list: List[T]): List[T] = ???
  def removeAt[T](i: Int, list: List[T]): (List[T], T) = ???
  def insertAt[T](t: T, i: Int, list: List[T]): List[T] = ???
  def range[T](i: Int, j: Int): List[Int] = ???
  def randomSelect[T](n: Int, list: List[T]): List[T] = ???
  def lotto[T](i: Int, j: Int): List[Int] = ???
  def randomPermute[T](list: List[T]): List[T] = ???
  def combinations[T](n: Int, list: List[T]): List[List[T]] = ???
  def group3[T](list: List[T]): List[List[List[T]]] = ???
  def groups[T](ns: List[Int], list: List[T]): List[List[List[T]]] = ???
  def lsort[T](list: List[List[T]]): List[List[T]] = ???
  def lsortFreq[T](list: List[List[T]]): List[List[T]] = ???
}
