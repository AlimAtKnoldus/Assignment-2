package queueOperations

import queueTrait.Queue

/* method for enqueue and dequeue  */

class doubleQueue extends Queue  {
  var list: List[Any] = List()
  var front: Int = -1
  var rear: Int = -1

  //method for insertion

  override def enqueue(Key: Int): Unit = {
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1

    }
    list = list ::: List(Key * 2)
    this.rear = list.length;
  }

  //method to print list

  override def getList(): List[Any]={
    list
  }

  //method to perform deletion at first index

  override def dequeue() = {

    if (this.front == -1) {           //If queue is null
      print("Queue is Underflow")

    }
    if(front==rear ) {                //If queue have only one element
      front = -1
      rear = -1
      list = list.drop(1)
    }
    else{
      list = list.drop(1)
      front = +1
    }
  }
}
object  double{
  def main(args: Array[String]) {
    val doubleQueue = new doubleQueue()
    println("Queue elements are:")
    doubleQueue.enqueue(100)
    doubleQueue.enqueue(99)
    doubleQueue.enqueue(98)
    doubleQueue.enqueue(97)
    print(doubleQueue.getList())
    println()
    println("Queue elements are :")
    doubleQueue.dequeue()
    println(doubleQueue.getList())
  }
}