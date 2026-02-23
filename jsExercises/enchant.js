/* Array Methods:
push -> add to bottom
pop -> remove from bottom
splice(index,1 (deletecount), newVal) -> remove from array
splice can also add multiple values by adding them as arguments after the deleteCount. This can be used to replace values, or insert values in the middle of an array (for example by removing 0 elements)

shift -> remove from arrayTop and return length
unshift -> add to arrayTop and return length
*/
const position = 2;
const replacementCard = 6;
const stack = [1, 2, 4, 1];
const newCard = 8;
const stackSize = 4;

// Retrive card from stack
export function getItem(stack, position) {
    return stack[position];
}

// Exchanging cards in stack
export function setItem(stack, position, replacementCard) {
    stack.splice(position, 1, replacementCard);
    return stack;
}

// Inserting new card on top
export function insertItemAtTop(stack, newCard) {
    stack.push(newCard);
    return stack;
}

// Remove card from any specified position
export function removeItem(stack, position) {
    stack.splice(position, 1);
    return stack;
}

// Remove top card from stack
export function removeItemFromTop(stack) {
    stack.pop();
    return stack;
}

// Insert card at bottom of stack
export function insertItemAtBottom(stack, newCard) {
    stack.unshift(newCard);
    return stack;
}

// Remove card from bottom
export function removeItemAtBottom(stack) {
    stack.shift();
    return stack;
}

// Verify stack size
export function checkSizeOfStack(stack, stackSize) {
    // base case: stacks not equal
    if (!(stack.length === stackSize)) {
        return false;
    }
    return true;
}
