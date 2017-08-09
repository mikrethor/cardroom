package org.ablx.cardroom.cardroombackend.repository

import org.ablx.cardroom.cardroombackend.entities.Cardroom
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface CardroomRepository : JpaRepository<Cardroom, Long>