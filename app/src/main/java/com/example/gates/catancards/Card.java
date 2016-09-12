package com.example.gates.catancards;

/**
 * Created by gates on 7/27/2016.
 */
public class Card {
    // Constants
    private static final int NORMAL     = 0;
    private static final int CALM       = 1;
    private static final int NEIGHBORLY = 2;
    private static final int EPIDEMIC   = 3;
    private static final int EARTHQUAKE = 4;
    private static final int GOOD       = 5;
    private static final int TRADE      = 6;
    private static final int TOURNAMENT = 7;
    private static final int CONFLICT   = 8;
    private static final int PLENTIFUL  = 9;
    private static final int ROBBERATCK = 10;
    private static final int ROBBERFLEE = 11;
    private static final int NEWYEAR    = 12;

    // Instance
    private int number;
    private int titleRef;
    private int descriptionRef;

    public Card(int num, int type) {
        number = num;
        switch (type) {
            case NORMAL:
                titleRef = R.string.normal_title;
                descriptionRef = R.string.normal_desc;
                break;
            case CALM:
                titleRef = R.string.calm_title;
                descriptionRef = R.string.calm_desc;
                break;
            case NEIGHBORLY:
                titleRef = R.string.neighborly_title;
                descriptionRef = R.string.neighborly_desc;
                break;
            case EPIDEMIC:
                titleRef = R.string.epidemic_title;
                descriptionRef = R.string.epidemic_desc;
                break;
            case EARTHQUAKE:
                titleRef = R.string.earthquake_title;
                descriptionRef = R.string.earthquake_desc;
                break;
            case GOOD:
                titleRef = R.string.good_title;
                descriptionRef = R.string.good_desc;
                break;
            case TRADE:
                titleRef = R.string.trade_title;
                descriptionRef = R.string.trade_desc;
                break;
            case TOURNAMENT:
                titleRef = R.string.tournament_title;
                descriptionRef = R.string.tournament_desc;
                break;
            case CONFLICT:
                titleRef = R.string.conflict_title;
                descriptionRef = R.string.conflict_desc;
                break;
            case PLENTIFUL:
                titleRef = R.string.plentiful_title;
                descriptionRef = R.string.plentiful_desc;
                break;
            case ROBBERATCK:
                titleRef = R.string.robberatck_title;
                descriptionRef = R.string.robberatck_desc;
                break;
            case ROBBERFLEE:
                titleRef = R.string.robberflee_title;
                descriptionRef = R.string.robberflee_desc;
                break;
            case NEWYEAR:
                titleRef = R.string.newyear_title;
                descriptionRef = R.string.newyear_desc;
                break;
            default:
                break;
        }
    }

    public int getNumber() {
        return number;
    }

    public int getTitleRef() {
        return titleRef;
    }

    public int getDescriptionRef() {
        return descriptionRef;
    }
}
