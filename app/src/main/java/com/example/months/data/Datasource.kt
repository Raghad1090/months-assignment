package com.example.months.data

import com.example.months.R
import com.example.months.model.month

class Datasource {

    fun loadmonths() : List<month> {

        return listOf<month> (
            month(R.string.January),
            month(R.string.February),
            month(R.string.March),
            month(R.string.April),
            month(R.string.May),
            month(R.string.June),
            month(R.string.July),
            month(R.string.August),
            month(R.string.September),
            month(R.string.October),
            month(R.string.November),
            month(R.string.December)
        )
    }

}