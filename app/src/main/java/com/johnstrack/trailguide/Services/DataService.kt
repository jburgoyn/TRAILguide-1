package com.johnstrack.trailguide.Services

import com.johnstrack.trailguide.Model.Category
import com.johnstrack.trailguide.Model.Item

/***
 * Created by John on 3/29/2018 at 5:31 PM.
 */
object DataService {
    val categories = listOf(
            Category("HIKING", "hiking"),
            Category("DIVING", "diving"),
            Category("CAMPING", "camping"),
            Category("SURFING", "surfing"),
            Category("FISHING", "fishing"),
            Category("HIKING", "hiking"),
            Category("DIVING", "diving"),
            Category("CAMPING", "camping"),
            Category("SURFING", "surfing"),
            Category("FISHING", "fishing")
    )

    val hiking = listOf(
            Item("TOOLS", "tools",
                    "No longer do you have to use different tools for different tasks, but instead you can use one tool and just swap out the accessories.\n\nWe recommend the Gerber multitool.",
                    "https://smile.amazon.com/Gerber-22-01471-Suspension-Multi-Plier/dp/B000EDPT9K/ref=zg_bs_553990_3?_encoding=UTF8&psc=1&refRID=QXYEH6SCRCJGDGBMWF2C"),
            Item("TENT", "tent",
                    "Tents are an absolute necessity for camping. They provide shelter and warmth. There are many different types of tents with varying sizes and purposes.\n\nWe recommend the Coleman WeatherMaster Tent.",
                    "https://www.amazon.com/gp/aw/d/B001RPIOMI/ref=mp_s_a_1_2?ie=UTF8&qid=1522768847&sr=8-2&pi=AC_SX236_SY340_FMwebp_QL65&keywords=coleman+weathermaster&dpPl=1&dpID=41ZpUyNf66L&ref=plSrch"),
            Item("MAP", "map",
                    "A detailed topo map and a compass are still the primary tools for navigation in the wilderness. A compass helps you orient the map, identify land features and locate your position.\n\nWe recommend Rand McNally. ",
                    "https://www.amazon.com/Folded-Map-United-Rand-McNally/dp/0528881280/ref=zg_bs_11448_13?_encoding=UTF8&psc=1&refRID=S717A30JYVB5B5BR5YD5"),
            Item("ROPE", "rope",
                    "Rope has so many uses at a campsite, especially if you can tie a variety of knots. Don't go camping without some.\n\nWe recommend Aoneky.",
                    "https://www.amazon.com/Aoneky-Static-Outdoor-Climbing-Survival/dp/B01MY95LA8/ref=zg_bs_3402851_2?_encoding=UTF8&refRID=57EG9187D4XCHRTT6EJM&th=1"),
            Item("COMPASS", "compass",
                    "A detailed topo map and a compass are still the primary tools for navigation in the wilderness. A compass helps you orient the map, identify land features and locate your position.\n\nWe recommend Eyeskey.",
                    "https://www.amazon.com/Eyeskey-Multifunctional-Military-Calculator-Backpacking/dp/B077FXPN87/ref=zg_bs_3401501_1?_encoding=UTF8&refRID=J4J87W4JFAXRZMJHVA2D"),
            Item("BACKPACK", "backpack",
                    "From ultralight bags for minimalists and thru-hikers to comfort-oriented options for weekend warriors and extended trips, a backpack is essential for any trip.\n\nWe recommend Teton.",
                    "https://www.amazon.com/TETON-Sports-Scout-Internal-Backpack/dp/B00AE31RJQ/ref=zg_bs_3400491_1?_encoding=UTF8&refRID=CAK09CFHJ84N0JJPNY7Y"),
            Item("BOOTS", "boots",
                    "Hiking boots are critical to your comfort and performance on the trail, but this no longer means a stiff and burly model that will weigh you down.\n\nWe recommend Timberland.",
                    "https://www.amazon.com/Timberland-White-Ledge-Mens-Waterproof/dp/B000VX584E/ref=zg_bs_679280011_2?_encoding=UTF8&refRID=Z86T3Z9XRJVBMP5GZRX3")
    )
    val diving = listOf(
            Item("OXYGEN", "ox",
                    "require yearly visual inspections and a hydrostatic test once every five years (dependent upon where you live).\n\nWe recommend Faber Stealth.",
                    "https://smile.amazon.com/Faber-Stealth-HP117-Steel-Tank/dp/B00KLR9K58/ref=zg_bs_3406981_12?_encoding=UTF8&psc=1&refRID=3NW55RPK4204GKRYZ6AR"),
            Item("FLIPPERS", "ox_flippers",
                    "Diving fins come in such a variety of lengths, styles, and stiffnesses that it is necessary to get the right pair for you.\n\nWe recommend U.S. Divers.",
                    "https://smile.amazon.com/U-S-Divers-Proflex-FX-Fin/dp/B004BJ2S0G/ref=zg_bs_3406751_5?_encoding=UTF8&refRID=YCPNF1ZBGZCB7NQWW732"),
            Item("OXYGEN MASK", "ox_mask",
                    "A high-quality, comfortable scuba diving mask that fits your face well can make the difference between enjoyable dives and a miserable time underwater.\n\nWe recommend Orsen.",
                    "https://smile.amazon.com/ORSEN-180%C2%B0View-Anti-leak-Technology-Equalization/dp/B07B7GXHJ7/ref=sr_1_1_sspa?s=sporting-goods&ie=UTF8&qid=1522801269&sr=1-1-spons&keywords=respirator+diving+mask&psc=1"),
            Item("MASK", "mask",
                    "A high-quality, comfortable scuba diving mask that fits your face well can make the difference between enjoyable dives and a miserable time underwater.\n\nWe recommend Cressi.",
                    "https://smile.amazon.com/Cressi-PANO-Wide-Scuba-Snorkeling/dp/B00ESYM7TG/ref=zg_bs_3406801_7?_encoding=UTF8&refRID=MEQ8R92PDC1K0KBWER3W"),
            Item("REGULATOR", "regulator",
                    "Regulators are an expensive purchase. Modern regulators are very reliable. With proper maintenance, a good set of regulators will last your entire diving career.\n\nWe recommend Mares.",
                    "https://smile.amazon.com/Mares-Scuba-Regulator-Octo-Package/dp/B0731W1PP5/ref=zg_bs_719946011_9?_encoding=UTF8&refRID=FQRD5QG5VZ1EG24TTSBR"),
            Item("KNIFE", "knife",
                    "Many divers want a dive knife, and there are many types of diving knives. . From blunt tip knives and sharp tip knives, to titanium or stainless steel.\n\nWe recommend a Zip diving knife.",
                    "https://smile.amazon.com/Zip-Diving-Knife-Snorkeling-Lightweight/dp/B072YWZP75/ref=zg_bs_3406361_2?_encoding=UTF8&refRID=YG2SC2PS3J62Y7AAVV15")
    )
    val camping = listOf(
            Item("TOOLS", "tools",
                    "No longer do you have to use different tools for different tasks, but instead you can use one tool and just swap out the accessories.\n\nWe recommend the Gerber multitool.",
                    "https://smile.amazon.com/Gerber-22-01471-Suspension-Multi-Plier/dp/B000EDPT9K/ref=zg_bs_553990_3?_encoding=UTF8&psc=1&refRID=QXYEH6SCRCJGDGBMWF2C"),
            Item("TENT", "tent",
                    "Tents are an absolute necessity for camping. They provide shelter and warmth. There are many different types of tents with varying sizes and purposes.\n\nWe recommend the Coleman WeatherMaster Tent.",
                    "https://www.amazon.com/gp/aw/d/B001RPIOMI/ref=mp_s_a_1_2?ie=UTF8&qid=1522768847&sr=8-2&pi=AC_SX236_SY340_FMwebp_QL65&keywords=coleman+weathermaster&dpPl=1&dpID=41ZpUyNf66L&ref=plSrch"),
            Item("MAP", "map",
                    "A detailed topo map and a compass are still the primary tools for navigation in the wilderness. A compass helps you orient the map, identify land features and locate your position.\n\nWe recommend Rand McNally.",
                    "https://www.amazon.com/Folded-Map-United-Rand-McNally/dp/0528881280/ref=zg_bs_11448_13?_encoding=UTF8&psc=1&refRID=S717A30JYVB5B5BR5YD5"),
            Item("LANTERN", "lantern",
                    "Whether you're stumbling to the bathroom after dark or sneaking a midnight snack, you should always have a lantern.\n\nWe recommend Etekcity.",
                    "https://smile.amazon.com/Etekcity-Portable-Camping-Flashlights-Batteries/dp/B00XM8HTIS/ref=zg_bs_3401371_1?_encoding=UTF8&psc=1&refRID=PMYANS0TJNYD34F52DMC"),
            Item("ROPE", "rope",
                    "Rope has so many uses at a campsite, especially if you can tie a variety of knots. Don't go camping without some.\n\nWe recommend Aoneky.",
                    "https://www.amazon.com/Aoneky-Static-Outdoor-Climbing-Survival/dp/B01MY95LA8/ref=zg_bs_3402851_2?_encoding=UTF8&refRID=57EG9187D4XCHRTT6EJM&th=1"),
            Item("GRILL", "grill",
                    "If you would like to cook burgers or grill vegetables, you will need a grill.\n\nWe recommend Coleman.",
                    "https://www.amazon.com/Coleman-9949-750-Road-Trip-Grill/dp/B0009V1BDA/ref=sr_1_3?s=sporting-goods&ie=UTF8&qid=1522773297&sr=1-3&keywords=camping+grill"),
            Item("COMPASS", "compass",
                    "A detailed topo map and a compass are still the primary tools for navigation in the wilderness. A compass helps you orient the map, identify land features and locate your position.\n\nWe recommend Eyeskey.",
                    "https://www.amazon.com/Eyeskey-Multifunctional-Military-Calculator-Backpacking/dp/B077FXPN87/ref=zg_bs_3401501_1?_encoding=UTF8&refRID=J4J87W4JFAXRZMJHVA2D"),
            Item("BACKPACK", "backpack",
                    "From ultralight bags for minimalists and thru-hikers to comfort-oriented options for weekend warriors and extended trips, a backpack is essential for any trip.\n\nWe recommend Teton.",
                    "https://www.amazon.com/TETON-Sports-Scout-Internal-Backpack/dp/B00AE31RJQ/ref=zg_bs_3400491_1?_encoding=UTF8&refRID=CAK09CFHJ84N0JJPNY7Y"),
            Item("BOOTS", "boots",
                    "Hiking boots are critical to your comfort and performance on the trail, but this no longer means a stiff and burly model that will weigh you down.\n\nWe recommend Timberland.",
                    "https://www.amazon.com/Timberland-White-Ledge-Mens-Waterproof/dp/B000VX584E/ref=zg_bs_679280011_2?_encoding=UTF8&refRID=Z86T3Z9XRJVBMP5GZRX3")
    )
    val surfing = listOf(
            Item("SURFBOARD", "surfboard",
                    "The more often you surf the more choices open up in terms of what board you could ride.\n\nWe recommend StormBlade.",
                    "https://smile.amazon.com/10FT-STORM-BLADE-LONGBOARD-SURFBOARD/dp/B0773XB8XV/ref=zg_bs_3418591_10?_encoding=UTF8&psc=1&refRID=5W0TWAK1E46KSCGQMN22")
    )
    val fishing = listOf(
            Item("FISHING ROD", "fishing_rod",
                    "",
                    ""),
            Item("HOOK", "hook",
                    "",
                    ""),
            Item("LURE", "lure",
                    "",
                    ""),
            Item("KNIFE", "knife",
                    "",
                    "")
    )

    fun getItems (category: String) : List<Item> {

        return when (category) {
            "HIKING" -> hiking
            "DIVING" -> diving
            "CAMPING" -> camping
            "SURFING" -> surfing
            else -> fishing
        }
    }
}