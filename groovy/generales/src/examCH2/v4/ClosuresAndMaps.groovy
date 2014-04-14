package examCH2.v4

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 15/11/13
 * Time: 12:56 PM
 * To change this template use File | Settings | File Templates.
 */

key1 = {println "closure as key"}

map1 = [(key1):100]

println map1.get(key1)

println map1[key1]

map1 = [key1:{println "closure as value"}]

map1.key1()




