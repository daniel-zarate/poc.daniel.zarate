package examCH2.v3

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 8/11/13
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */

def emptyList = []

println emptyList.class.name

println(emptyList.size())

def list = ["pepe"]

list.add("daniel")

list << "jose"

println( list.size())

list.each {
    println(it)
}
