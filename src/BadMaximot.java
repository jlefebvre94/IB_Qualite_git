package fr.ibformation.quality;

import java.util.Random;

public class BadMaximot {
	public static String mixer(String mot) {
	Random r = new Random();
	char[] m = mot.toCharArray();
	int l = m.length;
	for (int i = 0; i < l * 4; i++) {int p1 = r.nextInt(l);
	int p2 = r.nextInt(l);
	char temp = m[p1];
	m[p1] = m[p2];
	m[p2] = temp;}
	return new String(m);}
	public static void main(String[] args) {
	String[] dic = {"FRAISE","BANANE","ORANGE"};
	Random r = new Random();
	int randomIndex = r.nextInt(dic.length);
	String mot = dic[randomIndex];
	String mix = mixer(mot);
	System.out.println(mix);}
}
