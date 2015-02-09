package org.cryptocoinpartners.schema;

import org.cryptocoinpartners.enumeration.FeeMethod;

public class Exchanges {
    /** An imaginary Exchange used for testing */
    public static final Exchange MOCK = Exchange.forSymbolOrCreate("MOCK", 1, 0.002, FeeMethod.PercentagePerUnit);

    /** Our own "Exchange".  Internal Accounts have this as their Exchange */
    public static final Exchange SELF = Exchange.forSymbolOrCreate("SELF", 1, 0.002, FeeMethod.PerUnit);

    public static final Exchange BITFINEX = Exchange.forSymbolOrCreate("BITFINEX", 3, 0.001, FeeMethod.PercentagePerUnit, 0.25, FeeMethod.PercentagePerUnit);
    public static final Exchange BITSTAMP = Exchange.forSymbolOrCreate("BITSTAMP", 1, 0.002, FeeMethod.PercentagePerUnit);
    public static final Exchange BTCCHINA = Exchange.forSymbolOrCreate("BTCCHINA", 1, 0, FeeMethod.PercentagePerUnit);
    public static final Exchange BTCE = Exchange.forSymbolOrCreate("BTCE", 1, 0.002, FeeMethod.PercentagePerUnit);
    public static final Exchange BTER = Exchange.forSymbolOrCreate("BTER", 1, 0.002, FeeMethod.PercentagePerUnit);
    public static final Exchange COINBASE = Exchange.forSymbolOrCreate("COINBASE", 1, 0, FeeMethod.PercentagePerUnit);
    public static final Exchange CRYPTSY = Exchange.forSymbolOrCreate("CRYPTSY", 1, 0.002, FeeMethod.PercentagePerUnit);
    public static final Exchange CAMPBX = Exchange.forSymbolOrCreate("CAMPBX", 2, 0.0025, FeeMethod.PercentagePerUnit, 0.25, FeeMethod.PercentagePerUnit);
    public static final Exchange BITTREX = Exchange.forSymbolOrCreate("BITTREX", 1, 0.002, FeeMethod.PercentagePerUnit);
    public static final Exchange OKCOIN = Exchange.forSymbolOrCreate("OKCOIN", 1, 0.002, FeeMethod.PercentagePerUnit, 0.25, FeeMethod.PercentagePerUnit);
}
