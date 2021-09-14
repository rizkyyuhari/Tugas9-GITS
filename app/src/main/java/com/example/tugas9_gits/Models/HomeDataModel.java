package com.example.tugas9_gits.Models;

import java.util.ArrayList;
import java.util.List;

public class HomeDataModel {

    public static List<HomeModel> languageList() {
        HomeModel kotlin = new HomeModel("https://upload.wikimedia.org/wikipedia/commons/7/74/Kotlin_Icon.png", "Kotlin", "Learn Kotlin For Free!");
        HomeModel java = new HomeModel("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Faenza-text-x-java.svg/640px-Faenza-text-x-java.svg.png", "Java", "Learn Java For Free!");
        HomeModel c = new HomeModel("https://cdn.icon-icons.com/icons2/2415/PNG/512/c_original_logo_icon_146611.png", "c", "Learn C For Free!");
        HomeModel javascript = new HomeModel("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Javascript_Logo.png/640px-Javascript_Logo.png", "JavaScript", "Learn JavaScript For Free!");
        HomeModel php = new HomeModel("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/PHP_Logo.png/640px-PHP_Logo.png", "php", "Learn PHP For Free!");

        List<HomeModel> languageList = new ArrayList<>();

        languageList.add(kotlin);
        languageList.add(java);
        languageList.add(c);
        languageList.add(javascript);
        languageList.add(php);
        return languageList;
    }


}
