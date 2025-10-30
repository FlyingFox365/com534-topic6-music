class RecordPlayer {
    fun play(music: Music) {
        println("${music.getPlayingTime()} mins")
        println("Songs:")
        for (song in music.getAllSongs()) {
            println(song)
        }
    }
}