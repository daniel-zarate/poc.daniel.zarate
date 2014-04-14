package examCH2.v4

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 15/11/13
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */


def list = ["Daniel", "Abi", "Pepe", "Vlad"]

println "Con un closure normal en un each"
list.each {println it}

String printName (String name){
    println(name)
}

list.each(this.&printName)

def sayHello  = {println it}

list.each (sayHello)


