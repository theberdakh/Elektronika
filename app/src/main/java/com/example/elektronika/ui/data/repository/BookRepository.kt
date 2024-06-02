package com.example.elektronika.ui.data.repository

import com.example.elektronika.R
import com.example.elektronika.ui.data.model.Book

object BookRepository {

    fun getLectures() =
        listOf(
            Book(
                id = 1,
                title = "Kirisiw. Elektronika hám Sxemalar 1 pánine kirisiw",
                assetId = R.raw.lecture_1,
                section = Category.LECTURE
            ),
            Book(
                id = 2,
                title = "Elektron sxema simulyatorları",
                assetId = R.raw.lecture_2,
                section = Category.LECTURE
            ),
            Book(
                id = 3,
                title =": Elektr sxema shamaları",
                assetId = R.raw.lecture_3,
                section = Category.LECTURE
            ),
            Book(
                id = 4,
                title = "Elektr shınjırlardıń tiykarǵı elementleri (1-bólim)",
                assetId = R.raw.lecture_4,
                section = Category.LECTURE
            ),
            Book(
                id = 5,
                title = "Elektr shınjırlarınıń tiykarǵı elementleri (2-bólim)",
                assetId = R.raw.lecture_5,
                section = Category.LECTURE
            ),
            Book(
                id = 6,
                title = "Elektr sxemalardı Kirxgof nızamları tiykarında esaplaw",
                assetId = R.raw.lecture_6,
                section = Category.LECTURE
            ),
            Book(
                id = 7,
                title = "ELEKTR SXEMALARDI KÍRXGOF NIZAMLARI TÍYKARINDA ESAPLAW",
                assetId = R.raw.lecture_7,
                section = Category.LECTURE
            ),
            Book(
                id = 8,
                title = "Elektr shınjırların esaplaw usılları",
                assetId = R.raw.lecture_8,
                section = Category.LECTURE
            ),
            Book(
                id = 9,
                title ="Elektr shınjırlardı esaplaw usılları (2-bólim)",
                assetId = R.raw.lecture_9,
                section = Category.LECTURE
            ),
            Book(
                id = 10,
                title = "Sensorlı tarmaqlardıń tiykarǵı túsinikleri hám principlerı. Sensorlı tarmaqtıń tiykarǵı arxitekturası.",
                assetId = R.raw.lecture_10,
                section = Category.LECTURE
            ),
            Book(
                id = 11,
                title = "Elektr shınjırlarǵa sinusoidal signal tásirindegi qásiyetlerin esaplaw (2-bólim) ",
                assetId = R.raw.lecture_11,
                section = Category.LECTURE
            ),
            Book(
                id = 12,
                title = "R, L hám C shınjırlardıń ACHX hám FCHX esaplaw",
                assetId = R.raw.lecture_12,
                section = Category.LECTURE
            ),
            Book(
                id = 13,
                title = "R, L hám C shınjırlardıń ACHX hám FCHX esaplaw (2-bólim)",
                assetId = R.raw.lecture_13,
                section = Category.LECTURE
            ),
            Book(
                id = 14,
                title = "RC hám RL shınjırlarda o'tkinshi processler",
                assetId = R.raw.lecture_14,
                section = Category.LECTURE
            ),
            Book(
                id = 15,
                title = "RC hám RL shınjırlarda o'tkinchi processler (2-bólim)",
                assetId = R.raw.lecture_15,
                section = Category.LECTURE
            ),
            Book(
                id = 17,
                title = "Yarım ótkizgishlerdi elektrofizikalıq qàsiyetleri (2-bólim)",
                assetId = R.raw.lecture_17,
                section = Category.LECTURE
            ),
            Book(
                id = 18,
                title = "Yarım ótkezgishlerde kontakt hádiyseleri",
                assetId = R.raw.lecture_18,
                section = Category.LECTURE
            ),
            Book(
                id = 19,
                title = "Yarımótkizgishli diodlar",
                assetId = R.raw.lecture_19,
                section = Category.LECTURE
            ),
            Book(
                id = 20,
                title = "Yarımótkizgishli diodlar",
                assetId = R.raw.lecture_20,
                section = Category.LECTURE
            ),
            Book(
                id = 21,
                title = "Bipolyar tranzistorlar (BT) (1-bòlim)",
                assetId = R.raw.lecture_21,
                section = Category.LECTURE
            ),
            Book(
                id = 22,
                title = "Bipolyar tranzistorlar (BT) (2-bólim)",
                assetId = R.raw.lecture_22,
                section = Category.LECTURE
            )

        )

