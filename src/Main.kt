lateinit var node: Node;
fun main() {
    val factory = Place(Coordinate(3.0, 7.0), "Factory")
    val customerList = mutableListOf<Place>()
    customerList.add(Place(Coordinate(1.0, 4.0), "Customer1"))
    customerList.add(Place(Coordinate(1.0, 10.0), "Customer2"))
    customerList.add(Place(Coordinate(2.0, 1.0), "Customer3"))
    customerList.add(Place(Coordinate(5.0, 2.0), "Customer4"))
    customerList.add(Place(Coordinate(6.0, 5.0), "Customer5"))
    customerList.add(Place(Coordinate(8.0, 4.0), "Customer6"))
    customerList.add(Place(Coordinate(8.0, 9.0), "Customer7"))
    customerList.add(Place(Coordinate(9.0, 2.0), "Customer8"))


    for ((index, customer) in customerList.withIndex()) {
        if (index == 0) {
            node =
                Node(Coordinate.calculateDistanceBetweenPoints(factory.coordinate, customer.coordinate), customer.name)
        } else {
            val distance = Coordinate.calculateDistanceBetweenPoints(factory.coordinate, customer.coordinate)
            node.appendToEnd(distance, customer.name)
        }
    }
    node.printNodes()
    println("sum of nodes : ${node.sumOfNodes()}")
    println("node count : ${node.length(node)}")
    println("------------------After Delete------------------")
    node.deleteNode(node, 12)?.let {
        node = it
    }
    node.printNodes()
    println("sum of nodes : ${node.sumOfNodes()}")
    println("node count : ${node.length(node)}")
}