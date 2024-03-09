package com.saraalves.rickandmorty.data.remote.datasource.episodes

import com.saraalves.rickandmorty.domain.model.response.character.AllCharacters
import com.saraalves.rickandmorty.domain.model.response.character.SingleCharacter
import com.saraalves.rickandmorty.domain.model.response.episodes.AllEpisodes
import com.saraalves.rickandmorty.domain.model.response.episodes.SingleEpisode
import kotlinx.coroutines.flow.Flow

interface EpisodesRemoteDataSource {

    fun getAllEpisodes(page: Int): Flow<AllEpisodes>
    fun getSingleEpisodes(id: Int): Flow<List<SingleEpisode>>
}