package examCH1.v5

import groovy.json.JsonSlurper

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 7/11/13
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */
def slurper = new JsonSlurper();

def result = slurper.parseText('{"person":{"name":"daniel","age":"27","cars":["ibiza","clio"]}}')

println result.person.name

println result.person.age

println result.person.cars.size()

println result.person.cars[0]

println result.person.cars[1]