    fun getPracticals() = listOf(
        Book(
            id = 1,
            title = "Universal laboratoriya stendi menen tanısıw",
            assetId = R.raw.lab_1,
            section = Category.PRACTICAL
        ), Book(
            id = 2,
            title = "Real mustaqil kernew hám tok dárekleriniń xarakteristikaların izertlew.",
            assetId = R.raw.lab_2,
            section = Category.PRACTICAL
        ),
        Book(
            id = 3,
            title = "Rezistiv shınjırlarda Kirxgof nızamların eksperimental izertlew",
            assetId = R.raw.lab_3,
            section = Category.PRACTICAL
        ),
        Book(
            id = 5,
            title = "RL hám RC shınjırlardı ózgeriwshen jiyiliklerde izertlew.",
            assetId = R.raw.lab_4,
            section = Category.PRACTICAL
        ), Book(
            id = 5,
            title = "Izbe-iz terbelis konturların izertlew",
            assetId = R.raw.lab_5,
            section = Category.PRACTICAL
        ),
        Book(
            id = 6,
            title = "Parallel terbelis konturın izertlew" ,
            assetId = R.raw.lab_6,
            section = Category.PRACTICAL
        ),
        Book(
            id = 8,
            title = "Yarım ótkezgishli diod parametrleri hám xarakteristikaların izertlew" ,
            assetId = R.raw.lab_8,
            section = Category.PRACTICAL
        ), Book(
            id = 9,
            title = "Stabilitron xarakteristikası hám parametrlerin izertlew" ,
            assetId = R.raw.lab_9,
            section = Category.PRACTICAL
        ), Book(
            id = 10,
            title = "Optrondı izertlew" ,
            assetId = R.raw.lab_10,
            section = Category.PRACTICAL
        ), Book(
            id = 11,
            title = "UE jalǵanıw sxemasındaǵı BT niń statikalıq VAX lardi izertlew" ,
            assetId = R.raw.lab_11,
            section = Category.PRACTICAL
        ),Book(
            id = 12,
            title = "UB jalǵanıw sxeması daǵı BT ni statikalıq VAX larini izertlew" ,
            assetId = R.raw.lab_12,
            section = Category.PRACTICAL
        ),Book(
            id = 13,
            title = "MT statikalıq xarakteristikaların izertlew" ,
            assetId = R.raw.lab_13,
            section = Category.PRACTICAL
        ),Book(
            id = 14,
            title = "Kanalı induksiyalanǵan metal -dielektrik-yarım ótkezgish (MDYa) xarakteristikaların izertlew" ,
            assetId = R.raw.lab_14,
            section = Category.PRACTICAL
        ),Book(
            id = 15,
            title = "Operatsion kúsheytgishlerdi izertlew" ,
            assetId = R.raw.lab_15,
            section = Category.PRACTICAL
        ),

        )

    fun getDocuments() = listOf(
        Book(
            id = 1,
            title = "Oqıw qollanba",
            assetId = R.raw.full_kar,
            section = Category.DOCUMENTS
        ),
        Book(
            id = 2,
            title = "SILLABUS",
            assetId = R.raw.syllabus,
            section = Category.DOCUMENTS
        )
    )
    fun getExamMaterials() = emptyList<Book>()
}

enum class Category {
    LECTURE, PRACTICAL, VIDEO, DOCUMENTS, EXAM
}