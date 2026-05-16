package iit.android.language;

import iit.android.language.Language;
import iit.android.swarachakra.KeyAttr;

import java.util.ArrayList;
import java.util.HashMap;

import android.annotation.SuppressLint;

public class MainLanguage extends Language {

    public MainLanguage() {
        name = "telugu";
        symbol = "\u0C24\u0C46";
        nKeys = 106;
        myKey = new ArrayList<KeyAttr>(nKeys);
        defaultChakra = new String[] { "\u0c4d", "\u0c3e", "\u0c3f", "\u0c40",
                "\u0c41", "\u0c42", "\u0c46", "\u0c47", "\u0c4a", "\u0c4b" };
        halantExists = true;
        halantEnd = 35;

        KeyAttr tempKey = new KeyAttr();
        for (int i = 0; i < nKeys; i++) {
            myKey.add(i, tempKey);
        }

        KeyAttr myKey0 = new KeyAttr();
        myKey0.code = 1;
        myKey0.label = "\u0c15";
        myKey0.showChakra = true;
        myKey.add(myKey0);

        KeyAttr myKey1 = new KeyAttr();
        myKey1.code = 2;
        myKey1.label = "\u0c16";
        myKey1.showChakra = true;
        myKey.add(myKey1);

        KeyAttr myKey2 = new KeyAttr();
        myKey2.code = 3;
        myKey2.label = "\u0c17";
        myKey2.showChakra = true;
        myKey.add(myKey2);

        KeyAttr myKey3 = new KeyAttr();
        myKey3.code = 4;
        myKey3.label = "\u0c18";
        myKey3.showChakra = true;
        myKey.add(myKey3);

        KeyAttr myKey4 = new KeyAttr();
        myKey4.code = 5;
        myKey4.label = "\u0c19";
        myKey4.showChakra = true;
        myKey.add(myKey4);

        KeyAttr myKey5 = new KeyAttr();
        myKey5.code = 6;
        myKey5.label = "\u0c1a";
        myKey5.showChakra = true;
        myKey.add(myKey5);

        KeyAttr myKey6 = new KeyAttr();
        myKey6.code = 7;
        myKey6.label = "\u0c1b";
        myKey6.showChakra = true;
        myKey.add(myKey6);

        KeyAttr myKey7 = new KeyAttr();
        myKey7.code = 8;
        myKey7.label = "\u0c1c";
        myKey7.showChakra = true;
        myKey.add(myKey7);

        KeyAttr myKey8 = new KeyAttr();
        myKey8.code = 9;
        myKey8.label = "\u0c1d";
        myKey8.showChakra = true;
        myKey.add(myKey8);

        KeyAttr myKey9 = new KeyAttr();
        myKey9.code = 10;
        myKey9.label = "\u0c1e";
        myKey9.showChakra = true;
        myKey.add(myKey9);

        KeyAttr myKey10 = new KeyAttr();
        myKey10.code = 11;
        myKey10.label = "\u0c1f";
        myKey10.showChakra = true;
        myKey.add(myKey10);

        KeyAttr myKey11 = new KeyAttr();
        myKey11.code = 12;
        myKey11.label = "\u0c20";
        myKey11.showChakra = true;
        myKey.add(myKey11);

        KeyAttr myKey12 = new KeyAttr();
        myKey12.code = 13;
        myKey12.label = "\u0c21";
        myKey12.showChakra = true;
        myKey.add(myKey12);

        KeyAttr myKey13 = new KeyAttr();
        myKey13.code = 14;
        myKey13.label = "\u0c22";
        myKey13.showChakra = true;
        myKey.add(myKey13);

        KeyAttr myKey14 = new KeyAttr();
        myKey14.code = 15;
        myKey14.label = "\u0c23";
        myKey14.showChakra = true;
        myKey.add(myKey14);

        KeyAttr myKey15 = new KeyAttr();
        myKey15.code = 16;
        myKey15.label = "\u0c24";
        myKey15.showChakra = true;
        myKey.add(myKey15);

        KeyAttr myKey16 = new KeyAttr();
        myKey16.code = 17;
        myKey16.label = "\u0c25";
        myKey16.showChakra = true;
        myKey.add(myKey16);

        KeyAttr myKey17 = new KeyAttr();
        myKey17.code = 18;
        myKey17.label = "\u0c26";
        myKey17.showChakra = true;
        myKey.add(myKey17);

        KeyAttr myKey18 = new KeyAttr();
        myKey18.code = 19;
        myKey18.label = "\u0c27";
        myKey18.showChakra = true;
        myKey.add(myKey18);

        KeyAttr myKey19 = new KeyAttr();
        myKey19.code = 20;
        myKey19.label = "\u0c28";
        myKey19.showChakra = true;
        myKey.add(myKey19);

        KeyAttr myKey20 = new KeyAttr();
        myKey20.code = 21;
        myKey20.label = "\u0c2a";
        myKey20.showChakra = true;
        myKey.add(myKey20);

        KeyAttr myKey21 = new KeyAttr();
        myKey21.code = 22;
        myKey21.label = "\u0c2b";
        myKey21.showChakra = true;
        myKey.add(myKey21);

        KeyAttr myKey22 = new KeyAttr();
        myKey22.code = 23;
        myKey22.label = "\u0c2c";
        myKey22.showChakra = true;
        myKey.add(myKey22);

        KeyAttr myKey23 = new KeyAttr();
        myKey23.code = 24;
        myKey23.label = "\u0c2d";
        myKey23.showChakra = true;
        myKey.add(myKey23);

        KeyAttr myKey24 = new KeyAttr();
        myKey24.code = 25;
        myKey24.label = "\u0c2e";
        myKey24.showChakra = true;
        myKey.add(myKey24);

        KeyAttr myKey25 = new KeyAttr();
        myKey25.code = 26;
        myKey25.label = "\u0c2f";
        myKey25.showChakra = true;
        myKey.add(myKey25);

        KeyAttr myKey26 = new KeyAttr();
        myKey26.code = 27;
        myKey26.label = "\u0c30";
        myKey26.showChakra = true;
        myKey.add(myKey26);

        KeyAttr myKey27 = new KeyAttr();
        myKey27.code = 28;
        myKey27.label = "\u0c32";
        myKey27.showChakra = true;
        myKey.add(myKey27);

        KeyAttr myKey28 = new KeyAttr();
        myKey28.code = 29;
        myKey28.label = "\u0c35";
        myKey28.showChakra = true;
        myKey.add(myKey28);

        KeyAttr myKey29 = new KeyAttr();
        myKey29.code = 30;
        myKey29.label = "\u0c36";
        myKey29.showChakra = true;
        myKey.add(myKey29);

        KeyAttr myKey30 = new KeyAttr();
        myKey30.code = 31;
        myKey30.label = "\u0c37";
        myKey30.showChakra = true;
        myKey.add(myKey30);

        KeyAttr myKey31 = new KeyAttr();
        myKey31.code = 32;
        myKey31.label = "\u0c38";
        myKey31.showChakra = true;
        myKey.add(myKey31);

        KeyAttr myKey32 = new KeyAttr();
        myKey32.code = 33;
        myKey32.label = "\u0c39";
        myKey32.showChakra = true;
        myKey.add(myKey32);

        KeyAttr myKey33 = new KeyAttr();
        myKey33.code = 34;
        myKey33.label = "\u0c33";
        myKey33.showChakra = true;
        myKey.add(myKey33);

        KeyAttr myKey34 = new KeyAttr();
        myKey34.code = 35;
        myKey34.label = "\u0c15\u0c4d\u0c37";   //c31
        myKey34.showChakra = true;
        myKey.add(myKey34);

        KeyAttr myKey35 = new KeyAttr();
        myKey35.code = 36;
        myKey35.label = "\u0c05";
        myKey35.showChakra = true;
        myKey35.showCustomChakra = true;
        myKey35.customChakraLayout = new String[] { "", "\u0c06", "\u0c07",
                "\u0c08", "\u0c09", "\u0c0a", "\u0c0e", "\u0c0f", "\u0c12",
                "\u0c13" };
        myKey.add(myKey35);

        KeyAttr myKey36 = new KeyAttr();
        myKey36.code = 37;
        myKey36.label = "\u0c3e";
        myKey36.showChakra = true;
        myKey36.showCustomChakra = true;
        myKey36.customChakraLayout = new String[] { "\u0c4d", "\u0c3e",
                "\u0c3f", "\u0c40", "\u0c41", "\u0c42", "\u0c46", "\u0c47",
                "\u0c4a", "\u0c4b" };
        myKey.add(myKey36);

        KeyAttr myKey37 = new KeyAttr();
        myKey37.code = 38;
        myKey37.label = "\u0c0b";
        myKey37.showChakra = true;
        myKey37.showCustomChakra = true;
        myKey37.customChakraLayout = new String[]{"\u0c31", "\u0c60", "\u0c0c", "\u0c61", "\u0c62", "\u0c63", "\u0c55", "\u0c56", "\u0c01", "\u0c3d"};
        myKey.add(myKey37);

        KeyAttr myKey38 = new KeyAttr();
        myKey38.code = 39;
        myKey38.label = "\u0c10";
        myKey38.showChakra = false;
        myKey.add(myKey38);

        KeyAttr myKey39 = new KeyAttr();
        myKey39.code = 40;
        myKey39.label = "\u0c14";
        myKey39.showChakra = false;
        myKey.add(myKey39);

        KeyAttr myKey40 = new KeyAttr();
        myKey40.code = 41;
        myKey40.label = ".";
        myKey40.showChakra = false;
        myKey.add(myKey40);

        KeyAttr myKey41 = new KeyAttr();
        myKey41.code = 42;
        myKey41.label = "\u002c";
        myKey41.showChakra = false;
        myKey.add(myKey41);

        KeyAttr myKey42 = new KeyAttr();
        myKey42.code = 43;
        myKey42.label = "!";
        myKey42.showChakra = false;
        myKey.add(myKey42);

        KeyAttr myKey43 = new KeyAttr();
        myKey43.code = 44;
        myKey43.label = "?";
        myKey43.showChakra = false;
        myKey.add(myKey43);

        KeyAttr myKey44 = new KeyAttr();
        myKey44.code = 45;
        myKey44.label = "\u002d";
        myKey44.showChakra = false;
        myKey.add(myKey44);

        KeyAttr myKey45 = new KeyAttr();
        myKey45.code = 46;
        myKey45.label = "\"";
        myKey45.showChakra = true;
        myKey45.showCustomChakra = true;
        myKey45.customChakraLayout = new String[] {"","","","\u201D","","","","","\u201C",""};
        myKey.add(myKey45);

        KeyAttr myKey46 = new KeyAttr();
        myKey46.code = 47;
        myKey46.label = "'";
        myKey46.showChakra = true;
        myKey46.showCustomChakra = true;
        myKey46.customChakraLayout = new String[] {"","","","\u2019","","","","","\u2018",""};
        myKey.add(myKey46);

        KeyAttr myKey47 = new KeyAttr();
        myKey47.code = 48;
        myKey47.label = "\u0c02";
        myKey47.showChakra = false;
        myKey.add(myKey47);

        KeyAttr myKey48 = new KeyAttr();
        myKey48.code = 49;
        myKey48.label = "\u0c03";
        myKey48.showChakra = false;
        myKey.add(myKey48);

        KeyAttr myKey49 = new KeyAttr();
        myKey49.code = 50;
        myKey49.label = "\u0c48";
        myKey49.showChakra = false;
        myKey.add(myKey49);

        KeyAttr myKey50 = new KeyAttr();
        myKey50.code = 51;
        myKey50.label = "\u0c4c";
        myKey50.showChakra = false;
        myKey.add(myKey50);

        KeyAttr myKey51 = new KeyAttr();
        myKey51.code = 52;
        myKey51.label = "\u0c43";
        myKey51.showChakra = false;
        myKey.add(myKey51);

        KeyAttr myKey52 = new KeyAttr();
        myKey52.code = 53;
        myKey52.label = "\u0c44";
        myKey52.showChakra = false;
        myKey.add(myKey52);

        KeyAttr myKey53 = new KeyAttr();
        myKey53.code = 54;
        myKey53.label = ".";
        myKey53.showChakra = false;
        myKey.add(myKey53);

        KeyAttr myKey54 = new KeyAttr();
        myKey54.code = 55;
        myKey54.label = "\u0970";
        myKey54.showChakra = false;
        myKey.add(myKey54);

        KeyAttr myKey55 = new KeyAttr();
        myKey55.code = 56;
        myKey55.label = "1";
        myKey55.showChakra = false;
        myKey.add(myKey55);

        KeyAttr myKey56 = new KeyAttr();
        myKey56.code = 57;
        myKey56.label = "2";
        myKey56.showChakra = false;
        myKey.add(myKey56);

        KeyAttr myKey57 = new KeyAttr();
        myKey57.code = 58;
        myKey57.label = "3";
        myKey57.showChakra = false;
        myKey.add(myKey57);

        KeyAttr myKey58 = new KeyAttr();
        myKey58.code = 59;
        myKey58.label = "\u002B";
        myKey58.showChakra = false;
        myKey.add(myKey58);

        KeyAttr myKey59 = new KeyAttr();
        myKey59.code = 60;
        myKey59.label = ",";
        myKey59.showChakra = false;
        myKey.add(myKey59);

        KeyAttr myKey60 = new KeyAttr();
        myKey60.code = 61;
        myKey60.label = "\u0965";
        myKey60.showChakra = false;
        myKey.add(myKey60);

        KeyAttr myKey61 = new KeyAttr();
        myKey61.code = 62;
        myKey61.label = "4";
        myKey61.showChakra = false;
        myKey.add(myKey61);

        KeyAttr myKey62 = new KeyAttr();
        myKey62.code = 63;
        myKey62.label = "5";
        myKey62.showChakra = false;
        myKey.add(myKey62);

        KeyAttr myKey63 = new KeyAttr();
        myKey63.code = 64;
        myKey63.label = "6";
        myKey63.showChakra = false;
        myKey.add(myKey63);

        KeyAttr myKey64 = new KeyAttr();
        myKey64.code = 65;
        myKey64.label = "\u002D";
        myKey64.showChakra = false;
        myKey.add(myKey64);

        KeyAttr myKey65 = new KeyAttr();
        myKey65.code = 66;
        myKey65.label = ";";
        myKey65.showChakra = false;
        myKey.add(myKey65);

        KeyAttr myKey66 = new KeyAttr();
        myKey66.code = 67;
        myKey66.label = "_";
        myKey66.showChakra = false;
        myKey.add(myKey66);

        KeyAttr myKey67 = new KeyAttr();
        myKey67.code = 68;
        myKey67.label = "7";
        myKey67.showChakra = false;
        myKey.add(myKey67);

        KeyAttr myKey68 = new KeyAttr();
        myKey68.code = 69;
        myKey68.label = "8";
        myKey68.showChakra = false;
        myKey.add(myKey68);

        KeyAttr myKey69 = new KeyAttr();
        myKey69.code = 70;
        myKey69.label = "9";
        myKey69.showChakra = false;
        myKey.add(myKey69);

        KeyAttr myKey70 = new KeyAttr();
        myKey70.code = 71;
        myKey70.label = "x";
        myKey70.showChakra = false;
        myKey.add(myKey70);

        KeyAttr myKey71 = new KeyAttr();
        myKey71.code = 72;
        myKey71.label = "=";
        myKey71.showChakra = false;
        myKey.add(myKey71);

        KeyAttr myKey72 = new KeyAttr();
        myKey72.code = 73;
        myKey72.label = ":";
        myKey72.showChakra = false;
        myKey.add(myKey72);

        KeyAttr myKey73 = new KeyAttr();
        myKey73.code = 74;
        myKey73.label = "\u2014";
        myKey73.showChakra = false;
        myKey.add(myKey73);

        KeyAttr myKey74 = new KeyAttr();
        myKey74.code = 75;
        myKey74.label = "*";
        myKey74.showChakra = false;
        myKey.add(myKey74);

        KeyAttr myKey75 = new KeyAttr();
        myKey75.code = 76;
        myKey75.label = "0";
        myKey75.showChakra = false;
        myKey.add(myKey75);

        KeyAttr myKey76 = new KeyAttr();
        myKey76.code = 77;
        myKey76.label = "#";
        myKey76.showChakra = false;
        myKey.add(myKey76);

        KeyAttr myKey77 = new KeyAttr();
        myKey77.code = 78;
        myKey77.label = "\u00F7";
        myKey77.showChakra = false;
        myKey.add(myKey77);

        KeyAttr myKey78 = new KeyAttr();
        myKey78.code = 79;
        myKey78.label = "|";
        myKey78.showChakra = false;
        myKey.add(myKey78);

        KeyAttr myKey79 = new KeyAttr();
        myKey79.code = 80;
        myKey79.label = "\u20B9";
        myKey79.showChakra = false;
        myKey.add(myKey79);

        KeyAttr myKey80 = new KeyAttr();
        myKey80.code = 81;
        myKey80.label = "$";
        myKey80.showChakra = false;
        myKey.add(myKey80);

        KeyAttr myKey81 = new KeyAttr();
        myKey81.code = 82;
        myKey81.label = "%";
        myKey81.showChakra = false;
        myKey.add(myKey81);

        KeyAttr myKey82 = new KeyAttr();
        myKey82.code = 83;
        myKey82.label = "\u2122";
        myKey82.showChakra = false;
        myKey.add(myKey82);

        KeyAttr myKey83 = new KeyAttr();
        myKey83.code = 84;
        myKey83.label = "\u00A9";
        myKey83.showChakra = false;
        myKey.add(myKey83);

        KeyAttr myKey84 = new KeyAttr();
        myKey84.code = 85;
        myKey84.label = "/";
        myKey84.showChakra = false;
        myKey.add(myKey84);

        KeyAttr myKey85 = new KeyAttr();
        myKey85.code = 86;
        myKey85.label = "\\";
        myKey85.showChakra = false;
        myKey.add(myKey85);

        KeyAttr myKey86 = new KeyAttr();
        myKey86.code = 87;
        myKey86.label = "@";
        myKey86.showChakra = false;
        myKey.add(myKey86);

        KeyAttr myKey87 = new KeyAttr();
        myKey87.code = 88;
        myKey87.label = "&";
        myKey87.showChakra = false;
        myKey.add(myKey87);

        KeyAttr myKey88 = new KeyAttr();
        myKey88.code = 89;
        myKey88.label = "\u0950";
        myKey88.showChakra = false;
        myKey.add(myKey88);

        KeyAttr myKey89 = new KeyAttr();
        myKey89.code = 90;
        myKey89.label = "\u00AE";
        myKey89.showChakra = false;
        myKey.add(myKey89);

        KeyAttr myKey90 = new KeyAttr();
        myKey90.code = 91;
        myKey90.label = "~";
        myKey90.showChakra = false;
        myKey.add(myKey90);

        KeyAttr myKey91 = new KeyAttr();
        myKey91.code = 92;
        myKey91.label = "<";
        myKey91.showChakra = false;
        myKey.add(myKey91);

        KeyAttr myKey92 = new KeyAttr();
        myKey92.code = 93;
        myKey92.label = ">";
        myKey92.showChakra = false;
        myKey.add(myKey92);

        KeyAttr myKey93 = new KeyAttr();
        myKey93.code = 94;
        myKey93.label = "^";
        myKey93.showChakra = false;
        myKey.add(myKey93);

        KeyAttr myKey94 = new KeyAttr();
        myKey94.code = 95;
        myKey94.label = "\u0C58";
        myKey94.showChakra = false;
        myKey.add(myKey94);

        KeyAttr myKey95 = new KeyAttr();
        myKey95.code = 96;
        myKey95.label = "\u0C59";
        myKey95.showChakra = false;
        myKey.add(myKey95);

        KeyAttr myKey96 = new KeyAttr();
        myKey96.code = 97;
        myKey96.label = "";
        myKey96.showChakra = false;
        myKey.add(myKey96);

        KeyAttr myKey97 = new KeyAttr();
        myKey97.code = 98;
        myKey97.label = "";
        myKey97.showChakra = false;
        myKey.add(myKey97);

        KeyAttr myKey98 = new KeyAttr();
        myKey98.code = 99;
        myKey98.label = "(";
        myKey98.showChakra = false;
        myKey.add(myKey98);

        KeyAttr myKey99 = new KeyAttr();
        myKey99.code = 100;
        myKey99.label = ")";
        myKey99.showChakra = false;
        myKey.add(myKey99);

        KeyAttr myKey100 = new KeyAttr();
        myKey100.code = 101;
        myKey100.label = "";
        myKey100.showChakra = false;
        myKey.add(myKey100);

        KeyAttr myKey101 = new KeyAttr();
        myKey101.code = 102;
        myKey101.label = "";
        myKey101.showChakra = false;
        myKey.add(myKey101);

        KeyAttr myKey102 = new KeyAttr();
        myKey102.code = 103;
        myKey102.label = "";
        myKey102.showChakra = false;
        myKey.add(myKey102);

        KeyAttr myKey103 = new KeyAttr();
        myKey103.code = 104;
        myKey103.label = "";
        myKey103.showChakra = false;
        myKey.add(myKey103);

        KeyAttr myKey104 = new KeyAttr();
        myKey104.code = 105;
        myKey104.label = "{";
        myKey104.showChakra = false;
        myKey.add(myKey104);

        KeyAttr myKey105 = new KeyAttr();
        myKey105.code = 106;
        myKey105.label = "}";
        myKey105.showChakra = false;
        myKey.add(myKey105);

    }

    @Override
    @SuppressLint("UseSparseArrays")
    public HashMap<Integer, KeyAttr> hashThis() {
        HashMap<Integer, KeyAttr> hashed = new HashMap<Integer, KeyAttr>();
        for (int i = 0; i < nKeys; i++) {
            KeyAttr key = myKey.get(i);
            hashed.put(key.code, key);
        }
        return hashed;
    }
}