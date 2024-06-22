package com.aditya.a30dd.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.aditya.a30dd.R

data class Destination(
    @DrawableRes val imageId : Int,
    @StringRes val d_name : Int,
    @StringRes val d_place : Int,
    @StringRes val d_Description : Int
)

val  destinations = listOf(
    Destination(R.drawable.nubra, R.string.destination_1,R.string.d_place_1,R.string.d_description_1),
    Destination(R.drawable.khajjiar, R.string.destination_2,R.string.d_place_2,R.string.d_description_2),
    Destination(R.drawable.valleyofflowers, R.string.destination_3,R.string.d_place_3,R.string.d_description_3),
    Destination(R.drawable.dalcake, R.string.destination_4,R.string.d_place_4,R.string.d_description_4),
    Destination(R.drawable.munnar, R.string.destination_5,R.string.d_place_5,R.string.d_description_5),
    Destination(R.drawable.dhudhsagarfalls, R.string.destination_6,R.string.d_place_6,R.string.d_description_6),
    Destination(R.drawable.yumthangvalley, R.string.destination_7,R.string.d_place_7,R.string.d_description_7),
    Destination(R.drawable.tawang, R.string.destination_8,R.string.d_place_8,R.string.d_description_8),
    Destination(R.drawable.sundarban, R.string.destination_9,R.string.d_place_9,R.string.d_description_9),
    Destination(R.drawable.ranthambore, R.string.destination_10,R.string.d_place_10,R.string.d_description_10),
    Destination(R.drawable.varanasighats, R.string.destination_11,R.string.d_place_11,R.string.d_description_11),
    Destination(R.drawable.dadwki, R.string.destination_12,R.string.d_place_12,R.string.d_description_12),
    Destination(R.drawable.bhedaghat, R.string.destination_13,R.string.d_place_13,R.string.d_description_13),
    Destination(R.drawable.rannofkutch, R.string.destination_14,R.string.d_place_14,R.string.d_description_14),
    Destination(R.drawable.andaman, R.string.destination_15,R.string.d_place_15,R.string.d_description_15),
    Destination(R.drawable.gulmarg, R.string.destination_16,R.string.d_place_16,R.string.d_description_16),
    Destination(R.drawable.sanddunes, R.string.destination_17,R.string.d_place_17,R.string.d_description_17),
    Destination(R.drawable.mahabaleshwar, R.string.destination_18,R.string.d_place_18,R.string.d_description_18),
    Destination(R.drawable.hampi, R.string.destination_19,R.string.d_place_19,R.string.d_description_19),
    Destination(R.drawable.mountabu, R.string.destination_20,R.string.d_place_20,R.string.d_description_20),
    Destination(R.drawable.agatti, R.string.destination_21,R.string.d_place_21,R.string.d_description_21),
    Destination(R.drawable.chikmagalur, R.string.destination_22,R.string.d_place_22,R.string.d_description_22),
    Destination(R.drawable.emeraldlake, R.string.destination_23,R.string.d_place_23,R.string.d_description_23),
    Destination(R.drawable.bir, R.string.destination_24,R.string.d_place_24,R.string.d_description_24),
    Destination(R.drawable.trivenisanganam, R.string.destination_25,R.string.d_place_25,R.string.d_description_25),
    Destination(R.drawable.auli, R.string.destination_26,R.string.d_place_26,R.string.d_description_26),
    Destination(R.drawable.wayanad, R.string.destination_27,R.string.d_place_27,R.string.d_description_27),
    Destination(R.drawable.gandikotacanyon, R.string.destination_28,R.string.d_place_28,R.string.d_description_28),
    Destination(R.drawable.gurudongmar, R.string.destination_29,R.string.d_place_29,R.string.d_description_29),
    Destination(R.drawable.lakepichola, R.string.destination_30,R.string.d_place_30,R.string.d_description_30)
)