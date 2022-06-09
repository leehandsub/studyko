package com.example.studyko.ui.categorydetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.studyko.model.Promotion
import com.example.studyko.model.TopSelling
import com.example.studyko.repository.categorydetail.CategoryDetailRepository
import kotlinx.coroutines.launch

class CategoryDetailViewModel(
    private val categoryDetailRepository: CategoryDetailRepository
): ViewModel() {

    private val _topSelling = MutableLiveData<TopSelling>()
    val topSelling: LiveData<TopSelling> = _topSelling

    private val _promotions = MutableLiveData<Promotion>()
    val promotions: LiveData<Promotion> = _promotions

    init {
        loadCategoryDetail()
    }

    private fun loadCategoryDetail() {
        viewModelScope.launch {
            val categoryDetail = categoryDetailRepository.getCategoryDetail()
            _topSelling.value = categoryDetail.topSelling
            _promotions.value = categoryDetail.promotions
        }
    }
}