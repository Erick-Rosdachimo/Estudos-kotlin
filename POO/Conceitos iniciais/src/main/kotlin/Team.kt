class Team(val name: String, var baseLocation: String, var coachName: String) {
    private val players: MutableList<Player> = mutableListOf()
    private var captain: Player? = null

    fun addPlayer(player: Player) {
        players.add(player)
    }

    fun removePlayer(player: Player) {
        players.remove(player)
    }

    fun substitute(substitute: Player, starter: Player) {
        if(!players.contains(substitute) && !players.contains(starter)) return
        if(substitute.isFielded && !starter.isFielded) return
        substitute.isFielded = true
        starter.isFielded = false
    }

    fun setCaptain(player: Player) {
        if(!players.contains(captain)) return
        if(!player.isFielded) return
        captain = player
    }

    fun getFieldedPlayers(): List<Player> = players.filter { it.isFielded }

    fun getOutFieldedPlayers(): List<Player> = players.filter { !it.isFielded }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Team

        return name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "Team(name='$name', baseLocation='$baseLocation', coachName='$coachName', players=$players)"
    }
}