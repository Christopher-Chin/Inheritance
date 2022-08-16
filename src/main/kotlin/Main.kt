fun main(args: Array<String>) {

    val triangle = Triangle()
    val square = Square()
    val rectangle = Rectangle()
    val circle = Circle()

    fun menu() {
        println(
            """
        **** Shape Information ***
        1 - Triangle
        2 - Square
        3 - Rectangle 
        4 - Circle
    """.trimIndent()
        )
        println("\nSelect a Shape:")
        val userInput = readLine()!!.toInt()


        when(userInput){
            1 -> {
                println("\nTriangle Information")
                println("Sides: ${triangle.sides}")
                println("Vertices: ${triangle.vertices}")
                println("Lines of Symmetry: ${triangle.linesOfSymmetry}")
                println()
                menu()
            }

            2 -> {
                println("\nSquare Information")
                println("Sides: ${square.sides}")
                println("Vertices: ${square.vertices}")
                println("Lines of Symmetry: ${square.linesOfSymmetry}")
                println()
                menu()
            }

            3 -> {
                println("\nRectangle Information")
                println("Sides: ${rectangle.sides}")
                println("Vertices: ${rectangle.vertices}")
                println("Lines of Symmetry: ${rectangle.linesOfSymmetry}")
                println()
                menu()
            }

            4 -> {
                println("\nCircle Information")
                println("Sides: ${circle.sides}")
                println("Vertices: ${circle.vertices}")
                println("Lines of Symmetry: ${circle.linesOfSymmetry}")
                println()
                menu()
            }


            else ->{
                println("Number out of range, select another option.\n")
                menu()
            }

    }

    }
    menu()

}