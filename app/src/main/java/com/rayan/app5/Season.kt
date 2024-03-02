package com.rayan.app5

fun main() {
    var s1 = Season.FALL;
    var s2 = Season.SUMMER;

    println(s2.translate);

    SchedulerHandler.currentSeason();
    SchedulerHandler.setSeason(Season.SPRING)
}

class OtherClasse() {

    init {
        SchedulerHandler.setSeason(Season.FALL);
    }

    fun printCurrentSeason() = SchedulerHandler.currentSeason();
}

object SchedulerHandler {

    private var season: Season = Season.WINTER;

    fun setSeason(newSeason: Season) {
        this.season = newSeason;
    }

    fun currentSeason() = println(season);
}

enum class Season(var translate:String) {

    WINTER("inverno"),
    SPRING("primavera"),
    SUMMER("verão"),
    FALL("outono");

}