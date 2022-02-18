package com.example.the_catch.data

import com.example.the_catch.data.Lake
import com.example.the_catch.R
import com.example.the_catch.model.Fish

class Datasource2 {
    fun loadLakes(): List<Lake>{
        return listOf<Lake>(
            Lake(R.drawable.lake_conroe),
            Lake(R.drawable.lake_fork_reservoir),
            Lake(R.drawable.lake_ray_hubbard),
            Lake(R.drawable.lake_sam_rayburn),
            Lake(R.drawable.galveston_bay)

        )
    }
}

