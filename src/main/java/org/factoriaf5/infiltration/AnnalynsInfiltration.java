package org.factoriaf5.infiltration;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake == false) {
            return true;
        }

        return false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
            return true;

        }

        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake == false && prisonerIsAwake) {
            return true;
        }

        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        if (petDogIsPresent && archerIsAwake == false) {
            return true;
        } else if (petDogIsPresent == false && prisonerIsAwake && archerIsAwake == false && knightIsAwake == false) {
            return true;
        } else if (prisonerIsAwake == false) {
            return false;
        }

        return false;
    }

}
