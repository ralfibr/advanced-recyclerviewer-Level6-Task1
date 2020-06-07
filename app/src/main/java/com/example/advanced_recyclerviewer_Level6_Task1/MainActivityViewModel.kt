package com.example.advanced_recyclerviewer_Level6_Task1
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
/**
 * @author Raeef Ibrahim
 * 500766393
 */
class MainActivityViewModel : ViewModel() {
    private val colorItemRepository = ColorItemRepository()

    val colorItems =
        MutableLiveData<List<ColorItem>>().apply { value = colorItemRepository.getColorItems() }
}