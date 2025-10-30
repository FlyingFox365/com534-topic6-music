class Album(val songs: List<Song>): Music {
    override fun getPlayingTime(): Double {
        var
        for (song in songs) {

        }
    }

    fun filterByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }
}