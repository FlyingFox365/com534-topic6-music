class Single(val aSide: Song, val bSide: Song): Music {
    override fun getPlayingTime(): Double {
        val playTime = aSide.playingTime + bSide.playingTime
        return playTime
    }

    override fun getAllSongs(): List<Song> {
        return listOf(aSide, bSide)
    }
}