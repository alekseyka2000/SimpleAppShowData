package com.example.simpleappshowdata.entity

data class WorldDate(
    val abbreviation : Int,
    val client_ip : String,
    val datetime : String,
    val day_of_week : Int,
    val day_of_year : Int,
    val dst : Boolean,
    val dst_from : String,
    val dst_offset : Int,
    val dst_until : String,
    val raw_offset : Int,
    val timezone : String,
    val unixtime : Int,
    val utc_datetime : String,
    val utc_offset : String,
    val week_number : Int)