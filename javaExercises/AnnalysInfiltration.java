public class AnnalysInfiltration {

    // Can't attack if knight is awake
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    // Can spy if at least 1 is awake
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsawake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsawake || prisonerIsAwake);
    }

    // Can signal if prisoner is awake && archer is sleeping
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (!archerIsAwake && prisonerIsAwake);
    }

    // Can free prisoner if dog present && archer asleep
    // Or if prisoner awake && both knight and archer sleep
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake) || (prisonerIsAwake && !knightIsAwake && !archerIsAwake);
    }
}