package com.github.vecherkov.webdiff;

import org.springframework.stereotype.Service;

@Service
public class ComparisionService {

    public String compare(String str1, String str2) {
        int length = Math.max(str1.length(), str2.length());
        StringBuilder diff = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            Object c1 = i < str1.length() ? str1.charAt(i) : "";
            Object c2 = i < str2.length() ? str2.charAt(i) : "";
            if (c1.equals(c2)) {
                diff.append(c1);
            } else {
                diff.append("[").append(c1).append("/").append(c2).append("]");
            }
        }
        return diff.toString();
    }
}
