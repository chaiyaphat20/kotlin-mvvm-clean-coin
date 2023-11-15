package com.rudy.kotlin_mvvm_clean_coin.dto.CoinListDTO

data class CoinListDTOItem(
    val ath: Double?, // 4878.26
    val ath_change_percentage: Double?, // -48.70899
    val ath_date: String?, // 2021-11-10T14:24:11.849Z
    val atl: Double?, // 67.81
    val atl_change_percentage: Double?, // 52125.75118
    val atl_date: String?, // 2013-07-06T00:00:00.000Z
    val circulating_supply: Double?, // 120256040.31998
    val current_price: Double?, // 1973.94
    val fully_diluted_valuation: Long?, // 743722069114
    val high_24h: Double?, // 1.002
    val id: String?, // bitcoin
    val image: String?, // https://assets.coingecko.com/coins/images/1/large/bitcoin.png?1696501400
    val last_updated: String?, // 2023-11-15T02:27:15.274Z
    val low_24h: Double?, // 1963.47
    val market_cap: Long?, // 692104853460
    val market_cap_change_24h: Double?, // -19407449702.685303
    val market_cap_change_percentage_24h: Double?, // -2.72763
    val market_cap_rank: Int?, // 1
    val max_supply: Double?, // 8958886.14951013
    val name: String?, // Bitcoin
    val price_change_24h: Double?, // -949.212426965838
    val price_change_percentage_24h: Double?, // -2.6076
    val roi: Roi?,
    val symbol: String?, // btc
    val total_supply: Double?, // 120256040.31998
    val total_volume: Double? // 25.03
)