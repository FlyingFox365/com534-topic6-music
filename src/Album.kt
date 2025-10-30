class Album(val songs: List<Song>): Music {
    override fun getPlayingTime(): Double {
        var playtime = 0.0
        for (song in songs) {
            playtime += song.playingTime
        }
        return playtime
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }

    fun filterByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }
}