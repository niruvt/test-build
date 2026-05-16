package iit.android.language;
import iit.android.language.Language;
import iit.android.swarachakra.KeyAttr;

import java.util.ArrayList;
import java.util.HashMap;

import android.annotation.SuppressLint;

public class MainLanguage extends Language{

    public MainLanguage() {
        name = "tamil";
        symbol = "\u0BA4";
        nKeys = 88;
        myKey = new ArrayList<KeyAttr>(nKeys);
        defaultChakra = new String[] {"\u0BBE", "\u0BBF", "\u0BC0", "\u0BC1", "\u0BC2", "\u0BC6", "\u0BC7", "\u0BC8", "\u0BCA", "\u0BCB"};
        halantExists =  false;
        halantEnd = 35;

        KeyAttr tempKey = new KeyAttr();
        for (int i=0; i < nKeys; i++ ) {
            myKey.add(i, tempKey);
        }

        KeyAttr myKey0 = new KeyAttr();
        myKey0.code = 1;
        myKey0.label = "\u0B95" ;
        myKey0.showChakra = true ;
        myKey.set(0, myKey0);

        KeyAttr myKey1 = new KeyAttr();
        myKey1.code = 2;
        myKey1.label = "\u0B99" ;
        myKey1.showChakra = true ;
        myKey.set(1, myKey1);

        KeyAttr myKey2 = new KeyAttr();
        myKey2.code = 3;
        myKey2.label = "\u0B9A" ;
        myKey2.showChakra = true ;
        myKey.set(2, myKey2);

        KeyAttr myKey3 = new KeyAttr();
        myKey3.code = 4;
        myKey3.label = "\u0B9E" ;
        myKey3.showChakra = true ;
        myKey.set(3, myKey3);

        KeyAttr myKey4 = new KeyAttr();
        myKey4.code = 5;
        myKey4.label = "\u0B9F" ;
        myKey4.showChakra = true ;
        myKey.set(4, myKey4);

        KeyAttr myKey5 = new KeyAttr();
        myKey5.code = 6;
        myKey5.label = "\u0BA3" ;
        myKey5.showChakra = true ;
        myKey.set(5, myKey5);

        KeyAttr myKey6 = new KeyAttr();
        myKey6.code = 7;
        myKey6.label = "\u0BA4" ;
        myKey6.showChakra = true ;
        myKey.set(6, myKey6);

        KeyAttr myKey7 = new KeyAttr();
        myKey7.code = 8;
        myKey7.label = "\u0BA8" ;
        myKey7.showChakra = true ;
        myKey.set(7, myKey7);

        KeyAttr myKey8 = new KeyAttr();
        myKey8.code = 9;
        myKey8.label = "\u0BAA" ;
        myKey8.showChakra = true ;
        myKey.set(8, myKey8);

        KeyAttr myKey9 = new KeyAttr();
        myKey9.code = 10;
        myKey9.label = "\u0BAE" ;
        myKey9.showChakra = true ;
        myKey.set(9, myKey9);

        KeyAttr myKey10 = new KeyAttr();
        myKey10.code = 11;
        myKey10.label = "\u0BAF" ;
        myKey10.showChakra = true ;
        myKey.set(10, myKey10);

        KeyAttr myKey11 = new KeyAttr();
        myKey11.code = 12;
        myKey11.label = "\u0BB0" ;
        myKey11.showChakra = true ;
        myKey.set(11, myKey11);

        KeyAttr myKey12 = new KeyAttr();
        myKey12.code = 13;
        myKey12.label = "\u0BB2" ;
        myKey12.showChakra = true ;
        myKey.set(12, myKey12);

        KeyAttr myKey13 = new KeyAttr();
        myKey13.code = 14;
        myKey13.label = "\u0BB5" ;
        myKey13.showChakra = true ;
        myKey.set(13, myKey13);

        KeyAttr myKey14 = new KeyAttr();
        myKey14.code = 15;
        myKey14.label = "\u0BB4" ;
        myKey14.showChakra = true ;
        myKey.set(14, myKey14);

        KeyAttr myKey15 = new KeyAttr();
        myKey15.code = 16;
        myKey15.label = "\u0BB3" ;
        myKey15.showChakra = true ;
        myKey.set(15, myKey15);

        KeyAttr myKey16 = new KeyAttr();
        myKey16.code = 17;
        myKey16.label = "\u0BB1" ;
        myKey16.showChakra = true ;
        myKey.set(16, myKey16);

        KeyAttr myKey17 = new KeyAttr();
        myKey17.code = 18;
        myKey17.label = "\u0BA9" ;
        myKey17.showChakra = true ;
        myKey.set(17, myKey17);

        KeyAttr myKey18 = new KeyAttr();
        myKey18.code = 19;
        myKey18.label = "\u0BBE" ;
        myKey18.showChakra = true ;
        myKey18.showCustomChakra = true ;
        myKey18.customChakraLayout = new String[] {"","\u0BBF","\u0BC0","\u0BC1","\u0BC2","\u0BC6","\u0BC7","\u0BC8","\u0BCA","\u0BCB"} ;//,"\u0BCC"
        myKey.set(18, myKey18);

        KeyAttr myKey19 = new KeyAttr();
        myKey19.code = 20;
        myKey19.label = "\u0B85" ;
        myKey19.showChakra = true ;
        myKey19.showCustomChakra = true ;
        myKey19.customChakraLayout = new String[] {"\u0B86","\u0B87","\u0B88","\u0B89","\u0B8A","\u0B8E","\u0B8F","\u0B90","\u0B92","\u0B93"} ;
        myKey.set(19, myKey19);

        KeyAttr myKey20 = new KeyAttr();
        myKey20.code = 21;
        myKey20.label = "\u0B9C" ;
        myKey20.showChakra = true ;
        myKey.set(20, myKey20);

        KeyAttr myKey21 = new KeyAttr();
        myKey21.code = 22;
        myKey21.label = "\u0BB8" ;
        myKey21.showChakra = true ;
        myKey.set(21, myKey21);

        KeyAttr myKey22 = new KeyAttr();
        myKey22.code = 23;
        myKey22.label = "\u0BB7" ;
        myKey22.showChakra = true ;
        myKey.set(22, myKey22);

        KeyAttr myKey23 = new KeyAttr();
        myKey23.code = 24;
        myKey23.label = "\u0BB9" ;
        myKey23.showChakra = true ;
        myKey.set(23, myKey23);

        KeyAttr myKey24 = new KeyAttr();
        myKey24.code = 25;
        myKey24.label = "\u0BB6" ;
        myKey24.showChakra = true ;
        myKey.set(24, myKey24);

        KeyAttr myKey25 = new KeyAttr();
        myKey25.code = 26;
        myKey25.label = "\u0021" ;
        myKey25.showChakra = false ;
        myKey.set(25, myKey25);

        KeyAttr myKey26 = new KeyAttr();
        myKey26.code = 27;
        myKey26.label = "\u003F" ;
        myKey26.showChakra = false ;
        myKey.set(26, myKey26);

        KeyAttr myKey27 = new KeyAttr();
        myKey27.code = 28;
        myKey27.label = "\"" ;
        myKey27.showChakra = true ;
        myKey27.showCustomChakra = true ;
        myKey27.customChakraLayout = new String[] {"","","","\u201D","","","","","\u201C",""} ;
        myKey.set(27, myKey27);

        KeyAttr myKey28 = new KeyAttr();
        myKey28.code = 29;
        myKey28.label = "\u002C" ;
        myKey28.showChakra = false ;
        myKey.set(28, myKey28);

        KeyAttr myKey29 = new KeyAttr();
        myKey29.code = 30;
        myKey29.label = "\u002E" ;
        myKey29.showChakra = false ;
        myKey.set(29, myKey29);

        KeyAttr myKey30 = new KeyAttr();
        myKey30.code = 31;
        myKey30.label = "\u0BCD" ;
        myKey30.showChakra = false ;
        myKey.set(30, myKey30);

        KeyAttr myKey31 = new KeyAttr();
        myKey31.code = 32;
        myKey31.label = "\u0BCC" ;
        myKey31.showChakra = false ;
        myKey.set(31, myKey31);

        KeyAttr myKey32 = new KeyAttr();
        myKey32.code = 33;
        myKey32.label = "\u0028" ;
        myKey32.showChakra = false ;
        myKey.set(32, myKey32);

        KeyAttr myKey33 = new KeyAttr();
        myKey33.code = 34;
        myKey33.label = "\u0029" ;
        myKey33.showChakra = false ;
        myKey.set(33, myKey33);

        KeyAttr myKey34 = new KeyAttr();
        myKey34.code = 35;
        myKey34.label = "\u0BD0" ;
        myKey34.showChakra = false ;
        myKey.set(34, myKey34);

        KeyAttr myKey35 = new KeyAttr();
        myKey35.code = 36;
        myKey35.label = "\u0B83" ;
        myKey35.showChakra = false ;
        myKey.set(35, myKey35);

        KeyAttr myKey36 = new KeyAttr();
        myKey36.code = 37;
        myKey36.label = "\u0B94" ;
        myKey36.showChakra = false ;
        myKey.set(36, myKey36);

        KeyAttr myKey37 = new KeyAttr();
        myKey37.code = 38;
        myKey37.label = "\u0BB6\u0BCD\u0BB0\u0BC0" ;
        myKey37.showChakra = false ;
        myKey.set(37, myKey37);

        KeyAttr myKey38 = new KeyAttr();
        myKey38.code = 39;
        myKey38.label = "\u003B" ;
        myKey38.showChakra = false ;
        myKey.set(38, myKey38);

        KeyAttr myKey39 = new KeyAttr();
        myKey39.code = 40;
        myKey39.label = "backspace" ;
        myKey39.showChakra = false ;
        myKey.set(39, myKey39);

        KeyAttr myKey40 = new KeyAttr();
        myKey40.code = 41;
        myKey40.label = "shift" ;
        myKey40.showChakra = false ;
        myKey.set(40, myKey40);

        KeyAttr myKey41 = new KeyAttr();
        myKey41.code = 42;
        myKey41.label = "eng/tam" ;
        myKey41.showChakra = false ;
        myKey.set(41, myKey41);

        KeyAttr myKey42 = new KeyAttr();
        myKey42.code = 43;
        myKey42.label = "space" ;
        myKey42.showChakra = false ;
        myKey.set(42, myKey42);

        KeyAttr myKey43 = new KeyAttr();
        myKey43.code = 44;
        myKey43.label = "enter" ;
        myKey43.showChakra = false ;
        myKey.set(43, myKey43);

        KeyAttr myKey44 = new KeyAttr();
        myKey44.code = 45;
        myKey44.label = "\u0032" ;
        myKey44.showChakra = false ;
        myKey.set(44, myKey44);

        KeyAttr myKey45 = new KeyAttr();
        myKey45.code = 46;
        myKey45.label = "\u0033" ;
        myKey45.showChakra = false ;
        myKey.set(45, myKey45);

        KeyAttr myKey46 = new KeyAttr();
        myKey46.code = 47;
        myKey46.label = "\u0BE7" ;
        myKey46.showChakra = false ;
        myKey.set(46, myKey46);

        KeyAttr myKey47 = new KeyAttr();
        myKey47.code = 48;
        myKey47.label = "\u0BE8" ;
        myKey47.showChakra = false ;
        myKey.set(47, myKey47);

        KeyAttr myKey48 = new KeyAttr();
        myKey48.code = 49;
        myKey48.label = "\u0BE9" ;
        myKey48.showChakra = false ;
        myKey.set(48, myKey48);

        KeyAttr myKey49 = new KeyAttr();
        myKey49.code = 50;
        myKey49.label = "\u0035" ;
        myKey49.showChakra = false ;
        myKey.set(49, myKey49);

        KeyAttr myKey50 = new KeyAttr();
        myKey50.code = 51;
        myKey50.label = "\u0036" ;
        myKey50.showChakra = false ;
        myKey.set(50, myKey50);

        KeyAttr myKey51 = new KeyAttr();
        myKey51.code = 52;
        myKey51.label = "\u0BEA" ;
        myKey51.showChakra = false ;
        myKey.set(51, myKey51);

        KeyAttr myKey52 = new KeyAttr();
        myKey52.code = 53;
        myKey52.label = "\u0BEB" ;
        myKey52.showChakra = false ;
        myKey.set(52, myKey52);

        KeyAttr myKey53 = new KeyAttr();
        myKey53.code = 54;
        myKey53.label = "\u0BEC" ;
        myKey53.showChakra = false ;
        myKey.set(53, myKey53);

        KeyAttr myKey54 = new KeyAttr();
        myKey54.code = 55;
        myKey54.label = "\u0038" ;
        myKey54.showChakra = false ;
        myKey.set(54, myKey54);

        KeyAttr myKey55 = new KeyAttr();
        myKey55.code = 56;
        myKey55.label = "\u0039" ;
        myKey55.showChakra = false ;
        myKey.set(55, myKey55);

        KeyAttr myKey56 = new KeyAttr();
        myKey56.code = 57;
        myKey56.label = "\u0BED" ;
        myKey56.showChakra = false ;
        myKey.set(56, myKey56);

        KeyAttr myKey57 = new KeyAttr();
        myKey57.code = 58;
        myKey57.label = "\u0BEE" ;
        myKey57.showChakra = false ;
        myKey.set(57, myKey57);

        KeyAttr myKey58 = new KeyAttr();
        myKey58.code = 59;
        myKey58.label = "\u0BEF" ;
        myKey58.showChakra = false ;
        myKey.set(58, myKey58);

        KeyAttr myKey59 = new KeyAttr();
        myKey59.code = 60;
        myKey59.label = "\u0030" ;
        myKey59.showChakra = false ;
        myKey.set(59, myKey59);

        KeyAttr myKey60 = new KeyAttr();
        myKey60.code = 61;
        myKey60.label = "\u0023" ;
        myKey60.showChakra = false ;
        myKey.set(60, myKey60);

        KeyAttr myKey61 = new KeyAttr();
        myKey61.code = 62;
        myKey61.label = "\u0028" ;
        myKey61.showChakra = false ;
        myKey.set(61, myKey61);

        KeyAttr myKey62 = new KeyAttr();
        myKey62.code = 63;
        myKey62.label = "\u0BE6" ;
        myKey62.showChakra = false ;
        myKey.set(62, myKey62);

        KeyAttr myKey63 = new KeyAttr();
        myKey63.code = 64;
        myKey63.label = "\u00D7" ; //D7
        myKey63.showChakra = false ;
        myKey.set(63, myKey63);

        KeyAttr myKey64 = new KeyAttr();
        myKey64.code = 65;
        myKey64.label = "\u0040" ;
        myKey64.showChakra = false ;
        myKey.set(64, myKey64);

        KeyAttr myKey65 = new KeyAttr();
        myKey65.code = 66;
        myKey65.label = "\u0025" ;
        myKey65.showChakra = false ;
        myKey.set(65, myKey65);

        KeyAttr myKey66 = new KeyAttr();
        myKey66.code = 67;
        myKey66.label = "\u0029" ;
        myKey66.showChakra = false ;
        myKey.set(66, myKey66);

        KeyAttr myKey67 = new KeyAttr();
        myKey67.code = 68;
        myKey67.label = "\u003A" ;
        myKey67.showChakra = false ;
        myKey.set(67, myKey67);

        KeyAttr myKey68 = new KeyAttr();
        myKey68.code = 69;
        myKey68.label = "\u002F" ;
        myKey68.showChakra = false ;
        myKey.set(68, myKey68);

        KeyAttr myKey69 = new KeyAttr();
        myKey69.code = 70;
        myKey69.label = "\u20B9" ;
        myKey69.showChakra = true ;
        myKey69.showCustomChakra = true ;
        myKey69.customChakraLayout = new String[] {"\u0024","\u00A3","\u20AC","\u0BF9","\u20A3","\u20a8","\u00A5","\u00A2","",""} ;
        myKey.set(69, myKey69);

        KeyAttr myKey70 = new KeyAttr();
        myKey70.code = 71;
        myKey70.label = "\u007E" ;
        myKey70.showChakra = true ;
        myKey70.showCustomChakra = true ;
        myKey70.customChakraLayout = new String[] {"\u007E","\u3003","\u005E","\u003C","\u003E","\u0060","\\","{","}",""} ;
        myKey.set(70, myKey70);

        KeyAttr myKey71 = new KeyAttr();
        myKey71.code = 72;
        myKey71.label = "\u0026" ;
        myKey71.showChakra = true ;
        myKey71.showCustomChakra = true ;
        myKey71.customChakraLayout = new String[] {"\u2022","\u00B0","\u00B6","\u00A7","\u2120","\u2122","\u00AE","\u00A9","",""} ;
        myKey.set(71, myKey71);

        KeyAttr myKey72 = new KeyAttr();
        myKey72.code = 73;
        myKey72.label = "\u002C" ;
        myKey72.showChakra = false ;
        myKey.set(72, myKey72);

        KeyAttr myKey73 = new KeyAttr();
        myKey73.code = 74;
        myKey73.label = "\u002E" ;
        myKey73.showChakra = false ;
        myKey.set(73, myKey73);

        KeyAttr myKey74 = new KeyAttr();
        myKey74.code = 75;
        myKey74.label = "\u0031" ;
        myKey74.showChakra = false ;
        myKey.set(74, myKey74);

        KeyAttr myKey75 = new KeyAttr();
        myKey75.code = 76;
        myKey75.label = "\u0034" ;
        myKey75.showChakra = false ;
        myKey.set(75, myKey75);

        KeyAttr myKey76 = new KeyAttr();
        myKey76.code = 77;
        myKey76.label = "\u0037" ;
        myKey76.showChakra = false ;
        myKey.set(76, myKey76);

        KeyAttr myKey77 = new KeyAttr();
        myKey77.code = 78;
        myKey77.label = "\u002a" ;
        myKey77.showChakra = false ;
        myKey.set(77, myKey77);

        KeyAttr myKey78 = new KeyAttr();
        myKey78.code = 79;
        myKey78.label = "\u002d" ;
        myKey78.showChakra = false ;
        myKey.set(78, myKey78);

        KeyAttr myKey79 = new KeyAttr();
        myKey79.code = 80;
        myKey79.label = "\u002B" ;
        myKey79.showChakra = false ;
        myKey.set(79, myKey79);

        KeyAttr myKey80 = new KeyAttr();
        myKey80.code = 81;
        myKey80.label = "\u2212" ;
        myKey80.showChakra = false ;
        myKey.set(80, myKey80);

        KeyAttr myKey81 = new KeyAttr();
        myKey81.code = 82;
        myKey81.label = "\u003D" ;
        myKey81.showChakra = false ;
        myKey.set(81, myKey81);

        KeyAttr myKey82 = new KeyAttr();
        myKey82.code = 83;
        myKey82.label = "\u003B" ;
        myKey82.showChakra = false ;
        myKey.set(82, myKey82);

        KeyAttr myKey83 = new KeyAttr();
        myKey83.code = 84;
        myKey83.label = "backspace" ;
        myKey83.showChakra = false ;
        myKey.set(83, myKey83);

        KeyAttr myKey84 = new KeyAttr();
        myKey84.code = 85;
        myKey84.label = "shift" ;
        myKey84.showChakra = false ;
        myKey.set(84, myKey84);

        KeyAttr myKey85 = new KeyAttr();
        myKey85.code = 86;
        myKey85.label = "eng" ;
        myKey85.showChakra = false ;
        myKey.set(85, myKey85);

        KeyAttr myKey86 = new KeyAttr();
        myKey86.code = 87;
        myKey86.label = "space" ;
        myKey86.showChakra = false ;
        myKey.set(86, myKey86);

        KeyAttr myKey87 = new KeyAttr();
        myKey87.code = 88;
        myKey87.label = "enter" ;
        myKey87.showChakra = false ;
        myKey.set(87, myKey87);




    }

    @Override @SuppressLint("UseSparseArrays")
    public HashMap<Integer, KeyAttr> hashThis() {
        HashMap<Integer, KeyAttr> hashed = new HashMap<Integer, KeyAttr>();
        for (int i=0; i<nKeys; i++) {
            KeyAttr key = myKey.get(i);
            hashed.put(key.code, key);
        }
        return hashed;
    }
}