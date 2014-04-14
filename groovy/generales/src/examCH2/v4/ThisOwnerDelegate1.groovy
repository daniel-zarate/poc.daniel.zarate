package examCH2.v4

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 8/11/13
 * Time: 05:40 PM
 * To change this template use File | Settings | File Templates.
 */


class ThisOwnerDelegate{

    def closure = {
        println "------in closure-----"
        println this.class.name
        println owner.class.name
        println delegate.class.name

        def nestedClosure = {
            println "-------in nested closure--------"
            println this.class.name
            println owner.class.name
            println delegate.class.name

        }
        nestedClosure();

    }
}


def clos = new examCH2.v4.ThisOwnerDelegate().closure
clos()

println("")
println "====== changing the delegate ======"

clos.delegate = this

clos()

println ""

def closure2 = {
    println "--- closure outside class(in the script) ---"

    println this.class.name
    println delegate.class.name
    println owner.class.name
}

closure2()