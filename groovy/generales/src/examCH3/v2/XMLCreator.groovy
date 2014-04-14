package examCH3.v2

import groovy.xml.MarkupBuilder

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 19/11/13
 * Time: 11:33 AM
 * To change this template use File | Settings | File Templates.
 */

def writer = new StringWriter()
def builder = new MarkupBuilder(writer)

builder.setDoubleQuotes(true)

builder.todos{
    todo(id:"1"){
        name "Buy Beginning Groovy, Grails and Griffon"
        note "una nota del xml"
    }
}

println writer.toString()