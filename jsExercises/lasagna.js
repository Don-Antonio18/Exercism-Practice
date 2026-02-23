export const MY_VALUE = 20;
export const EXPECTED_MINUTES_IN_OVEN = 40;
const PREPARATION_MINUTES_PER_LAYER = 2;

export function add(a, b) {
	return a + b;
}

export function remainingMinutesInOven(actualMinutesInOven) {
	return EXPECTED_MINUTES_IN_OVEN - actualMinutesInOven;
}

// Each Layer Takes 2 Minutes to Prepare
export function preparationTimeInMinutes(numberOfLayers) {
	return numberOfLayers * PREPARATION_MINUTES_PER_LAYER;
}

export function totalTimeInMinutes(numberOfLayers, actualMinutesInOven) {
	return add(preparationTimeInMinutes(numberOfLayers), actualMinutesInOven);
}

console.log(totalTimeInMinutes(3, 20));
