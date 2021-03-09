package queueTrait

trait Queue {

  //for inserting elements in queue

  def enqueue(Key: Int)

  //for deleting element at first index

  def dequeue()

  // to get list

  def getList(): List[Any] = ???
}