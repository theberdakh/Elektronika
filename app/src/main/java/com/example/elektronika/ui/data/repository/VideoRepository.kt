package com.example.elektronika.ui.data.repository

import com.example.elektronika.ui.data.model.Video

object VideoRepository {

    fun getSystemsAndSignalsVideos() =
        listOf(
            Video(
                id = 1,
                title = "Kúshleniw hám tok",
                url = "JNAqrwAXdwU"
            ),
            Video(
                id = 2,
                title = "Qarsılıq. Rezistor",
                url = "Im3p4-IhMiI"
            ),
            Video(
                id = 3,
                title = "Ózgeriwsheń hám ózgermes tok",
                url = "ae09deyW9JQ",
            ),
            Video(
                id = 4,
                title = "Kondensatorlar",
                url = "ZVHJlmceQcY"
            ),
            Video(
                id = 5,
                title = "Diod",
                url = "b6TKT0UCBOY"
            ),
            Video(
                id = 6,
                title = "Katushka induktivlik",
                url ="aeowdSQFfls"
            ),
            Video(
                id = 7,
                title = "Jaqtılıq diodı. LED",
                url = "ED-MRJk5Ays"
            ),
            Video(
                id = 8,
                title = "Elektromagnit",
                url = "jvudaFnnHso"
            ),
            Video(
                id = 9,
                title = "Transformator",
                url = "a0CEdO1W5FE"
            ),
            Video(
                id = 10,
                title = "Diodlı kópir",
                url = "3HPYL1CAfT0"
            )


        )
}