package com.heima.demo斗地主;

import java.util.*;

public class Poker {
    private  Map<Integer,String> map = new HashMap<>();
    private  ArrayList<Integer> play1 = new ArrayList<>();
    private  ArrayList<Integer> play2 = new ArrayList<>();
    private  ArrayList<Integer> play3 = new ArrayList<>();
    private  ArrayList<Integer> dipai = new ArrayList<>();
    private  ArrayList<Integer> list = new ArrayList();
    private Set<Integer> keySet = new HashSet<>();

    public Poker() {
    }

    public static void main(String[] args) {

    }

    public void naDizhupai() {
        Random rd = new Random();
        int index = rd.nextInt(54);
        System.out.println("翻牌:"+map.get(index));
        if(dipai.contains(index)){
            faPoker(list);
            naDizhupai();
        } else if(play1.contains(index)){
            play1.addAll(dipai);
        }else if (play2.contains(index)){
            play2.addAll(dipai);
        }else {
            play3.addAll(dipai);
        }
    }

    public String showPoker(String name,ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.print(name+":\n\t\t");
        StringBuilder pok = new StringBuilder();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String p = map.get(list.get(i));
            pok.append(p+"  ");
            System.out.print(p+" ");
        }
        System.out.println();
        return pok.toString();
    }

    public void faPoker(ArrayList<Integer> list) {
        for (int i = 0 ; i <= 53 ; i++) {
            int i1 = list.get(i);
            if(i > 50){
                dipai.add(i1);
            }else {
                if(i % 3 == 2 ){
                    play1.add(i1);
                }else if(i % 3 == 0 ){
                    play2.add(i1);
                }else if(i % 3 == 1 ){
                    play3.add(i1);
                }
            }
        }
    }

    public void creatPoker() {
        String[] color = "♠,♥,♣,♦".split(",");
        String[] num = "2,A,K,Q,J,10,9,8,7,6,5,4,3".split(",");
        map.put(0,"大王");
        map.put(1,"小王");
        int index = 2;
        for (String s : num) {
            for (String s1 : color) {
                map.put(index++,s1+s);
            }
        }
        //System.out.println(map);
        keySet = map.keySet();
        list.addAll(keySet);
        Collections.shuffle(list);
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public ArrayList<Integer> getPlay1() {
        return play1;
    }

    public void setPlay1(ArrayList<Integer> play1) {
        this.play1 = play1;
    }

    public ArrayList<Integer> getPlay2() {
        return play2;
    }

    public void setPlay2(ArrayList<Integer> play2) {
        this.play2 = play2;
    }

    public ArrayList<Integer> getPlay3() {
        return play3;
    }

    public void setPlay3(ArrayList<Integer> play3) {
        this.play3 = play3;
    }

    public ArrayList<Integer> getDipai() {
        return dipai;
    }

    public void setDipai(ArrayList<Integer> dipai) {
        this.dipai = dipai;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public Set<Integer> getKeySet() {
        return keySet;
    }

    public void setKeySet(Set<Integer> keySet) {
        this.keySet = keySet;
    }
}
