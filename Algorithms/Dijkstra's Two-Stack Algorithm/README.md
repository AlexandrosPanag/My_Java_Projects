Dijkstra's Two-Stack Algorithm
--------

Dijkstra’s Two-Stack Algorithm, In Plain English Language Words:
You need two stacks, a value stack (operands), and an operator stack. Numbers will be double values, operators will be char values. The whole of the expression is made up of items - the “stuff”, ignoring whitespace.

While there are still items to read
Get the next item
If the item is:
A number: push it onto the value stack.
A left parenthesis: push it onto the operator stack.
A right parenthesis:
While the top of the operator stack is not a left parenthesis
Pop the operator from the operator stack.
Pop the value stack twice, getting two operands.
Apply the operator to the operands, in the correct order.
Push the result onto the value stack.
Pop the left parenthesis from the operator stack
An operator op:
While the operator stack is not empty, and the top of the operator stack has the same or greater precedence as op,
Pop the operator from the operator stack.
Pop the value stack twice, getting two operands.
Apply the operator to the operands, in the correct order.
Push the result onto the value stack.
Push op onto the operator stack.
While the operator stack is not empty,
Pop the operator from the operator stack.
Pop the value stack twice, getting two operands.
Apply the operator to the operands, in the correct order.
Push the result onto the value stack.
At this point the operator stack should be empty, and the value stack should have only one value in it, which is the final result.


THIS ARTICLE WAS TAKEN FROM & CAN BE FOUND HERE: https://switzerb.github.io/imposter/algorithms/2021/01/12/dijkstra-two-stack.html
