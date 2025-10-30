fun main() {
    val player = RecordPlayer()
    val songs = listOf(Song("Song 1", "Artitst 1", 75.0), Song("Song 2", "Artitst 2", 12.0), Song("Song 3", "Artitst 3", 2.0))
    val album = Album(songs)
    player.play(album)
}