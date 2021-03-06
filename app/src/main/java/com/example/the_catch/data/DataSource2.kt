package com.example.the_catch.data

import com.example.the_catch.data.Lake
import com.example.the_catch.R
import com.example.the_catch.model.Fish

class Datasource2 {
    fun loadLakes(): List<Lake>{
        return listOf<Lake>(
            Lake(R.drawable.lake_conroe, 1, 0),
            Lake(R.drawable.lake_fork_reservoir, 2, 0),
            Lake(R.drawable.lake_ray_hubbard, 3, 0),
            Lake(R.drawable.lake_sam_rayburn, 4, 0),
            Lake(R.drawable.galveston_bay, 5, 0)

        )
    }
}

