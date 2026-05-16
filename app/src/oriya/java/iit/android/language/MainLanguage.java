package iit.android.language;
import iit.android.language.Language;
import iit.android.swarachakra.KeyAttr;

import java.util.ArrayList;
import java.util.HashMap;

import android.annotation.SuppressLint;

public class MainLanguage extends Language{

	public MainLanguage() {
		name = "oriya";
		symbol ="\u0B15"; //odiya
		nKeys = 106;
		myKey = new ArrayList<KeyAttr>(nKeys);
		defaultChakra = new String[] {"\u0b4d","\u0b3e", "\u0b3f", "\u0b40", "\u0b41", "\u0b42", "\u0b47", "\u0b48","\u0b4b", "\u0b4c" };
		halantExists =  true;
		halantEnd = 35;

		KeyAttr tempKey = new KeyAttr();
		for (int i=0; i < nKeys; i++ ) {
			myKey.add(i, tempKey);
		}

		KeyAttr myKey0 = new KeyAttr();
		myKey0.code = 1;
		myKey0.label = "\u0B15" ;
		myKey0.showChakra = true ;
		myKey0.changeLayout = true ;
		myKey.set(0, myKey0);

		KeyAttr myKey1 = new KeyAttr();
		myKey1.code = 2;
		myKey1.label = "\u0B16" ;
		myKey1.showChakra = true ;
		myKey1.changeLayout = true ;
		myKey.set(1, myKey1);

		KeyAttr myKey2 = new KeyAttr();
		myKey2.code = 3;
		myKey2.label = "\u0B17" ;
		myKey2.showChakra = true ;
		myKey2.changeLayout = true ;
		myKey.set(2, myKey2);

		KeyAttr myKey3 = new KeyAttr();
		myKey3.code = 4;
		myKey3.label = "\u0B18" ;
		myKey3.showChakra = true ;
		myKey3.changeLayout = true ;
		myKey.set(3, myKey3);

		KeyAttr myKey4 = new KeyAttr();
		myKey4.code = 5;
		myKey4.label = "\u0B19" ;
		myKey4.showChakra = true ;
		myKey4.changeLayout = true ;
		myKey.set(4, myKey4);

		KeyAttr myKey5 = new KeyAttr();
		myKey5.code = 6;
		myKey5.label = "\u0B1A" ;
		myKey5.showChakra = true ;
		myKey5.changeLayout = true ;
		myKey.set(5, myKey5);

		KeyAttr myKey6 = new KeyAttr();
		myKey6.code = 7;
		myKey6.label = "\uu0B1B" ;
		myKey6.showChakra = true ;
		myKey6.changeLayout = true ;
		myKey.set(6, myKey6);

		KeyAttr myKey7 = new KeyAttr();
		myKey7.code = 8;
		myKey7.label = "\uu0B1C" ;
		myKey7.showChakra = true ;
		myKey7.changeLayout = true ;
		myKey.set(7, myKey7);

		KeyAttr myKey8 = new KeyAttr();
		myKey8.code = 9;
		myKey8.label = "\uu0B1D" ;
		myKey8.showChakra = true ;
		myKey8.changeLayout = true ;
		myKey.set(8, myKey8);

		KeyAttr myKey9 = new KeyAttr();
		myKey9.code = 10;
		myKey9.label = "\uu0B1E" ;
		myKey9.showChakra = true ;
		myKey9.changeLayout = true ;
		myKey.set(9, myKey9);

		KeyAttr myKey10 = new KeyAttr();
		myKey10.code = 11;
		myKey10.label = "\u0B1F" ;
		myKey10.showChakra = true ;
		myKey10.changeLayout = true ;
		myKey.set(10, myKey10);

		KeyAttr myKey11 = new KeyAttr();
		myKey11.code = 12;
		myKey11.label = "\u0B20" ;
		myKey11.showChakra = true ;
		myKey11.changeLayout = true ;
		myKey.set(11, myKey11);

		KeyAttr myKey12 = new KeyAttr();
		myKey12.code = 13;
		myKey12.label = "\u0B21" ;
		myKey12.showChakra = true ;
		myKey12.changeLayout = true ;
		myKey.set(12, myKey12);

		KeyAttr myKey13 = new KeyAttr();
		myKey13.code = 14;
		myKey13.label = "\u0B22" ;
		myKey13.showChakra = true ;
		myKey13.changeLayout = true ;
		myKey.set(13, myKey13);

		KeyAttr myKey14 = new KeyAttr();
		myKey14.code = 15;
		myKey14.label = "\u0B23" ;
		myKey14.showChakra = true ;
		myKey14.changeLayout = true ;
		myKey.set(14, myKey14);

		KeyAttr myKey15 = new KeyAttr();
		myKey15.code = 16;
		myKey15.label = "\u0B24" ;
		myKey15.showChakra = true ;
		myKey15.changeLayout = true ;
		myKey.set(15, myKey15);

		KeyAttr myKey16 = new KeyAttr();
		myKey16.code = 17;
		myKey16.label = "\u0B25" ;
		myKey16.showChakra = true ;
		myKey16.changeLayout = true ;
		myKey.set(16, myKey16);

		KeyAttr myKey17 = new KeyAttr();
		myKey17.code = 18;
		myKey17.label = "\u0B26" ;
		myKey17.showChakra = true ;
		myKey17.changeLayout = true ;
		myKey.set(17, myKey17);

		KeyAttr myKey18 = new KeyAttr();
		myKey18.code = 19;
		myKey18.label = "\u0B27" ;
		myKey18.showChakra = true ;
		myKey18.changeLayout = true ;
		myKey.set(18, myKey18);

		KeyAttr myKey19 = new KeyAttr();
		myKey19.code = 20;
		myKey19.label = "\u0B28" ;
		myKey19.showChakra = true ;
		myKey19.changeLayout = true ;
		myKey.set(19, myKey19);

		KeyAttr myKey20 = new KeyAttr();
		myKey20.code = 21;
		myKey20.label = "\u0B2A" ;
		myKey20.showChakra = true ;
		myKey20.changeLayout = true ;
		myKey.set(20, myKey20);

		KeyAttr myKey21 = new KeyAttr();
		myKey21.code = 22;
		myKey21.label = "\u0B2B" ;
		myKey21.showChakra = true ;
		myKey21.changeLayout = true ;
		myKey.set(21, myKey21);

		KeyAttr myKey22 = new KeyAttr();
		myKey22.code = 23;
		myKey22.label = "\u0B2C" ;
		myKey22.showChakra = true ;
		myKey22.changeLayout = true ;
		myKey.set(22, myKey22);

		KeyAttr myKey23 = new KeyAttr();
		myKey23.code = 24;
		myKey23.label = "\u0B2D" ;
		myKey23.showChakra = true ;
		myKey23.changeLayout = true ;
		myKey.set(23, myKey23);

		KeyAttr myKey24 = new KeyAttr();
		myKey24.code = 25;
		myKey24.label = "\u0B2E" ;
		myKey24.showChakra = true ;
		myKey24.changeLayout = true ;
		myKey.set(24, myKey24);

		KeyAttr myKey25 = new KeyAttr();
		myKey25.code = 26;
		myKey25.label = "\u0B2F" ;
		myKey25.showChakra = true ;
		myKey25.changeLayout = true ;
		myKey.set(25, myKey25);

		KeyAttr myKey26 = new KeyAttr();
		myKey26.code = 27;
		myKey26.label = "\u0B5F" ;
		myKey26.showChakra = true ;
		myKey26.changeLayout = true ;
		myKey.set(26, myKey26);

		KeyAttr myKey27 = new KeyAttr();
		myKey27.code = 28;
		myKey27.label = "\u0B30" ;
		myKey27.showChakra = true ;
		myKey27.changeLayout = true ;
		myKey.set(27, myKey27);

		KeyAttr myKey28 = new KeyAttr();
		myKey28.code = 29;
		myKey28.label = "\u0B33" ;
		myKey28.showChakra = true ;
		myKey28.changeLayout = true ;
		myKey.set(28, myKey28);

		KeyAttr myKey29 = new KeyAttr();
		myKey29.code = 30;
		myKey29.label = "\u0B32" ;
		myKey29.showChakra = true ;
		myKey29.changeLayout = true ;
		myKey.set(29, myKey29);

		KeyAttr myKey30 = new KeyAttr();
		myKey30.code = 31;
		myKey30.label = "\u0B36" ;
		myKey30.showChakra = true ;
		myKey30.changeLayout = true ;
		myKey.set(30, myKey30);

		KeyAttr myKey31 = new KeyAttr();
		myKey31.code = 32;
		myKey31.label = "\u0B37" ;
		myKey31.showChakra = true ;
		myKey31.changeLayout = true ;
		myKey.set(31, myKey31);

		KeyAttr myKey32 = new KeyAttr();
		myKey32.code = 33;
		myKey32.label = "\u0B38" ;
		myKey32.showChakra = true ;
		myKey32.changeLayout = true ;
		myKey.set(32, myKey32);

		KeyAttr myKey33 = new KeyAttr();
		myKey33.code = 34;
		myKey33.label = "\u0B39" ;
		myKey33.showChakra = true ;
		myKey33.changeLayout = true ;
		myKey.set(33, myKey33);

		KeyAttr myKey34 = new KeyAttr();
		myKey34.code = 35;
		myKey34.label = "\u0B15\u0B4D\u0B37" ;
		myKey34.showChakra = true ;
		myKey34.changeLayout = true ;
		myKey.set(34, myKey34);

		KeyAttr myKey35 = new KeyAttr();
		myKey35.code = 36;
		myKey35.label = "\u0B71" ;
		myKey35.showChakra = true ;
		myKey35.changeLayout = true ;
		myKey.set(35, myKey35);

		KeyAttr myKey36 = new KeyAttr();
		myKey36.code = 37;
		myKey36.label = "\u0B1C\u0B4D\u0B1E" ;
		myKey36.showChakra = true ;
		myKey36.changeLayout = true ;
		myKey.set(36, myKey36);

		KeyAttr myKey37 = new KeyAttr();
		myKey37.code = 38;
		myKey37.label = "\u0B36\u0B4D\u0B30\u0B40" ;
		myKey37.showChakra = true ;
		myKey37.showCustomChakra = true ;
		myKey37.customChakraLayout = new String[] {"\u0B70","\u0B13\u0B01","\u0B0C","\u0B61","\u0B62","\u0B63","\u0B44","\u0B43","\u0B60","\u0B3D"} ;
		myKey37.changeLayout = true ;
		myKey.set(37, myKey37);

		KeyAttr myKey38 = new KeyAttr();
		myKey38.code = 39;
		myKey38.label = "\u0B3E" ;
		myKey38.showChakra = true ;
		myKey38.showCustomChakra = true ;
		myKey38.customChakraLayout = new String[] {"\u0B4D","\u0B3E","\u0B3F","\u0B40","\u0B41","\u0B42","\u0B47","\u0B48","\u0B4B","\u0B4C"} ;
		myKey38.changeLayout = true ;
		myKey.set(38, myKey38);

		KeyAttr myKey39 = new KeyAttr();
		myKey39.code = 40;
		myKey39.label = "\u0B05" ;
		myKey39.showChakra = true ;
		myKey39.showCustomChakra = true ;
		myKey39.customChakraLayout = new String[] {"\u0B0B","\u0B06","\u0B07","\u0B08","\u0B09","\u0B0A","\u0B0F","\u0B10","\u0B13","\u0B14"} ;
		myKey39.changeLayout = true ;
		myKey.set(39, myKey39);

		KeyAttr myKey40 = new KeyAttr();
		myKey40.code = 41;
		myKey40.label = "." ;
		myKey40.showChakra = false ;
		myKey40.customChakraLayout = new String[] {""} ;
		myKey.set(40, myKey40);

		KeyAttr myKey41 = new KeyAttr();
		myKey41.code = 42;
		myKey41.label = "\u002c" ;
		myKey41.showChakra = false ;
		myKey41.customChakraLayout = new String[] {""} ;
		myKey.set(41, myKey41);

		KeyAttr myKey42 = new KeyAttr();
		myKey42.code = 43;
		myKey42.label = "!" ;
		myKey42.showChakra = false ;
		myKey42.customChakraLayout = new String[] {""} ;
		myKey.set(42, myKey42);

		KeyAttr myKey43 = new KeyAttr();
		myKey43.code = 44;
		myKey43.label = "?" ;
		myKey43.showChakra = false ;
		myKey43.customChakraLayout = new String[] {""} ;
		myKey.set(43, myKey43);

		KeyAttr myKey44 = new KeyAttr();
		myKey44.code = 45;
		myKey44.label = "\u2010" ;
		myKey44.showChakra = false ;
		myKey.set(44, myKey44);

		KeyAttr myKey45 = new KeyAttr();
		myKey45.code = 46;
		myKey45.label = "\"";
		myKey45.showChakra = true ;
		myKey45.showCustomChakra = true ;
		myKey45.customChakraLayout = new String[] {"","","","\u201D","","","","","\u201C",""} ;
		myKey.set(45, myKey45);

		KeyAttr myKey46 = new KeyAttr();
		myKey46.code = 47;
		myKey46.label = "\u0027" ;
		myKey46.showChakra = true ;
		myKey46.showCustomChakra = true ;
		myKey46.customChakraLayout = new String[] {"","","","\u2019","","","","","\u2018",""} ;
		myKey.set(46, myKey46);

		KeyAttr myKey47 = new KeyAttr();
		myKey47.code = 48;
		myKey47.label = "\u0B02" ;
		myKey47.showChakra = false ;
		myKey47.showIcon = true ;
		myKey47.icon = "anusvara";
		myKey.set(47, myKey47);

		KeyAttr myKey48 = new KeyAttr();
		myKey48.code = 49;
		myKey48.label = "\u0B01" ;
		myKey48.showChakra = false ;
		myKey48.showIcon = true ;
		myKey48.icon = "candara_bindu";
		myKey.set(48, myKey48);

		KeyAttr myKey49 = new KeyAttr();
		myKey49.code = 50;
		myKey49.label = "\u0B03" ;
		myKey49.showChakra = false ;
		myKey49.showIcon = true ;
		myKey49.icon = "visarga";
		myKey.set(49, myKey49);

		KeyAttr myKey50 = new KeyAttr();
		myKey50.code = 51;
		myKey50.label = "" ;
		myKey50.showChakra = false ;
		myKey50.showIcon = true ;
		myKey50.icon = "nukta";
		myKey50.isException = true;
		myKey.set(50, myKey50);

		KeyAttr myKey51 = new KeyAttr();
		myKey51.code = 52;
		myKey51.label = "" ;
		myKey51.showChakra = false ;
		myKey51.showIcon = true ;
		myKey51.icon = "trakar";
		myKey51.isException = true;
		myKey.set(51, myKey51);

		KeyAttr myKey52 = new KeyAttr();
		myKey52.code = 53;
		myKey52.label = "" ;
		myKey52.showChakra = false ;
		myKey52.showIcon = true ;
		myKey52.icon = "rafar";
		myKey52.isException = true;
		myKey.set(52, myKey52);

//NUMBER KEYBOARD//

		KeyAttr myKey53 = new KeyAttr();
		myKey53.code = 54;
		myKey53.label = "\u002e" ;
		myKey53.showChakra = false ;
		myKey.set(53, myKey53);

		KeyAttr myKey54 = new KeyAttr();
		myKey54.code = 55;
		myKey54.label = "\u0964" ;
		myKey54.showChakra = false ;
		myKey.set(54, myKey54);

		KeyAttr myKey55 = new KeyAttr();
		myKey55.code = 56;
		myKey55.label = "\u0B67" ;
		myKey55.showChakra = false ;
		myKey.set(55, myKey55);

		KeyAttr myKey56 = new KeyAttr();
		myKey56.code = 57;
		myKey56.label = "\u0B68" ;
		myKey56.showChakra = false ;
		myKey.set(56, myKey56);

		KeyAttr myKey57 = new KeyAttr();
		myKey57.code = 58;
		myKey57.label = "\u0B69" ;
		myKey57.showChakra = false ;
		myKey.set(57, myKey57);

		KeyAttr myKey58 = new KeyAttr();
		myKey58.code = 59;
		myKey58.label = "\u002b" ;
		myKey58.showChakra = false ;
		myKey58.customChakraLayout = new String[] {""} ;
		myKey.set(58, myKey58);

		KeyAttr myKey59 = new KeyAttr();
		myKey59.code = 60;
		myKey59.label = "\u002c" ;
		myKey59.showChakra = false ;
		myKey59.customChakraLayout = new String[] {""} ;
		myKey.set(59, myKey59);

		KeyAttr myKey60 = new KeyAttr();
		myKey60.code = 61;
		myKey60.label = "\u0965" ;
		myKey60.showChakra = false ;
		myKey60.customChakraLayout = new String[] {""} ;
		myKey.set(60, myKey60);

		KeyAttr myKey61 = new KeyAttr();
		myKey61.code = 62;
		myKey61.label = "\u0B6A" ;
		myKey61.showChakra = false ;
		myKey.set(61, myKey61);

		KeyAttr myKey62 = new KeyAttr();
		myKey62.code = 63;
		myKey62.label = "\u0B6B" ;
		myKey62.showChakra = false ;
		myKey.set(62, myKey62);

		KeyAttr myKey63 = new KeyAttr();
		myKey63.code = 64;
		myKey63.label = "\u0B6C" ;
		myKey63.showChakra = false ;
		myKey.set(63, myKey63);

		KeyAttr myKey64 = new KeyAttr();
		myKey64.code = 65;
		myKey64.label = "\u002D" ;
		myKey64.showChakra = false ;
		myKey64.customChakraLayout = new String[] {""} ;
		myKey.set(64, myKey64);

		KeyAttr myKey65 = new KeyAttr();
		myKey65.code = 66;
		myKey65.label = "\u003b" ;
		myKey65.showChakra = false ;
		myKey65.customChakraLayout = new String[] {""} ;
		myKey.set(65, myKey65);

		KeyAttr myKey66 = new KeyAttr();
		myKey66.code = 67;
		myKey66.label = "\u005f" ;
		myKey66.showChakra = false ;
		myKey66.customChakraLayout = new String[] {""} ;
		myKey.set(66, myKey66);

		KeyAttr myKey67 = new KeyAttr();
		myKey67.code = 68;
		myKey67.label = "\u0B6D" ;
		myKey67.showChakra = false ;
		myKey.set(67, myKey67);

		KeyAttr myKey68 = new KeyAttr();
		myKey68.code = 69;
		myKey68.label = "\u0B6E" ;
		myKey68.showChakra = false ;
		myKey.set(68, myKey68);

		KeyAttr myKey69 = new KeyAttr();
		myKey69.code = 70;
		myKey69.label = "\u0B6F" ;
		myKey69.showChakra = false ;
		myKey.set(69, myKey69);

		KeyAttr myKey70 = new KeyAttr();
		myKey70.code = 71;
		myKey70.label = "\u00D7" ;
		myKey70.showChakra = false ;
		myKey70.customChakraLayout = new String[] {""} ;
		myKey.set(70, myKey70);

		KeyAttr myKey71 = new KeyAttr();
		myKey71.code = 72;
		myKey71.label = "\u003D" ;
		myKey71.showChakra = false ;
		myKey71.customChakraLayout = new String[] {""} ;
		myKey.set(71, myKey71);

		KeyAttr myKey72 = new KeyAttr();
		myKey72.code = 73;
		myKey72.label = "\u003a" ;
		myKey72.showChakra = false ;
		myKey72.customChakraLayout = new String[] {""} ;
		myKey.set(72, myKey72);

		KeyAttr myKey73 = new KeyAttr();
		myKey73.code = 74;
		myKey73.label = "\u2014" ;
		myKey73.showChakra = false ;
		myKey73.customChakraLayout = new String[] {""} ;
		myKey.set(73, myKey73);

		KeyAttr myKey74 = new KeyAttr();
		myKey74.code = 75;
		myKey74.label = "\u002a" ;
		myKey74.showChakra = false ;
		myKey74.customChakraLayout = new String[] {""} ;
		myKey.set(74, myKey74);

		KeyAttr myKey75 = new KeyAttr();
		myKey75.code = 76;
		myKey75.label = "\u0B66" ;
		myKey75.showChakra = false ;
		myKey.set(75, myKey75);

		KeyAttr myKey76 = new KeyAttr();
		myKey76.code = 77;
		myKey76.label = "\u0023" ;
		myKey76.showChakra = false ;
		myKey76.customChakraLayout = new String[] {""} ;
		myKey.set(76, myKey76);

		KeyAttr myKey77 = new KeyAttr();
		myKey77.code = 78;
		myKey77.label = "\u00f7" ;
		myKey77.showChakra = false ;
		myKey77.customChakraLayout = new String[] {""} ;
		myKey.set(77, myKey77);

		KeyAttr myKey78 = new KeyAttr();
		myKey78.code = 79;
		myKey78.label = "\u007c" ;
		myKey78.showChakra = false ;
		myKey78.customChakraLayout = new String[] {""} ;
		myKey.set(78, myKey78);

		KeyAttr myKey79 = new KeyAttr();
		myKey79.code = 80;
		myKey79.label = "\u20B9" ;
		myKey79.showChakra = false ;
		myKey79.customChakraLayout = new String[] {""} ;
		myKey.set(79, myKey79);

		KeyAttr myKey80 = new KeyAttr();
		myKey80.code = 81;
		myKey80.label = "\u0024" ;
		myKey80.showChakra = false ;
		myKey80.customChakraLayout = new String[] {""} ;
		myKey.set(80, myKey80);

		KeyAttr myKey81 = new KeyAttr();
		myKey81.code = 82;
		myKey81.label = "\u0025" ;
		myKey81.showChakra = false ;
		myKey.set(81, myKey81);

		KeyAttr myKey82 = new KeyAttr();
		myKey82.code = 83;
		myKey82.label = "\u2122" ;
		myKey82.showChakra = false ;
		myKey82.customChakraLayout = new String[] {""} ;
		myKey.set(82, myKey82);

		KeyAttr myKey83 = new KeyAttr();
		myKey83.code = 84;
		myKey83.label = "\u00A9" ;
		myKey83.showChakra = false ;
		myKey83.customChakraLayout = new String[] {""} ;
		myKey.set(83, myKey83);

		KeyAttr myKey84 = new KeyAttr();
		myKey84.code = 85;
		myKey84.label = "\u002f" ;
		myKey84.showChakra = false ;
		myKey84.showCustomChakra = true ;
		myKey84.customChakraLayout = new String[] {""} ;
		myKey.set(84, myKey84);

		KeyAttr myKey85 = new KeyAttr();
		myKey85.code = 86;
		myKey85.label = "\\";
		myKey85.showChakra = false ;
		myKey85.showCustomChakra = true ;
		myKey85.customChakraLayout = new String[] {""} ;
		myKey.set(85, myKey85);

		KeyAttr myKey86 = new KeyAttr();
		myKey86.code = 87;
		myKey86.label = "\u0040" ;
		myKey86.showChakra = false ;
		myKey86.customChakraLayout = new String[] {""} ;
		myKey.set(86, myKey86);

		KeyAttr myKey87 = new KeyAttr();
		myKey87.code = 88;
		myKey87.label = "\u0026" ;
		myKey87.showChakra = false ;
		myKey87.customChakraLayout = new String[] {""} ;
		myKey.set(87, myKey87);

		KeyAttr myKey88 = new KeyAttr();
		myKey88.code = 89;
		myKey88.label = "\u0B13\u0B01" ;
		myKey88.showChakra = false ;
		myKey.set(88, myKey88);

		KeyAttr myKey89 = new KeyAttr();
		myKey89.code = 90;
		myKey89.label = "\u00AE" ;
		myKey89.showChakra = false ;
		myKey89.customChakraLayout = new String[] {""} ;
		myKey.set(89, myKey89);

		KeyAttr myKey90 = new KeyAttr();
		myKey90.code = 91;
		myKey90.label = "\u007e" ;
		myKey90.showChakra = false ;
		myKey90.customChakraLayout = new String[] {""} ;
		myKey.set(90, myKey90);

		KeyAttr myKey91 = new KeyAttr();
		myKey91.code = 92;
		myKey91.label = "\u003c" ;
		myKey91.showChakra = false ;
		myKey91.customChakraLayout = new String[] {""} ;
		myKey.set(91, myKey91);

		KeyAttr myKey92 = new KeyAttr();
		myKey92.code = 93;
		myKey92.label = "\u003e" ;
		myKey92.showChakra = false ;
		myKey92.customChakraLayout = new String[] {""} ;
		myKey.set(92, myKey92);

		KeyAttr myKey93 = new KeyAttr();
		myKey93.code = 94;
		myKey93.label = "\u005e" ;
		myKey93.showChakra = false ;
		myKey93.customChakraLayout = new String[] {""} ;
		myKey.set(93, myKey93);

		KeyAttr myKey94 = new KeyAttr();
		myKey94.code = 95;
		myKey94.label = "" ;
		myKey94.showChakra = false ;
		myKey.set(94, myKey94);

		KeyAttr myKey95 = new KeyAttr();
		myKey95.code = 96;
		myKey95.label = "" ;
		myKey95.showChakra = false ;
		myKey.set(95, myKey95);

		KeyAttr myKey96 = new KeyAttr();
		myKey96.code = 97;
		myKey96.label = "\u005b" ;
		myKey96.showChakra = false ;
		myKey.set(96, myKey96);

		KeyAttr myKey97 = new KeyAttr();
		myKey97.code = 98;
		myKey97.label = "\u005d" ;
		myKey97.showChakra = false ;
		myKey.set(97, myKey97);

		KeyAttr myKey98 = new KeyAttr();
		myKey98.code = 99;
		myKey98.label = "\u0028" ;
		myKey98.showChakra = false ;
		myKey.set(98, myKey98);

		KeyAttr myKey99 = new KeyAttr();
		myKey99.code = 100;
		myKey99.label = "\u0029" ;
		myKey99.showChakra = false ;
		myKey.set(99, myKey99);

		KeyAttr myKey100 = new KeyAttr();
		myKey100.code = 101;
		myKey100.label = "" ;
		myKey100.showChakra = false ;
		myKey.set(100, myKey100);

		KeyAttr myKey101 = new KeyAttr();
		myKey101.code = 102;
		myKey101.label = "" ;
		myKey101.showChakra = false ;
		myKey.set(101, myKey101);

		KeyAttr myKey102 = new KeyAttr();
		myKey102.code = 103;
		myKey102.label = "" ;
		myKey102.showChakra = false ;
		myKey.set(102, myKey102);

		KeyAttr myKey103 = new KeyAttr();
		myKey103.code = 104;
		myKey103.label = "" ;
		myKey103.showChakra = false ;
		myKey.set(103, myKey103);

		KeyAttr myKey104 = new KeyAttr();
		myKey104.code = 105;
		myKey104.label = "\u007b" ;
		myKey104.showChakra = false ;
		myKey.set(104, myKey104);

		KeyAttr myKey105 = new KeyAttr();
		myKey105.code = 106;
		myKey105.label = "\u007d" ;
		myKey105.showChakra = false ;
		myKey.set(105, myKey105);


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