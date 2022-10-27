package com.gamblingcode;

public class Gambling {
    public static void main(String[] args) {
        System.out.println("Welcome to gambling simulator");
        int TStake = 100;
        int WBet = 0;
        int LBet = 0;

        for (int i = 0; i < TStake; i++) {
            int RandomBet = (int) (Math.random() * 2);
            if (RandomBet == 1) {
                WBet++;
            } else {
                LBet++;
            }
            if (WBet == TStake / 2 | LBet == TStake / 2) {
                System.out.println("Resign for the day");
            } else {
                System.out.println("Continue gambling");
            }
        }
        System.out.println("The total bet won in a day in dollars" + WBet);
        System.out.println("The total bet lost in a day in dollars" + LBet);
        Gambling G1 =new Gambling();
        G1.check(WBet,LBet);

    }

    public static void check(int WBet, int LBet) {
        int TStake = 100;
        WBet = 0;
        LBet = 0;
        for (int i = 0; i < TStake; i++) {
            int RandomBet = (int) (Math.random() * 2);
            if (RandomBet == 1) {
                WBet++;
            } else {
                LBet++;
            }

        }
        int WRes = 20 * WBet;
        int LRes = 20 * LBet;

            System.out.println("The total bets won after 20 days is:" + WRes);
            System.out.println("The total bets lost after 20 days is:" + LRes);
        }
    }


