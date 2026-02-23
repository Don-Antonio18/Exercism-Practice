let knightIsAwake = false;
let archerIsAwake = true;
let prisonerIsAwake = false;
let petDogIsPresent = false;

// Cannot attack if knight is awake
export function canExecuteFastAttack(knightIsAwake) {
    if (knightIsAwake) {
        return false;
    }
    return true;
}

// Can spy if at least 1 is awake
export function canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake) {
    if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
        return true;
    }
    return false
}

// Can signal if prisoner is awake && archer is sleeping
export function canSignalPrisoner(archerIsAwake, prisonerIsAwake) {
    if (!archerIsAwake && prisonerIsAwake) {
        return true;
    }
    return false;
}

// Can free prisoner if dog present && archer asleep
// Or if prisoner awake && both knight and archer sleep
export function canFreePrisoner(knightIsAwake,archerIsAwake,prisonerIsAwake, petDogIsPresent) {
    if (!archerIsAwake && petDogIsPresent) {
        return true;
    }
    if (prisonerIsAwake && !knightIsAwake && !archerIsAwake){
        return true;
    }
    return false;
}

console.log(canExecuteFastAttack(knightIsAwake));
console.log(canSpy(knightIsAwake,archerIsAwake,prisonerIsAwake));
console.log(canSignalPrisoner(archerIsAwake, prisonerIsAwake));
console.log(canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
