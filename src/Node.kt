class Node(
    //data is the length of the path of customer
    var distance: Int,
    //Name of the customer
    var name: String
) {

    var following: Node? = null

    fun appendToEnd(data: Int, name: String) {
        val end = Node(data,name)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    fun printNodes() {
        var current: Node? = this
        while (current != null) {
            println("distance : ${current.distance} name :  ${current.name}")
            if (current.following != null) {
                current = current.following
            } else {
                break
            }
        }
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        var totalCustomerCount = 0
        var current: Node? = h
        while (current != null) {
            totalCustomerCount ++
            if (current.following != null) {
                current = current.following
            } else {
                break
            }
        }
        return totalCustomerCount
    }

    fun sumOfNodes(): Int {
        var totalDistance = 0
        var current: Node? = this
        while (current != null) {
            totalDistance += current.distance
            if (current.following != null) {
                current = current.following
            } else {
                break
            }
        }
        return totalDistance
    }

    fun deleteNode(head: Node, data: Int): Node? {
        val n: Node = head

        if (n.distance == data) {
            return head.following
        }
        var nextNode = head.following
        while (true){
            if (nextNode == null){
                println("Data not found")
                break
            }
            if (data == nextNode.following?.distance){
                nextNode.following = nextNode.following?.following
                break
            }else{
                nextNode = nextNode.following
            }
        }
        return head
    }
}