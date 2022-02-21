package com.example.the_catch.data

import com.example.the_catch.data.Lake
import com.example.the_catch.R
import com.example.the_catch.model.Fish

object DataSource {
    val fishs: List<Fish> = listOf(
        Fish(
            R.drawable.fish,
            1,
            "artichoke",
            1,
            "Freepik",
            0
        ),
        Fish(
            R.drawable.fish,
            1,
            "cod",
            2,
            "No source",
            0
        ),
        Fish(
            R.drawable.fish,
            2,
            "goldfish",
            3,
            "No source",
            0
        )
    )

    val lakes: List<Lake> = listOf(
        Lake(
            R.drawable.galveston_bay,
            1,
            0
        ),
        Lake(
            R.drawable.lake_conroe,
            2,
            0
        ),
        Lake(
            R.drawable.lake_fork_reservoir,
            3,
            0
        ),
        Lake(
            R.drawable.lake_ray_hubbard,
            4,
            0
        ),
        Lake(
            R.drawable.lake_sam_rayburn,
            5,
            0
        )
    )
}

