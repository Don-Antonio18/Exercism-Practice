class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter){
        return 1;
    }
}

class Warrior extends Fighter {

    // a warrior is never vulnerable
    @Override
    boolean isVulnerable() {
        return false;
    }

    // A Warrior deals 6 points of damage if the fighter they are attacking is not vulnerable.
    // A Warrior deals 10 points of damage if the fighter they are attacking is vulnerable.
    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {

    boolean spellPrepared = false; // keep track of spell progress

    // A Wizard can prepare a spell in advance.
    void prepareSpell() {
        spellPrepared = true;
    }

    // A Wizard is vulnerable unless they have prepared a spell in advance.
    @Override
    boolean isVulnerable() {
        if (spellPrepared) {
            return false; }
        else {
            return true;
        }

    }
    // A Wizard deals 12 points of damage if they prepared a spell in advance.
    // A Wizard deals 3 points of damage if they did not prepare a spell in advance.
    @Override
    int getDamagePoints(Fighter fighter) {
        return spellPrepared ? 12 : 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}