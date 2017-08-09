package org.ablx.cardroom.cardroombackend.repository

import org.ablx.cardroom.cardroombackend.entities.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface PlayerRepository : JpaRepository<Player, Long>