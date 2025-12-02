package org.ldv.sushiapi.dao

import org.ldv.sushiapi.model.entity.Aliment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AlimentDao : JpaRepository<Aliment, Int>