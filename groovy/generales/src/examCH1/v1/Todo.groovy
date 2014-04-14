package examCH1.v1

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

    public static void main (String [] args){
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(name:"uno", note:"mi nota 1"))
        todos.add(new Todo(name:"dos", note:"mi nota 2"))
        todos.add(new Todo(name:"tres", note:"mi nota 3"))

        for (Todo todo : todos){
            System.out.println("--- >"+Todo.name + " "+ todo.note);
        }
    }
}
