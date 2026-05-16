package iit.android.language;

import iit.android.language.Language;
import iit.android.swarachakra.KeyAttr;

import java.util.ArrayList;
import java.util.HashMap;

import android.annotation.SuppressLint;
import android.util.Log;

public class MainLanguage extends Language {

	public MainLanguage() {
		name = "bengali";
		symbol = "\u09AC\u09BE";
		nKeys = 106;
		myKey = new ArrayList<KeyAttr>(nKeys);
		defaultChakra = new String[] { "\u09CD", "\u09BE", "\u09BF", "\u09C0","\u09C1", "\u09C2", "\u09C7", "\u09C8", "\u09CB", "\u09CC" };
		halantExists = true;
		halantEnd = 37;

		KeyAttr tempKey = new KeyAttr();
		for (int i = 0; i < nKeys; i++) {
			myKey.add(i, tempKey);
		}

		KeyAttr myKey0 = new KeyAttr();
		myKey0.code = 1;
		myKey0.label = "\u0995";
		myKey0.showChakra = true;
		myKey.set(0, myKey0);

		KeyAttr myKey1 = new KeyAttr();
		myKey1.code = 2;
		myKey1.label = "\u0996";
		myKey1.showChakra = true;
		myKey.set(1, myKey1);

		KeyAttr myKey2 = new KeyAttr();
		myKey2.code = 3;
		myKey2.label = "\u0997";
		myKey2.showChakra = true;
		myKey.set(2, myKey2);

		KeyAttr myKey3 = new KeyAttr();
		myKey3.code = 4;
		myKey3.label = "\u0998";
		myKey3.showChakra = true;
		myKey.set(3, myKey3);

		KeyAttr myKey4 = new KeyAttr();
		myKey4.code = 5;
		myKey4.label = "\u0999";
		myKey4.showChakra = true;
		myKey.set(4, myKey4);

		KeyAttr myKey5 = new KeyAttr();
		myKey5.code = 6;
		myKey5.label = "\u099A";
		myKey5.showChakra = true;
		myKey.set(5, myKey5);

		KeyAttr myKey6 = new KeyAttr();
		myKey6.code = 7;
		myKey6.label = "\u099B";
		myKey6.showChakra = true;
		myKey.set(6, myKey6);

		KeyAttr myKey7 = new KeyAttr();
		myKey7.code = 8;
		myKey7.label = "\u099C";
		myKey7.showChakra = true;
		myKey.set(7, myKey7);

		KeyAttr myKey8 = new KeyAttr();
		myKey8.code = 9;
		myKey8.label = "\u099D";
		myKey8.showChakra = true;
		myKey.set(8, myKey8);

		KeyAttr myKey9 = new KeyAttr();
		myKey9.code = 10;
		myKey9.label = "\u099E";
		myKey9.showChakra = true;
		myKey.set(9, myKey9);

		KeyAttr myKey10 = new KeyAttr();
		myKey10.code = 11;
		myKey10.label = "\u099F";
		myKey10.showChakra = true;
		myKey.set(10, myKey10);

		KeyAttr myKey11 = new KeyAttr();
		myKey11.code = 12;
		myKey11.label = "\u09A0";
		myKey11.showChakra = true;
		myKey.set(11, myKey11);

		KeyAttr myKey12 = new KeyAttr();
		myKey12.code = 13;
		myKey12.label = "\u09A1";
		myKey12.showChakra = true;
		myKey.set(12, myKey12);

		KeyAttr myKey13 = new KeyAttr();
		myKey13.code = 14;
		myKey13.label = "\u09A2";
		myKey13.showChakra = true;
		myKey.set(13, myKey13);

		KeyAttr myKey14 = new KeyAttr();
		myKey14.code = 15;
		myKey14.label = "\u09A3";
		myKey14.showChakra = true;
		myKey.set(14, myKey14);

		KeyAttr myKey15 = new KeyAttr();
		myKey15.code = 16;
		myKey15.label = "\u09A4";
		myKey15.showChakra = true;
		myKey.set(15, myKey15);

		KeyAttr myKey16 = new KeyAttr();
		myKey16.code = 17;
		myKey16.label = "\u09A5";
		myKey16.showChakra = true;
		myKey.set(16, myKey16);

		KeyAttr myKey17 = new KeyAttr();
		myKey17.code = 18;
		myKey17.label = "\u09A6";
		myKey17.showChakra = true;
		myKey.set(17, myKey17);

		KeyAttr myKey18 = new KeyAttr();
		myKey18.code = 19;
		myKey18.label = "\u09A7";
		myKey18.showChakra = true;
		myKey.set(18, myKey18);

		KeyAttr myKey19 = new KeyAttr();
		myKey19.code = 20;
		myKey19.label = "\u09A8";
		myKey19.showChakra = true;
		myKey.set(19, myKey19);

		KeyAttr myKey20 = new KeyAttr();
		myKey20.code = 21;
		myKey20.label = "\u09AA";
		myKey20.showChakra = true;
		myKey.set(20, myKey20);

		KeyAttr myKey21 = new KeyAttr();
		myKey21.code = 22;
		myKey21.label = "\u09AB";
		myKey21.showChakra = true;
		myKey.set(21, myKey21);

		KeyAttr myKey22 = new KeyAttr();
		myKey22.code = 23;
		myKey22.label = "\u09AC";
		myKey22.showChakra = true;
		myKey.set(22, myKey22);

		KeyAttr myKey23 = new KeyAttr();
		myKey23.code = 24;
		myKey23.label = "\u09AD";
		myKey23.showChakra = true;
		myKey.set(23, myKey23);

		KeyAttr myKey24 = new KeyAttr();
		myKey24.code = 25;
		myKey24.label = "\u09AE";
		myKey24.showChakra = true;
		myKey.set(24, myKey24);

		KeyAttr myKey25 = new KeyAttr();
		myKey25.code = 26;
		myKey25.label = "\u09AF";
		myKey25.showChakra = true;
		myKey.set(25, myKey25);

		KeyAttr myKey26 = new KeyAttr();
		myKey26.code = 27;
		myKey26.label = "\u09B0";
		myKey26.showChakra = true;
		myKey.set(26, myKey26);

		KeyAttr myKey27 = new KeyAttr();
		myKey27.code = 28;
		myKey27.label = "\u09B2";
		myKey27.showChakra = true;
		myKey.set(27, myKey27);

		KeyAttr myKey28 = new KeyAttr();
		myKey28.code = 29;
		myKey28.label = "\u09B6";
		myKey28.showChakra = true;
		myKey.set(28, myKey28);

		KeyAttr myKey29 = new KeyAttr();
		myKey29.code = 30;
		myKey29.label = "\u09B7";
		myKey29.showChakra = true;
		myKey.set(29, myKey29);

		KeyAttr myKey30 = new KeyAttr();
		myKey30.code = 31;
		myKey30.label = "\u09B8";
		myKey30.showChakra = true;
		myKey.set(30, myKey30);

		KeyAttr myKey31 = new KeyAttr();
		myKey31.code = 32;
		myKey31.label = "\u09B9";
		myKey31.showChakra = true;
		myKey.set(31, myKey31);

		KeyAttr myKey32 = new KeyAttr();
		myKey32.code = 33;
		myKey32.label = "\u09CE";
		myKey32.showChakra = true;
		myKey.set(32, myKey32);

		KeyAttr myKey33 = new KeyAttr();
		myKey33.code = 34;
		myKey33.label = "\u09A4\u09CD\u09B0";
		myKey33.showChakra = true;
		myKey.set(33, myKey33);

		KeyAttr myKey34 = new KeyAttr();
		myKey34.code = 35;
		myKey34.label = "\u09B6\u09CD\u09B0";
		myKey34.showChakra = true;
		myKey.set(34, myKey34);

		KeyAttr myKey35 = new KeyAttr();
		myKey35.code = 36;
		myKey35.label = "\u099C\u09CD\u099E";
		myKey35.showChakra = true;
		myKey.set(35, myKey35);

		KeyAttr myKey36 = new KeyAttr();
		myKey36.code = 37;
		myKey36.label = "\u0995\u09CD\u09B7";
		myKey36.showChakra = true;
		myKey.set(36, myKey36);

		KeyAttr myKey37 = new KeyAttr();
		myKey37.code = 38;
		myKey37.label = "\u09BE";
		myKey37.showChakra = true;
		myKey37.showCustomChakra = true;
		myKey37.customChakraLayout = new String[] { "\u09CD", "\u09BE", "\u09BF",
				"\u09C0", "\u09C1", "\u09C2", "\u09C7", "\u09C8", "\u09CB",
				"\u09CC" };
		myKey.set(37, myKey37);

		KeyAttr myKey38 = new KeyAttr();
		myKey38.code = 39;
		myKey38.label = "\u0985";
		myKey38.showChakra = true;
		myKey38.showCustomChakra = true;
		myKey38.customChakraLayout = new String[] { "", "\u0986", "\u0987",
				"\u0988", "\u0989", "\u098A", "\u098F", "\u0990", "\u0993",
				"\u0994" };
		myKey.set(38, myKey38);

		KeyAttr myKey39 = new KeyAttr();
		myKey39.code = 40;
		myKey39.label = "\u09C3";
		myKey39.showChakra = true;
		myKey39.showCustomChakra = true;
		myKey39.customChakraLayout = new String[] { "", "\u098C", "\u098B",
				"\u09E0", "", "", "", "\u09BD", "\u09D7", "\u09C4" };
		myKey.set(39, myKey39);

		KeyAttr myKey40 = new KeyAttr();
		myKey40.code = 41;
		myKey40.label = ".";
		myKey40.showChakra = false;
		myKey.set(40, myKey40);

		KeyAttr myKey41 = new KeyAttr();
		myKey41.code = 42;
		myKey41.label = "\u002c";
		myKey41.showChakra = false;
		myKey.set(41, myKey41);

		KeyAttr myKey42 = new KeyAttr();
		myKey42.code = 43;
		myKey42.label = "!";
		myKey42.showChakra = false;
		myKey.set(42, myKey42);

		KeyAttr myKey43 = new KeyAttr();
		myKey43.code = 44;
		myKey43.label = "?";
		myKey43.showChakra = false;
		myKey.set(43, myKey43);

		KeyAttr myKey44 = new KeyAttr();
		myKey44.code = 45;
		myKey44.label = "\u09F7";
		myKey44.showChakra = false;
		myKey.set(44, myKey44);

		KeyAttr myKey45 = new KeyAttr();
		myKey45.code = 46;
		myKey45.label = "\"";
		myKey45.showChakra = true;
		myKey45.showCustomChakra = true;
		myKey45.customChakraLayout = new String[] {"","","","\u201D","","","","","\u201C",""};
		myKey.set(45, myKey45);

		KeyAttr myKey46 = new KeyAttr();
		myKey46.code = 47;
		myKey46.label = "\'";
		myKey46.showChakra = false;
		myKey.set(46, myKey46);

		KeyAttr myKey47 = new KeyAttr();
		myKey47.code = 48;
		myKey47.label = "\u0982";
		myKey47.showChakra = false;
		myKey47.showIcon = true;
		myKey47.icon = "anusvar";
		myKey.set(47, myKey47);

		KeyAttr myKey48 = new KeyAttr();
		myKey48.code = 49;
		myKey48.label = "\u0981";
		myKey48.showChakra = false;
		myKey48.showIcon = true;
		myKey48.icon = "chandra";
		myKey.set(48, myKey48);

		KeyAttr myKey49 = new KeyAttr();
		myKey49.code = 50;
		myKey49.label = "\u0983";
		myKey49.showChakra = false;
		myKey49.showIcon = true;
		myKey49.icon = "visarga";
		myKey.set(49, myKey49);

		KeyAttr myKey50 = new KeyAttr();
		myKey50.code = 51;
		myKey50.label = "\u09BC";
		myKey50.showChakra = false;
		myKey50.showIcon = true;
		myKey50.icon = "nukta";
		myKey50.isException = true;
		myKey.set(50, myKey50);

		KeyAttr myKey51 = new KeyAttr();
		myKey51.code = 52;
		myKey51.label = " ";
		myKey51.showChakra = false;
		myKey51.showIcon = true;
		myKey51.icon = "rafar";
		myKey51.isException = true;
		myKey.set(51, myKey51);

		KeyAttr myKey52 = new KeyAttr();
		myKey52.code = 53;
		myKey52.label = " ";
		myKey52.showChakra = false;
		myKey52.showIcon = true;
		myKey52.icon = "trakar";
		myKey52.isException = true;
		myKey.set(52, myKey52);

		KeyAttr myKey53 = new KeyAttr();
		myKey53.code = 54;
		myKey53.label = ".";
		myKey53.showChakra = false;
		myKey.set(53, myKey53);

		KeyAttr myKey54 = new KeyAttr();
		myKey54.code = 55;
		myKey54.label = "\u0970";
		myKey54.showChakra = false;
		myKey.set(54, myKey54);

		KeyAttr myKey55 = new KeyAttr();
		myKey55.code = 56;
		myKey55.label = "\u09E7";
		myKey55.showChakra = false;
		myKey.set(55, myKey55);

		KeyAttr myKey56 = new KeyAttr();
		myKey56.code = 57;
		myKey56.label = "\u09E8";
		myKey56.showChakra = false;
		myKey.set(56, myKey56);

		KeyAttr myKey57 = new KeyAttr();
		myKey57.code = 58;
		myKey57.label = "\u09E9";
		myKey57.showChakra = false;
		myKey.set(57, myKey57);

		KeyAttr myKey58 = new KeyAttr();
		myKey58.code = 59;
		myKey58.label = "\u002B";
		myKey58.showChakra = false;
		myKey.set(58, myKey58);

		KeyAttr myKey59 = new KeyAttr();
		myKey59.code = 60;
		myKey59.label = ",";
		myKey59.showChakra = false;
		myKey.set(59, myKey59);

		KeyAttr myKey60 = new KeyAttr();
		myKey60.code = 61;
		myKey60.label = "\u0965";
		myKey60.showChakra = false;
		myKey.set(60, myKey60);

		KeyAttr myKey61 = new KeyAttr();
		myKey61.code = 62;
		myKey61.label = "\u09EA";
		myKey61.showChakra = false;
		myKey.set(61, myKey61);

		KeyAttr myKey62 = new KeyAttr();
		myKey62.code = 63;
		myKey62.label = "\u09EB";
		myKey62.showChakra = false;
		myKey.set(62, myKey62);

		KeyAttr myKey63 = new KeyAttr();
		myKey63.code = 64;
		myKey63.label = "\u09EC";
		myKey63.showChakra = false;
		myKey.set(63, myKey63);

		KeyAttr myKey64 = new KeyAttr();
		myKey64.code = 65;
		myKey64.label = "\u002D";
		myKey64.showChakra = false;
		myKey.set(64, myKey64);

		KeyAttr myKey65 = new KeyAttr();
		myKey65.code = 66;
		myKey65.label = ";";
		myKey65.showChakra = false;
		myKey.set(65, myKey65);

		KeyAttr myKey66 = new KeyAttr();
		myKey66.code = 67;
		myKey66.label = "_";
		myKey66.showChakra = false;
		myKey.set(66, myKey66);

		KeyAttr myKey67 = new KeyAttr();
		myKey67.code = 68;
		myKey67.label = "\u09ED";
		myKey67.showChakra = false;
		myKey.set(67, myKey67);

		KeyAttr myKey68 = new KeyAttr();
		myKey68.code = 69;
		myKey68.label = "\u09EE";
		myKey68.showChakra = false;
		myKey.set(68, myKey68);

		KeyAttr myKey69 = new KeyAttr();
		myKey69.code = 70;
		myKey69.label = "\u09EF";
		myKey69.showChakra = false;
		myKey.set(69, myKey69);

		KeyAttr myKey70 = new KeyAttr();
		myKey70.code = 71;
		myKey70.label = "x";
		myKey70.showChakra = false;
		myKey.set(70, myKey70);

		KeyAttr myKey71 = new KeyAttr();
		myKey71.code = 72;
		myKey71.label = "=";
		myKey71.showChakra = false;
		myKey.set(71, myKey71);

		KeyAttr myKey72 = new KeyAttr();
		myKey72.code = 73;
		myKey72.label = ":";
		myKey72.showChakra = false;
		myKey.set(72, myKey72);

		KeyAttr myKey73 = new KeyAttr();
		myKey73.code = 74;
		myKey73.label = "\u2014";
		myKey73.showChakra = false;
		myKey.set(73, myKey73);

		KeyAttr myKey74 = new KeyAttr();
		myKey74.code = 75;
		myKey74.label = "*";
		myKey74.showChakra = false;
		myKey.set(74, myKey74);

		KeyAttr myKey75 = new KeyAttr();
		myKey75.code = 76;
		myKey75.label = "\u09E6";
		myKey75.showChakra = false;
		myKey.set(75, myKey75);

		KeyAttr myKey76 = new KeyAttr();
		myKey76.code = 77;
		myKey76.label = "#";
		myKey76.showChakra = false;
		myKey.set(76, myKey76);

		KeyAttr myKey77 = new KeyAttr();
		myKey77.code = 78;
		myKey77.label = "\u00F7";
		myKey77.showChakra = false;
		myKey.set(77, myKey77);

		KeyAttr myKey78 = new KeyAttr();
		myKey78.code = 79;
		myKey78.label = "|";
		myKey78.showChakra = false;
		myKey.set(78, myKey78);

		KeyAttr myKey79 = new KeyAttr();
		myKey79.code = 80;
		myKey79.label = "\u20B9";
		myKey79.showChakra = false;
		myKey.set(79, myKey79);

		KeyAttr myKey80 = new KeyAttr();
		myKey80.code = 81;
		myKey80.label = "$";
		myKey80.showChakra = false;
		myKey.set(80, myKey80);

		KeyAttr myKey81 = new KeyAttr();
		myKey81.code = 82;
		myKey81.label = "%";
		myKey81.showChakra = false;
		myKey.set(81, myKey81);

		KeyAttr myKey82 = new KeyAttr();
		myKey82.code = 83;
		myKey82.label = "\u2122";
		myKey82.showChakra = false;
		myKey.set(82, myKey82);

		KeyAttr myKey83 = new KeyAttr();
		myKey83.code = 84;
		myKey83.label = "\u00A9";
		myKey83.showChakra = false;
		myKey.set(83, myKey83);

		KeyAttr myKey84 = new KeyAttr();
		myKey84.code = 85;
		myKey84.label = "/";
		myKey84.showChakra = false;
		myKey.set(84, myKey84);

		KeyAttr myKey85 = new KeyAttr();
		myKey85.code = 86;
		myKey85.label = "\\";
		myKey85.showChakra = false;
		myKey.set(85, myKey85);

		KeyAttr myKey86 = new KeyAttr();
		myKey86.code = 87;
		myKey86.label = "@";
		myKey86.showChakra = false;
		myKey.set(86, myKey86);

		KeyAttr myKey87 = new KeyAttr();
		myKey87.code = 88;
		myKey87.label = "&";
		myKey87.showChakra = false;
		myKey.set(87, myKey87);

		KeyAttr myKey88 = new KeyAttr();
		myKey88.code = 89;
		myKey88.label = "\u09FA";
		myKey88.showChakra = false;
		myKey.set(88, myKey88);

		KeyAttr myKey89 = new KeyAttr();
		myKey89.code = 90;
		myKey89.label = "\u00AE";
		myKey89.showChakra = false;
		myKey.set(89, myKey89);

		KeyAttr myKey90 = new KeyAttr();
		myKey90.code = 91;
		myKey90.label = "~";
		myKey90.showChakra = false;
		myKey.set(90, myKey90);

		KeyAttr myKey91 = new KeyAttr();
		myKey91.code = 92;
		myKey91.label = "<";
		myKey91.showChakra = false;
		myKey.set(91, myKey91);

		KeyAttr myKey92 = new KeyAttr();
		myKey92.code = 93;
		myKey92.label = ">";
		myKey92.showChakra = false;
		myKey.set(92, myKey92);

		KeyAttr myKey93 = new KeyAttr();
		myKey93.code = 94;
		myKey93.label = "^";
		myKey93.showChakra = false;
		myKey.set(93, myKey93);

		KeyAttr myKey94 = new KeyAttr();
		myKey94.code = 95;
		myKey94.label = "";
		myKey94.showChakra = false;
		myKey.set(94, myKey94);

		KeyAttr myKey95 = new KeyAttr();
		myKey95.code = 96;
		myKey95.label = "";
		myKey95.showChakra = false;
		myKey.set(95, myKey95);

		KeyAttr myKey96 = new KeyAttr();
		myKey96.code = 97;
		myKey96.label = "";
		myKey96.showChakra = false;
		myKey.set(96, myKey96);

		KeyAttr myKey97 = new KeyAttr();
		myKey97.code = 98;
		myKey97.label = "";
		myKey97.showChakra = false;
		myKey.set(97, myKey97);

		KeyAttr myKey98 = new KeyAttr();
		myKey98.code = 99;
		myKey98.label = "(";
		myKey98.showChakra = false;
		myKey.set(98, myKey98);

		KeyAttr myKey99 = new KeyAttr();
		myKey99.code = 100;
		myKey99.label = ")";
		myKey99.showChakra = false;
		myKey.set(99, myKey99);

		KeyAttr myKey100 = new KeyAttr();
		myKey100.code = 101;
		myKey100.label = "";
		myKey100.showChakra = false;
		myKey.set(100, myKey100);

		KeyAttr myKey101 = new KeyAttr();
		myKey101.code = 102;
		myKey101.label = "";
		myKey101.showChakra = false;
		myKey.set(101, myKey101);

		KeyAttr myKey102 = new KeyAttr();
		myKey102.code = 103;
		myKey102.label = "";
		myKey102.showChakra = false;
		myKey.set(102, myKey102);

		KeyAttr myKey103 = new KeyAttr();
		myKey103.code = 104;
		myKey103.label = "";
		myKey103.showChakra = false;
		myKey.set(103, myKey103);

		KeyAttr myKey104 = new KeyAttr();
		myKey104.code = 105;
		myKey104.label = "{";
		myKey104.showChakra = false;
		myKey.set(104, myKey104);

		KeyAttr myKey105 = new KeyAttr();
		myKey105.code = 106;
		myKey105.label = "}";
		myKey105.showChakra = false;
		myKey.set(105, myKey105);
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