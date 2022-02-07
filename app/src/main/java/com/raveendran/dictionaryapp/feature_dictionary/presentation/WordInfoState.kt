package com.raveendran.dictionaryapp.feature_dictionary.presentation

import com.raveendran.dictionaryapp.core.util.Resource
import com.raveendran.dictionaryapp.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)