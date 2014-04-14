package examCH2.v3

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 8/11/13
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */

def todos = ['a':'probando','b':'write section']

println( todos.size())

println( todos['a'])

println todos."a"

println todos.a

todos << ['c':'record']

println(todos)

todos.each {
    println "Key: "+it.key+" Value: "+it.value
}

todos.values().each {
    println it

}

todos.eachWithIndex{ it,  i ->
    println "Index ${i} Key: ${it.key} Value: ${it.value}"
}


