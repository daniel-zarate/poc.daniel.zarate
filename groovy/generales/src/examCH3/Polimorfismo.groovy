package examCH3

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 18/11/13
 * Time: 10:33 PM
 * To change this template use File | Settings | File Templates.
 */

class Square{
    def length
    def width

    def display(){
        def cadena = "length:${length} width:${width}" == "length:10 width:10"
        println cadena
        assert cadena
    }
}

class Rectangle{
    def length
    def width

    def display(){
        def cadena = "length:${length} width:${width}" == "length:10 width:12"
        println cadena
        assert cadena

    }
}

def shapes = [new Square(length: 10,width: 10), new Rectangle(length: 10, width: 12)]

shapes.each {item -> item.display()}


