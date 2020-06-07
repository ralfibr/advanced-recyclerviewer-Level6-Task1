package com.example.advanced_recyclerviewer_Level6_Task1

data class ColorItem (
    var hex: String,
    var name: String
) {
    fun getImageUrl() = "http://singlecolorimage.com/get/$hex/1080x1080"
}