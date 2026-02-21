
/* String Methods: toUpperCase, toLowerCase, trim, includes,
startsWith, endsWith, slice*/

// Front door password uses first letter
export function frontDoorResponse(line) {
    return line[0];
}

// Only first letter must be capitalized
export function frontDoorPassword(letters) {
    return letters[0].toUpperCase() + letters.slice(1).toLowerCase();
}

// Back door password uses last index of sentence
export function backDoorResponse(line) {
    // trim to remove whitespace
    return line.trim().at(-1);
}

// Needs capitalization + polite phrase
export function backDoorPassword(letters) {
    return frontDoorPassword(letters) + ', please';
}

let example = 'SHIRE_Man       ';
console.log(backDoorResponse(example));