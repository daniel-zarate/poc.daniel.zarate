package examCH2.v2

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 7/11/13
 * Time: 12:59 PM
 * To change this template use File | Settings | File Templates.
 */

def name = "Jim"
def multilineQuote = """  Hello, ${name}
This is a multiline with a souble quote
"""

println multilineQuote

println multilineQuote.class.name

def multiLineSingleQuote = ''' Hello, ${name} this is a multi
line swith single quote'''

println multiLineSingleQuote

println multiLineSingleQuote.class.name


