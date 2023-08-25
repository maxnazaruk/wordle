package com.example.demowordy;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GUIElements {
    static String longList = "Apple Beach Brain Bread Brush Chair Chest Chord Click Clock Cloud Dance Diary Drink Earth Flute Fruit Ghost Grape Green Happy Heart House Juice Light " +
            "Money Music Party Pizza Plant Radio River Salad Sheep Shoes Smile Snack Snake Spice Spoon Stom Table Toast Tiger Train Water Whale Wheel Woman World Write Youth Abyss" +
            " Ample Ankle Aroma Aural Began Blunt Braid Brisk Bumpy Chive Clasp Crave Crest Cumin Drape Dregs Dumpy Dusky Dwell Elite Ember Enact Evade Evoke Fable Flair Fluke Folly" +
            " Gauze Giddy Gloom Gorge Gusty Haste Hilly Hippy Hovel Hunch Icily Inept Inert Irate Ivory Jaded Jazzy Jolly Joust Jumpy Kinky Knack Knave Knead Kudos Lanky Latch Lolly " +
            "Lurid Mirth Moody Mourn Mower Muggy Nanny Nappy Nerve Nifty Nudge Olive Onset Oomph Ounce Ovals Peppy Pious Pique Plush Poise Quail Quake " +
            "Quell Quill Quirk Ravel Reedy Ruddy Runic Sable Spicy Stilt Swath Swirl Toast Tonic Triad Tryst Tweak Audio Adore Audit Aroma Oread Urate Sauce Adieu Arise Louie Above " +
            "Acute Alive Alone Angry Aware Awful Basic Black Blind Brave Brief Broad Brown Cheap Chief Civil Clean Clear Close Crazy Daily Dirty Early Empty Equal Exact Extra Faint " +
            "False Fifth Final First Fresh Front Funny Giant Grand Great Green Gross Happy Harsh Heavy Human Ideal Inner Joint Large Legal Level Light Local Loose Lucky Magic Major " +
            "Minor Moral Naked Nasty Naval Outer Plain Prime Prior Proud Quick Rapid Ready Right Roman Rough Round Royal Rural Sharp Sheer Short Silly Sixth Small Smart Solid Sorry " +
            "Spare Steep Still Sweet Thick Third Tight Total Tough Upper Upset Urban Usual Vague Valid Vital White Whole Wrong Young Abuse Adult Agent Anger Apple Award Basis Beach " +
            "Birth Block Blood Board Brain Break Brown Buyer Cause Chain Chair Chest Chief Child China Claim Class Clock Coach Coast Court Cover Cream Crime Cross Crowd Crown Cycle " +
            "Dance Death Depth Doubt Draft Drama Dream Drink Drive Earth Enemy Entry Error Event Fault Field Fight Final Floor Focus Force Frame Frank Front Fruit Glass Grass Green Group " +
            "Guide Heart Henry Horse Hotel House Image Index Input Issue Japan Jones Judge Knife Laura Layer Level Lewis Light Limit Lunch Major March Match Metal Model Money Month Motor " +
            "Mouth Music Night Noise Novel Nurse Offer Order Other Owner Panel Paper Party Peace Peter Phase Phone Piece Pilot Pitch Plane Plant Plate Point Pound Power Press Price Pride " +
            "Prize Proof Queen Radio Range Ratio Reply Right River Round Route Scale Scene Scope Score Sense Shape Share Sheep Sheet Shift Shirt Shock Sight Simon Skill Sleep Smile Smith " +
            "Smoke Sound South Space Speed Spite Sport Squad Staff Stage Start Steam Steel Stock Stone Store Study Stuff Style Sugar Table Taste Terry Theme Thing Title Total Touch Tower " +
            "Track Trade Trend Trial Trust Truth Uncle Union Unity Value Visit Voice Waste Watch Water While White Whole Woman World Youth There Where Which Whose Whoso Yours Yours Aback Abaft Aboon About Above Accel Adown Afoot Afore Afoul After Again Agape Agogo Agone Ahead Ahull Alife " +
            "Alike Aloft Alone Along Aloof Aloud Amiss Amply Apace Apart Aptly Arear Aside Askew Awful Badly Bally Below Canny Cheap Clean Clear Coyly Daily Dimly Dirty Ditto Dryly " +
            "Dully Early Extra False Fatly Feyly First Fitly Forte Forth Fresh Fully Funny Gaily Gayly Godly Great Haply Heavy Hella Hence Hotly Icily Infra Jildi Jolly Laxly Lento Light Lowly Madly Maybe Never Newly Nobly Oddly Often Other Ought Party Piano Plain Plonk Plumb Prior Queer Quick Quite Ramen Rapid Redly Right Rough Round Sadly Secus Selly Sharp Sheer Shily Short Shyly Silly Since Sleek Slyly Small So-So Sound Spang Stark Still Stone Stour Super " +
            "Tally Tanto There Thick Tight Today Tomoz Truly Twice Under Utter Verry Wanly Wetly Where Wrong Wryly";
    public static String getRandomWord(){


        List<String> breaking = Arrays.stream(longList.split(" ")).toList();

        return breaking.get((int) (Math.random() * (breaking.size() - 1))).toLowerCase();
    }

    public static boolean isWordExists(String word){
        List<String> breaking = Arrays.stream(longList.split(" ")).toList();
        List<String> lowerCaseWords = new ArrayList<>();
        for (String wordList : breaking){
            lowerCaseWords.add(wordList.toLowerCase());
        }
        return lowerCaseWords.contains(word.toLowerCase());
    }
}
