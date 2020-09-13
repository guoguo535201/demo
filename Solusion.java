package com.peter.demo;

/**
 * @author ：defeng.guo ---------------3333 test merge 444444
 * @date ：Created in 2020/8/31 10:57
 * @description：给定两个字符串s和t， 写一个函数来决定是否t是s的重组词。你可以假设字符串只包含小写字母
 * @modified By：
 * @version: $
 */
public class Solusion {

  public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
      return false;
    int bit[] = new int[26];
    for(int i=0;i<s.length();i++){
      bit[s.charAt(i)-'a']++;
    }

    for(int i=0;i<s.length();i++){
      if(--bit[t.charAt(i)-'a']<0)
        return false;
    }
    return true;
  }
  public static void main(String[] args){
     Solusion s = new Solusion();
     boolean test = s.isAnagram("abc","bcz");
    System.out.println(test);
  }
}
