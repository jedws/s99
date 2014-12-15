package s99

trait ListsSolutions {

  def last[A](list: List[A]): A = ???
  def penultimate[A](list: List[A]): A = ???
  def nth[A](n: Int, list: List[A]): A = ???
  def length[A](list: List[A]): Int = ???
  def reverse[A](list: List[A]): List[A] = ???
  def isPalindrome[A](list: List[A]): Boolean = ???
  def flatten[A](list: List[List[A]]): List[A] = ???
  def compress[A](list: List[A]): List[A] = ???
  def pack[A](list: List[A]): List[List[A]] = ???
  def encode[A](list: List[A]): List[(Int, A)] = ???
  def encodeModified[A](list: List[A]): List[A] = ???
  def decode[A](list: List[(Int, A)]): List[A] = ???
  def encodeDirect[A](list: List[A]): List[(Int, A)] = ???
  def duplicate[A](list: List[A]): List[A] = ???
  def duplicateN[A](n: Int, list: List[A]): List[A] = ???
  def drop[A](n: Int, list: List[A]): List[A] = ???
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = ???
  def slice[A](i: Int, j: Int, list: List[A]): List[A] = ???
  def rotate[A](n: Int, list: List[A]): List[A] = ???
  def removeAt[A](i: Int, list: List[A]): (List[A], A) = ???
  def insertAt[A](a: A, i: Int, list: List[A]): List[A] = ???
  def range[A](i: Int, j: Int): List[Int] = ???
  def randomSelect[A](n: Int, list: List[A]): List[A] = ???
  def lotto[A](i: Int, j: Int): List[Int] = ???
  def randomPermute[A](list: List[A]): List[A] = ???
  def combinations[A](n: Int, list: List[A]): List[List[A]] = ???
  def group3[A](list: List[A]): List[List[List[A]]] = ???
  def groups[A](ns: List[Int], list: List[A]): List[List[List[A]]] = ???
  def lsort[A](list: List[List[A]]): List[List[A]] = ???
  def lsortFreq[A](list: List[List[A]]): List[List[A]] = ???
}
