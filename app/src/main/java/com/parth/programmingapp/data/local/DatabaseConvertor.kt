package com.parth.programmingapp.data.local



import androidx.room.TypeConverter
import java.lang.StringBuilder

class DatabaseConvertor {
    private val separator = ","

    @TypeConverter
    fun convertListToString(list : List<String>):String{
        val stringBuilder = StringBuilder()
        for(item in list){
            stringBuilder.append(item).append(separator)
        }
        stringBuilder.setLength(stringBuilder.length - separator.length)
        return stringBuilder.toString()
    }
    
    @TypeConverter
    fun convertStringToList(string:String):List<String>{
        return string.split(separator)
    }


}