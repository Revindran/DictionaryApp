package com.raveendran.dictionaryapp.feature_dictionary.domain.repository

import com.raveendran.dictionaryapp.core.util.Resource
import com.raveendran.dictionaryapp.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}