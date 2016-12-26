package nightgames.global;

import java.util.Arrays;

public enum Flag {
    metBroker,
    basicStores,
    blackMarket,
    meditation,
    girlAdvice,
    CassieKnown,
    CassieDate,
    Cassievg1,
    Cassievg2,
    CassieMaravg,
    CassieLoneliness,
    JewelKnown,
    JewelDate,
    AngelKnown,
    AngelDate,
    MaraKnown,
    MaraDate,
    Maravg1,
    maravg2,
    magicstore,
    metAisha,
    blackMarketPlus,
    metRin,
    dojo,
    metSuzume,
    workshop,
    metJett,
    Eve,
    Kat,
    Reyka,
    Airi,
    rank1,
    darkness,
    fetishism,
    furry,
    dumbmode,
    autosave,
    metLilly,
    noimage,
    noportraits,
    challengeAccepted,
    largefonts,
    CarolineAffection,
    metYui,
    YuiAffection,
    threesome,
    bodyShop,
    hardmode,
    systemMessages,
    malePref,
    masturbationSemen,
    AliceAvailable,
    metAlice,
    victory,
    catspirit,
    Clue1,
    Maya,
    FTC,
    didFTC, 
    AddictionAdvice,
    AiriDisabled,
    extendedLogs, 
    YuiLoyalty, 
    YuiAvailable, 
    Yui,
    YuiWalletReturned,
    YuiUnlocking,
    FemalePronounsOnly,
    skipMM,
    skipFF,
    hermHasBalls,
    shemaleNoBalls,
    femaleTGIntoHerm, 
    SuperTraitMode,
    AutoNext,
    NoFTC
    ;
    
    public static boolean exists(String flag) {
        return Arrays.stream(values()).anyMatch(f -> f.name().equals(flag));
    }
}
