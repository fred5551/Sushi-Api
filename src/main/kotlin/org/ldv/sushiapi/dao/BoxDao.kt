package org.ldv.sushiapi.dao
import org.ldv.sushiapi.model.entity.Box
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository



@Repository
interface BoxDao : JpaRepository<Box, Int>