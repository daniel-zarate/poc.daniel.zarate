package examCH1.v4

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 7/11/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Todo {

    String name;

    String note;

}


def todos = [
        new Todo(name: "uno", note: "mi nota 1"),
        new Todo(name: "dos", note: "mi nota 2"),
        new Todo(name: "tres", note: "mi nota 3")
]


todos.each {
    println "${it.name} ${it.note}"
}


