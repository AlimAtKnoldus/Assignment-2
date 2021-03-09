package queueOperations

import queueTrait.Queue

/* method for enqueue and dequeue  */

class squareQueue extends Queue {
  var list: List[Any] = List()
  var front: Int = -1
  var rear: Int = -1

  //method for insertion

  override def enqueue(Key: Int): Unit = {
    if(this.rear == -1) {
      this.front == front + 1
      this.rear = rear + 1
    }
    list = list ::: List(Key*Key)
    this.rear = list.length
  }

  //method to print list

  override def getList(): List[Any]={
    list
  }

  //method to perform deletion at first index

  override def dequeue(): Unit = {

    if (this.front == -1) {             //If queue is null
      print("Queue is Underflow")

    }
    if(front==rear ) {                  //If queue have only one element
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

object  square{

  def main(args: Array[String]) {

    val squareQueue = new squareQueue()

    println("Queue elements are:")
    squareQueue.enqueue(100)
    squareQueue.enqueue(99)
    squareQueue.enqueue(98)
    squareQueue.enqueue(97)

    print(squareQueue.getList())

    println()

    println("Queue elements are :")

    squareQueue.dequeue()

    println(squareQueue.getList())
  }
}