package examCH3.v2

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 19/11/13
 * Time: 09:45 PM
 * To change this template use File | Settings | File Templates.
 */

def todos = new XmlSlurper().parse('C:/Proyectos/Pruebas_Tecnologias/danielzarate/groovy/generales/src/examCH3/v2/todos.xml');

assert 1 == todos.todo.size()

assert "Buy Beginning Groovy, Grails and Griffon" == todos.todo[0].name.text()

assert "1" == todos.todo[0].@id.text();

