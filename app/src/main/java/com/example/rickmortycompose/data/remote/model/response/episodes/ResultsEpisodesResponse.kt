package com.saraalves.rickandmorty.data.remote.model.response.episodes

import com.saraalves.rickandmorty.data.remote.model.response.character.CharacterResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResultsEpisodesResponse(
    @SerialName("id") val id: Int? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("air_date") val airDate: String? = null,
    @SerialName("episode") val episode: String? = null,
    @SerialName("characters") val characters: List<String>? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("created") val created: String? = null,

)
