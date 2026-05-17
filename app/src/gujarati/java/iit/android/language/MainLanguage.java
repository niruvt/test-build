package iit.android.language;

import iit.android.language.Language;
import iit.android.swarachakra.KeyAttr;

import java.util.ArrayList;
import java.util.HashMap;

import android.annotation.SuppressLint;
import android.util.Log;

public class MainLanguage extends Language{

	public MainLanguage() {
		name = "gujarati";
		symbol = "\u0A97\u0AC1";
		nKeys = 136;
		myKey = new ArrayList<KeyAttr>(nKeys);
		defaultChakra = new String[] { "\u0ACD", "\u0ABE", "\u0ABF", "\u0AC0","\u0AC1", "\u0AC2", "\u0AC7", "\u0AC8", "\u0ACB", "\u0ACC" };
		halantExists =  true;
		halantEnd = 35;
		KeyAttr myKey0 = new KeyAttr();
		myKey0.code = 1;
		myKey0.label = "\u0A95"; //ka
		myKey0.showChakra = true ;
		myKey.add(myKey0);

		KeyAttr myKey1 = new KeyAttr();
		myKey1.code = 2;
		myKey1.label = "\u0A96"; //kha
		myKey1.showChakra = true ;
		myKey.add(myKey1);

		KeyAttr myKey2 = new KeyAttr();
		myKey2.code = 3;
		myKey2.label = "\u0A97" ;//ga
		myKey2.showChakra = true ;
		myKey.add(myKey2);

		KeyAttr myKey3 = new KeyAttr();
		myKey3.code = 4;
		myKey3.label = "\u0A98" ;//gha
		myKey3.showChakra = true ;
		myKey.add(myKey3);

		KeyAttr myKey4 = new KeyAttr();
		myKey4.code = 5;
		myKey4.label = "\u0A99" ;//gna
		myKey4.showChakra = true ;
		myKey.add(myKey4);

		KeyAttr myKey5 = new KeyAttr();
		myKey5.code = 6;
		myKey5.label = "\u0A9A" ;//cha
		myKey5.showChakra = true ;
		myKey.add(myKey5);

		KeyAttr myKey6 = new KeyAttr();
		myKey6.code = 7;
		myKey6.label = "\u0A9B" ;//chha
		myKey6.showChakra = true ;
		myKey.add(myKey6);

		KeyAttr myKey7 = new KeyAttr();
		myKey7.code = 8;
		myKey7.label = "\u0A9C" ;//ja
		myKey7.showChakra = true ;
		myKey.add(myKey7);

		KeyAttr myKey8 = new KeyAttr();
		myKey8.code = 9;
		myKey8.label = "\u0A9D" ;//jha
		myKey8.showChakra = true ;
		myKey.add(myKey8);

		KeyAttr myKey9 = new KeyAttr();
		myKey9.code = 10;
		myKey9.label = "\u0A9E" ;//jna
		myKey9.showChakra = true ;
		myKey.add(myKey9);

		KeyAttr myKey10 = new KeyAttr();
		myKey10.code = 11;
		myKey10.label = "\u0A9F" ;//tta
		myKey10.showChakra = true ;
		myKey.add(myKey10);

		KeyAttr myKey11 = new KeyAttr();
		myKey11.code = 12;
		myKey11.label = "\u0AA0" ;//ttha
		myKey11.showChakra = true ;
		myKey.add(myKey11);

		KeyAttr myKey12 = new KeyAttr();
		myKey12.code = 13;
		myKey12.label = "\u0AA1" ;//dda
		myKey12.showChakra = true ;
		myKey.add(myKey12);

		KeyAttr myKey13 = new KeyAttr();
		myKey13.code = 14;
		myKey13.label = "\u0AA2" ;//ddha
		myKey13.showChakra = true ;
		myKey.add(myKey13);

		KeyAttr myKey14 = new KeyAttr();
		myKey14.code = 15;
		myKey14.label = "\u0AA3" ;//nna
		myKey14.showChakra = true ;
		myKey.add(myKey14);

		KeyAttr myKey15 = new KeyAttr();
		myKey15.code = 16;
		myKey15.label = "\u0AA4" ;//ta
		myKey15.showChakra = true ;
		myKey.add(myKey15);

		KeyAttr myKey16 = new KeyAttr();
		myKey16.code = 17;
		myKey16.label = "\u0AA5" ;//tha
		myKey16.showChakra = true ;
		myKey.add(myKey16);

		KeyAttr myKey17 = new KeyAttr();
		myKey17.code = 18;
		myKey17.label = "\u0AA6" ;//da
		myKey17.showChakra = true ;
		myKey.add(myKey17);

		KeyAttr myKey18 = new KeyAttr();
		myKey18.code = 19;
		myKey18.label = "\u0AA7" ;//dha
		myKey18.showChakra = true ;
		myKey.add(myKey18);

		KeyAttr myKey19 = new KeyAttr();
		myKey19.code = 20;
		myKey19.label = "\u0AA8" ;//na
		myKey19.showChakra = true ;
		myKey.add(myKey19);

		KeyAttr myKey20 = new KeyAttr();
		myKey20.code = 21;
		myKey20.label = "\u0AAA" ;//pa
		myKey20.showChakra = true ;
		myKey.add(myKey20);

		KeyAttr myKey21 = new KeyAttr();
		myKey21.code = 22;
		myKey21.label = "\u0AAB" ;//pha
		myKey21.showChakra = true ;
		myKey.add(myKey21);

		KeyAttr myKey22 = new KeyAttr();
		myKey22.code = 23;
		myKey22.label = "\u0AAC" ;//ba
		myKey22.showChakra = true ;
		myKey.add(myKey22);

		KeyAttr myKey23 = new KeyAttr();
		myKey23.code = 24;
		myKey23.label = "\u0AAD" ;//bha
		myKey23.showChakra = true ;
		myKey.add(myKey23);

		KeyAttr myKey24 = new KeyAttr();
		myKey24.code = 25;
		myKey24.label = "\u0AAE" ;//ma
		myKey24.showChakra = true ;
		myKey.add(myKey24);

		KeyAttr myKey25 = new KeyAttr();
		myKey25.code = 26;
		myKey25.label = "\u0AAF" ;//ya
		myKey25.showChakra = true ;
		myKey.add(myKey25);

		KeyAttr myKey26 = new KeyAttr();
		myKey26.code = 27;
		myKey26.label = "\u0AB0" ;//ra
		myKey26.showChakra = true ;
		myKey.add(myKey26);

		KeyAttr myKey27 = new KeyAttr();
		myKey27.code = 28;
		myKey27.label = "\u0AB2" ;//la
		myKey27.showChakra = true ;
		myKey.add(myKey27);

		KeyAttr myKey28 = new KeyAttr();
		myKey28.code = 29;
		myKey28.label = "\u0AB3" ;//va
		myKey28.showChakra = true ;
		myKey.add(myKey28);

		KeyAttr myKey29 = new KeyAttr();
		myKey29.code = 30;
		myKey29.label = "\u0AB5" ;//sha
		myKey29.showChakra = true ;
		myKey.add(myKey29);

		KeyAttr myKey30 = new KeyAttr();
		myKey30.code = 31;
		myKey30.label = "\u0AB6" ;//ssha
		myKey30.showChakra = true ;
		myKey.add(myKey30);

		KeyAttr myKey31 = new KeyAttr();
		myKey31.code = 32;
		myKey31.label = "\u0AB7" ;//sa
		myKey31.showChakra = true ;
		myKey.add(myKey31);

		KeyAttr myKey32 = new KeyAttr();
		myKey32.code = 33;
		myKey32.label = "\u0AB8" ;//ha
		myKey32.showChakra = true ;
		myKey.add(myKey32);

		KeyAttr myKey33 = new KeyAttr();
		myKey33.code = 34;
		myKey33.label = "\u0AB9" ;//lla
		myKey33.showChakra = true ;
		myKey.add(myKey33);

		KeyAttr myKey34 = new KeyAttr();
		myKey34.code = 35;
		myKey34.label = "\u0A95\u0ACD\u0AB7" ;//ksha
		myKey34.showChakra = true ;
		myKey.add(myKey34);

		KeyAttr myKey35 = new KeyAttr();
		myKey35.code = 36;
		myKey35.label = "\u0A9C\u0ACD\u0A9E" ;//jna
		myKey35.showChakra = true ;
		myKey.add(myKey35);

		KeyAttr myKey36 = new KeyAttr();
		myKey36.code = 37;
		myKey36.label = "\u0AB6\u0ACD\u0AB0" ;//shra
		myKey36.showChakra = true ;
		myKey.add(myKey36);

		KeyAttr myKey37 = new KeyAttr();
		myKey37.code = 38;
		myKey37.label = "\u0ABE";
		myKey37.showChakra = true ;
		myKey37.showCustomChakra = true;
		myKey37.customChakraLayout = new String[] { "\u0ACD", "\u0ABE", "\u0ABF",
				"\u0AC0", "\u0AC1", "\u0AC2", "\u0AC7", "\u0AC8", "\u0ACB",
				"\u0ACC" };
		myKey.add(myKey37);

		KeyAttr myKey38 = new KeyAttr();
		myKey38.code = 39;
		myKey38.label = "\u0AD0"; // Additional vowels for Sanskrit, additional consonants and various sign.
		myKey38.showChakra = true ;
		myKey38.showCustomChakra = true;
		myKey38.customChakraLayout = new String[] { "\u0AD0","", "\u0A8C",
				"\u0AE1", "", "", "", "\u0AE3", "\u0AE2","" };
		myKey.add(myKey38);

		KeyAttr myKey39 = new KeyAttr();
		myKey39.code = 40;
		myKey39.label = "" ;//ru
		myKey39.showChakra = false ;
		myKey.add(myKey39);

		KeyAttr myKey40 = new KeyAttr();
		myKey40.code = 41;
		myKey40.label = "\u002E" ;//Marathi fullstop
		myKey40.showChakra = false ;
		myKey.add(myKey40);

		KeyAttr myKey41 = new KeyAttr();
		myKey41.code = 42;
		myKey41.label = "\u002C" ;//comma
		myKey41.showChakra = false ;
		myKey.add(myKey41);

		KeyAttr myKey42 = new KeyAttr();
		myKey42.code = 43;
		myKey42.label = "\u0021" ;//exclamation mark
		myKey42.showChakra = false ;
		myKey.add(myKey42);

		KeyAttr myKey43 = new KeyAttr();
		myKey43.code = 44;
		myKey43.label = "\u003F" ;//question mark
		myKey43.showChakra = false ;
		myKey.add(myKey43);

        //TODO:repeated letter
		KeyAttr myKey44 = new KeyAttr();
		myKey44.code = 45;
		myKey44.label = "\u002D" ;//Hindi fullstop
		myKey44.showChakra = false ;
		myKey.add(myKey44);

		KeyAttr myKey45 = new KeyAttr();
		myKey45.code = 46;
		myKey45.label = "\"" ;//Double quote
		myKey45.showChakra = true ;
		myKey45.showCustomChakra = true ;
		myKey45.customChakraLayout = new String[] {"\u201C","","","","","\u201D","","","",""} ;
		myKey.add(myKey45);

		KeyAttr myKey46 = new KeyAttr();
		myKey46.code = 47;
		myKey46.label = "\u0027" ;//single quote
		myKey46.showChakra = true ;
		myKey46.showCustomChakra = true ;
		myKey46.customChakraLayout = new String[] {"\u2018","","","","","\u2019","","","",""} ;
		myKey.add(myKey46);

		KeyAttr myKey47 = new KeyAttr();
		myKey47.code = 48;
		myKey47.label = "\u0A82" ;//anuswar
		myKey47.showChakra = false ;
		myKey.add(myKey47);

		KeyAttr myKey48 = new KeyAttr();
		myKey48.code = 49;
		myKey48.label = "\u0AC5" ;//a ki matra as in captain
		myKey48.showChakra = false ;
		myKey.add(myKey48);

		KeyAttr myKey49 = new KeyAttr();
		myKey49.code = 50;
		myKey49.label = "\u0A83" ;//visarga
		myKey49.showChakra = false ;
		myKey.add(myKey49);

		KeyAttr myKey50 = new KeyAttr();
		myKey50.code = 51;
		myKey50.label = "" ;//varyacha ra
		myKey50.showChakra = false ;
		myKey.add(myKey50);

		KeyAttr myKey51 = new KeyAttr();
		myKey51.code = 52;
		myKey51.label = "\u0AA4\u0ACD\u0AB0";//rashtra chinha
		myKey51.showChakra = false ;
		myKey51.isException = true;
		myKey.add(myKey51);

		KeyAttr myKey52 = new KeyAttr();
		myKey52.code = 53;
		myKey52.label = "\u0AB0\u0ACD\u0A97";//rafar
		myKey52.showChakra = false ;
		myKey52.isException = true;
		myKey.add(myKey52);

		KeyAttr myKey53 = new KeyAttr();
		myKey53.code = 54;
		myKey53.label = "." ;//don't know, not used in Marathi
		myKey53.showChakra = false ;
		myKey.add(myKey53);

		KeyAttr myKey54 = new KeyAttr();
		myKey54.code = 55;
		myKey54.label = "\u0AF0" ;//abbreviation sign
		myKey54.showChakra = false ;
		myKey.add(myKey54);

		KeyAttr myKey55 = new KeyAttr();
		myKey55.code = 56;
		myKey55.label = "\u0AE7" ;//Gujarati digit one
		myKey55.showChakra = false ;
		myKey.add(myKey55);

		KeyAttr myKey56 = new KeyAttr();
		myKey56.code = 57;
		myKey56.label = "\u0AE8" ;//Gujarati digit two
		myKey56.showChakra = false ;
		myKey.add(myKey56);

		KeyAttr myKey57 = new KeyAttr();
		myKey57.code = 58;
		myKey57.label = "\u0AE9" ;//Gujarati digit three
		myKey57.showChakra = false ;
		myKey.add(myKey57);

		KeyAttr myKey58 = new KeyAttr();
		myKey58.code = 59;
		myKey58.label = "\u002B" ;//not sure what
		myKey58.showChakra = false ;
		myKey.add(myKey58);

		KeyAttr myKey59 = new KeyAttr();
		myKey59.code = 60;
		myKey59.label = "," ;//not sure, perhaps English comma 
		myKey59.showChakra = false ;
		myKey.add(myKey59);

		KeyAttr myKey60 = new KeyAttr();
		myKey60.code = 61;
		myKey60.label = "\u0AE5" ;//Gujarati double danda
		myKey60.showChakra = false ;
		myKey.add(myKey60);

		KeyAttr myKey61 = new KeyAttr();
		myKey61.code = 62;
		myKey61.label = "\u0AEA" ;//Gujarati digit four
		myKey61.showChakra = false ;
		myKey.add(myKey61);

		KeyAttr myKey62 = new KeyAttr();
		myKey62.code = 63;
		myKey62.label = "\u0AEB" ;//Gujarati digit five
		myKey62.showChakra = false ;
		myKey.add(myKey62);

		KeyAttr myKey63 = new KeyAttr();
		myKey63.code = 64;
		myKey63.label = "\u0AEC" ;//Gujarati digit six
		myKey63.showChakra = false ;
		myKey.add(myKey63);

		KeyAttr myKey64 = new KeyAttr();
		myKey64.code = 65;
		myKey64.label = "\u002D" ;//hyphen
		myKey64.showChakra = false ;
		myKey.add(myKey64);

		KeyAttr myKey65 = new KeyAttr();
		myKey65.code = 66;
		myKey65.label = ";" ;//semicolon 
		myKey65.showChakra = false ;
		myKey.add(myKey65);

		KeyAttr myKey66 = new KeyAttr();
		myKey66.code = 67;
		myKey66.label = "_" ;//underscore
		myKey66.showChakra = false ;
		myKey.add(myKey66);

		KeyAttr myKey67 = new KeyAttr();
		myKey67.code = 68;
		myKey67.label = "\u0AED" ;//Gujarati digit seven
		myKey67.showChakra = false ;
		myKey.add(myKey67);

		KeyAttr myKey68 = new KeyAttr();
		myKey68.code = 69;
		myKey68.label = "\u0AEE" ;//Gujarati digit eight
		myKey68.showChakra = false ;
		myKey.add(myKey68);

		KeyAttr myKey69 = new KeyAttr();
		myKey69.code = 70;
		myKey69.label = "\u0AEF" ;//Gujarati digit nine
		myKey69.showChakra = false ;
		myKey.add(myKey69);

		KeyAttr myKey70 = new KeyAttr();
		myKey70.code = 71;
		myKey70.label = "x" ;//not sure, perhaps multiplication 
		myKey70.showChakra = false ;
		myKey.add(myKey70);

		KeyAttr myKey71 = new KeyAttr();
		myKey71.code = 72;
		myKey71.label = "=" ;//equal to
		myKey71.showChakra = false ;
		myKey.add(myKey71);

		KeyAttr myKey72 = new KeyAttr();
		myKey72.code = 73;
		myKey72.label = ":" ;//colon 
		myKey72.showChakra = false ;
		myKey.add(myKey72);

		KeyAttr myKey73 = new KeyAttr();
		myKey73.code = 74;
		myKey73.label = "\u2014" ;//not sure 
		myKey73.showChakra = false ;
		myKey.add(myKey73);

		KeyAttr myKey74 = new KeyAttr();
		myKey74.code = 75;
		myKey74.label = "*" ;//asterisk
		myKey74.showChakra = false ;
		myKey.add(myKey74);

		KeyAttr myKey75 = new KeyAttr();
		myKey75.code = 76;
		myKey75.label = "\u0AE6" ;//Gujarati digit zero
		myKey75.showChakra = false ;
		myKey.add(myKey75);

		KeyAttr myKey76 = new KeyAttr();
		myKey76.code = 77;
		myKey76.label = "#" ;//hash
		myKey76.showChakra = false ;
		myKey.add(myKey76);

		KeyAttr myKey77 = new KeyAttr();
		myKey77.code = 78;
		myKey77.label = "\u00F7" ;//not sure
		myKey77.showChakra = false ;
		myKey.add(myKey77);

		KeyAttr myKey78 = new KeyAttr();
		myKey78.code = 79;
		myKey78.label = "|" ;//not sure, perhaps pipe char
		myKey78.showChakra = false ;
		myKey.add(myKey78);

		KeyAttr myKey79 = new KeyAttr();
		myKey79.code = 80;
		myKey79.label = "\u20B9" ;//not sure
		myKey79.showChakra = false ;
		myKey.add(myKey79);

		KeyAttr myKey80 = new KeyAttr();
		myKey80.code = 81;
		myKey80.label = "$" ;//dollar sign
		myKey80.showChakra = true ;
		myKey80.showCustomChakra = true ;
		myKey80.customChakraLayout = new String[] { "\u09F3","\u0BF9","\u20AC","\u20A4","\u00A2" ,"\u00A3","\u00A5", "\u20B0","\uFDFC","\u20BD","\u0E3F"} ;//various currencies
		myKey.add(myKey80);

		KeyAttr myKey81 = new KeyAttr();
		myKey81.code = 82;
		myKey81.label = "%" ;//percent sign
		myKey81.showChakra = false ;
		myKey.add(myKey81);

		KeyAttr myKey82 = new KeyAttr();
		myKey82.code = 83;
		myKey82.label = "\u2122" ;//not sure
		myKey82.showChakra = false ;
		myKey.add(myKey82);

		KeyAttr myKey83 = new KeyAttr();
		myKey83.code = 84;
		myKey83.label = "\u00A9" ;//not sure
		myKey83.showChakra = false ;
		myKey.add(myKey83);

		KeyAttr myKey84 = new KeyAttr();
		myKey84.code = 85;
		myKey84.label = "/" ;//forward slash
		myKey84.showChakra = false ;
		myKey.add(myKey84);

		KeyAttr myKey85 = new KeyAttr();
		myKey85.code = 86;
		myKey85.label = "\\" ;//backslash
		myKey85.showChakra = false ;
		myKey.add(myKey85);

		KeyAttr myKey86 = new KeyAttr();
		myKey86.code = 87;
		myKey86.label = "@" ;//at the rate sign
		myKey86.showChakra = false ;
		myKey.add(myKey86);

		KeyAttr myKey87 = new KeyAttr();
		myKey87.code = 88;
		myKey87.label = "&" ;//ampersand
		myKey87.showChakra = false ;
		myKey.add(myKey87);

		KeyAttr myKey88 = new KeyAttr();
		myKey88.code = 89;
		myKey88.label = "\u0AD0" ; //om
		myKey88.showChakra = false ;
		myKey.add(myKey88);

		KeyAttr myKey89 = new KeyAttr();
		myKey89.code = 90;
		myKey89.label = "\u00AE" ;//registered sign
		myKey89.showChakra = false ;
		myKey.add(myKey89);

		KeyAttr myKey90 = new KeyAttr();
		myKey90.code = 91;
		myKey90.label = "~" ;//tilda
		myKey90.showChakra = false ;
		myKey.add(myKey90);

		KeyAttr myKey91 = new KeyAttr();
		myKey91.code = 92;
		myKey91.label = "<" ;//less than sign
		myKey91.showChakra = false ;
		myKey.add(myKey91);

		KeyAttr myKey92 = new KeyAttr();
		myKey92.code = 93;
		myKey92.label = ">" ;//greater than sign
		myKey92.showChakra = false ;
		myKey.add(myKey92);

		KeyAttr myKey93 = new KeyAttr();
		myKey93.code = 94;
		myKey93.label = "^" ;//caret sign
		myKey93.showChakra = false ;
		myKey.add(myKey93);

		//TODO: is this needed, we already have Gujarati Om in the main layout.
		KeyAttr myKey94 = new KeyAttr();
		myKey94.code = 95;
		myKey94.label = "\u0950" ;//om sign
		myKey94.showChakra = false ;
		myKey.add(myKey94);

		KeyAttr myKey95 = new KeyAttr();
		myKey95.code = 96;
		myKey95.label = "" ;//not sure
		myKey95.showChakra = false ;
		myKey.add(myKey95);

		KeyAttr myKey96 = new KeyAttr();
		myKey96.code = 97;
		myKey96.label = "" ;//not sure
		myKey96.showChakra = false ;
		myKey.add(myKey96);

		KeyAttr myKey97 = new KeyAttr();
		myKey97.code = 98;
		myKey97.label = "" ;//not sure
		myKey97.showChakra = false ;
		myKey.add(myKey97);

		KeyAttr myKey98 = new KeyAttr();
		myKey98.code = 99;
		myKey98.label = "(" ;//open bracket
		myKey98.showChakra = false ;
		myKey.add(myKey98);

		KeyAttr myKey99 = new KeyAttr();
		myKey99.code = 100;
		myKey99.label = ")" ;//close bracket
		myKey99.showChakra = false ;
		myKey.add(myKey99);

		KeyAttr myKey100 = new KeyAttr();
		myKey100.code = 101;
		myKey100.label = "" ;//not sure
		myKey100.showChakra = false ;
		myKey.add(myKey100);

		KeyAttr myKey101 = new KeyAttr();
		myKey101.code = 102;
		myKey101.label = "" ;//not sure
		myKey101.showChakra = false ;
		myKey.add(myKey101);

		KeyAttr myKey102 = new KeyAttr();
		myKey102.code = 103;
		myKey102.label = "" ;//not sure
		myKey102.showChakra = false ;
		myKey.add(myKey102);

		KeyAttr myKey103 = new KeyAttr();
		myKey103.code = 104;
		myKey103.label = "" ;//not sure
		myKey103.showChakra = false ;
		myKey.add(myKey103);

		KeyAttr myKey104 = new KeyAttr();
		myKey104.code = 105;
		myKey104.label = "{" ;//open curly bracket
		myKey104.showChakra = false ;
		myKey.add(myKey104);

		KeyAttr myKey105 = new KeyAttr();
		myKey105.code = 106;
		myKey105.label = "}" ;//close curly bracket
		myKey105.showChakra = false ;
		myKey.add(myKey105);

		KeyAttr myKey106 = new KeyAttr();
		myKey106 .code = 107;
		myKey106 .label = "\u0ABE" ;//kana matra velanti chakra
		myKey106 .showChakra = true ;
		myKey106 .showCustomChakra = true ;
		myKey106 .customChakraLayout = new String[] {"\u0ACD", "\u0ABE", "\u0ABF", "\u0AC0", "\u0AC1", "\u0AC2", "\u0AC7", "\u0AC8", "\u0ACB", "\u0ACC"} ;
		myKey.add(myKey106);

		KeyAttr myKey107  = new KeyAttr();
		myKey107.code = 108;
		myKey107.label = "\u0AC3" ;//ru chakra
		myKey107.showChakra = true ;
		myKey107.showCustomChakra = true ;
		//myKey107.customChakraLayout = new String[] {"\u200C","\u0ABd","\u0946", "\u094a","\u090b","\u0944", "\u0AE0","\u0972","\u0A91","\u200D"} ;
		//myKey107.customChakraLayout = new String[] {"zwj","\u090b","\u0944", "\u0AE0","\u0972","\u0A91","\u0ABd","\u0946", "\u094a","nzwj"} ;
		myKey107.customChakraLayout = new String[] {"\u200C","\u0A8B","\u0AE0","\u0A8D","\u0A91","\u0AC9","\u0AC5","\u0AC4", "\u0AC3","\u200D"} ;
		myKey.add(myKey107);

		KeyAttr myKey108 = new KeyAttr();
		myKey108.code = 109;
		myKey108.label = "\u0A85" ;//stand alone vowel chakra
		myKey108.showChakra = true ;
		myKey108.showCustomChakra = true ;
		myKey108.customChakraLayout = new String[] {"\u0A85", "\u0A86", "\u0A87", "\u0A88", "\u0A89", "\u0A8A", "\u0A8F", "\u0A90", "\u0A93", "\u0A94"} ;
		myKey.add(myKey108);



		KeyAttr myKey109 = new KeyAttr();
		myKey109.code = 110;
		myKey109.label = "1" ;//numeral 1
		myKey109.showChakra = false ;
		myKey.add(myKey109);


		KeyAttr myKey110 = new KeyAttr();
		myKey110 .code = 111;
		myKey110 .label = "2" ;//numeral 2
		myKey110 .showChakra = false ;
		myKey.add(myKey110);

		KeyAttr myKey111 = new KeyAttr();
		myKey111 .code = 112;
		myKey111 .label = "3" ;//numeral 3
		myKey111 .showChakra = false ;
		myKey.add(myKey111);

		KeyAttr myKey112 = new KeyAttr();
		myKey112 .code = 113;
		myKey112 .label = "4" ;//numeral 4
		myKey112 .showChakra = false ;
		myKey.add(myKey112);

		KeyAttr myKey113 = new KeyAttr();
		myKey113 .code = 114;
		myKey113 .label = "5" ;//numeral 5
		myKey113 .showChakra = false ;
		myKey.add(myKey113);


		KeyAttr myKey114 = new KeyAttr();
		myKey114 .code = 115;
		myKey114 .label = "6" ;//numeral 6
		myKey114 .showChakra = false ;
		myKey.add(myKey114);

		KeyAttr myKey115 = new KeyAttr();
		myKey115 .code = 116;
		myKey115 .label = "7" ;//numeral 7
		myKey115 .showChakra = false ;
		myKey.add(myKey115);

		KeyAttr myKey116 = new KeyAttr();
		myKey116 .code = 117;
		myKey116 .label = "8" ;//numeral 8
		myKey116 .showChakra = false ;
		myKey.add(myKey116);

		KeyAttr myKey117 = new KeyAttr();
		myKey117 .code = 118;
		myKey117 .label = "9" ;//numeral 9
		myKey117 .showChakra = false ;
		myKey.add(myKey117);

		KeyAttr myKey118 = new KeyAttr();
		myKey118 .code = 119;
		myKey118 .label = "0" ;//numeral 0
		myKey118 .showChakra = false ;
		myKey.add(myKey118);


		KeyAttr myKey119 = new KeyAttr();
		myKey119 .code = 120;
		myKey119 .label = "\u0A81" ;//chandrabindu
		myKey119 .showChakra = false ;
		myKey.add(myKey119);

		KeyAttr myKey120 = new KeyAttr();
		myKey120 .code = 121;
		myKey120 .label = "\u0ABC";//nukta
		myKey120 .showChakra = false ;
		myKey120.showIcon = true ;
		myKey120 .icon = "nukta";
		myKey120 .isException = true;
		myKey.add(myKey120);

		KeyAttr myKey121 = new KeyAttr();
		myKey121 .code = 122;
		myKey121 .label = "\u0AC9" ;//o ki matra as in doctor
		myKey121 .showChakra = false ;
		myKey.add(myKey121);

		KeyAttr myKey122 = new KeyAttr();
		myKey122.code = 123;
		myKey122.label = "\u0A8D" ;//a as in apple
		myKey122.showChakra = false ;
		myKey122.showIcon = true ;
		myKey122.icon = "ae";
		myKey.add(myKey122);

		KeyAttr myKey123 = new KeyAttr();
		myKey123.code = 124;
		myKey123.label = "\u0A91" ;//o as in orange
		myKey123.showChakra = false ;
		myKey.add(myKey123);

		KeyAttr myKey124 = new KeyAttr();
		myKey124  .code = 125;
		myKey124  .label = "[" ;//open square bracket
		myKey124  .showChakra = false ;
		myKey.add(myKey124);

		KeyAttr myKey125 = new KeyAttr();
		myKey125 .code = 126;
		myKey125 .label = "]" ;//close square bracket
		myKey125 .showChakra = false ;
		myKey.add(myKey125);


		KeyAttr myKey126 = new KeyAttr();
		myKey126 .code = 127;
		myKey126 .label = "`" ;//prime
		myKey126 .showChakra = false ;
		myKey.add(myKey126);



		KeyAttr myKey127 = new KeyAttr();
		myKey127 .code = 128;
		myKey127 .label = "\u00AC" ;//'not' sign
		myKey127 .showChakra = false ;
		myKey.add(myKey127);

		KeyAttr myKey128 = new KeyAttr();
		myKey128 .code = 129;
//		myKey128 .label = "\u221A" ;//sq. root
		myKey128 .label = "\u0AF1" ;//Gujarati rupee symbol
		myKey128 .showChakra = false ;
		myKey.add(myKey128);

		KeyAttr myKey129 = new KeyAttr();
		myKey129 .code = 130;
		myKey129 .label = "\u0AF0" ;//Gujarati abbreviation sign
		myKey129 .showChakra = false ;
		myKey.add(myKey129);

		KeyAttr myKey130 = new KeyAttr();
		myKey130 .code = 131;
		myKey130 .label = "\u0AEA" ;//Gujarati digit four repeated from key 62
		myKey130 .showChakra = false ;
		myKey.add(myKey130);

		KeyAttr myKey131 = new KeyAttr();
		myKey131 .code = 132;
		myKey131 .label = "¶" ;//not sure
		myKey131 .showChakra = false ;
		myKey.add(myKey131);

		KeyAttr myKey132 = new KeyAttr();
		myKey132 .code = 133;
		myKey132 .label = "\u0AF1" ;//Gujarati Rupee symbol
		myKey132 .showChakra = false ;
		myKey.add(myKey132);

		KeyAttr myKey133 = new KeyAttr();
		myKey133 .code = 134;
		myKey133 .label = "\u03C0" ;//not sure
		myKey133 .showChakra = false ;
		myKey.add(myKey133);

		KeyAttr myKey134 = new KeyAttr();
		myKey134 .code = 135;
		myKey134 .label = "\u00A6" ;//not sure
		myKey134 .showChakra = false ;
		myKey.add(myKey134);

		KeyAttr myKey135  = new KeyAttr();
		myKey135.code = 136;
		myKey135.label = "\u0AC3" ;
		myKey135.showChakra = true ;
		myKey135.showCustomChakra = true ;
		myKey135.customChakraLayout = new String[] {"\u200C","\u0A8B","\u0AE0","\u0A8D", "\u0A91","\u200D","\u0AC9","\u0AC5","\u0AC4", "\u0AC3"} ;
		myKey.add(myKey135);

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
