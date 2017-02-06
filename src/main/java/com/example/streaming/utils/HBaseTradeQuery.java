package com.example.streaming.utils;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Collection;

/**
 * Created by oliverbuckley-salmon on 06/02/2017.
 */
public class HBaseTradeQuery {

    private static final String TABLE_TRADE = "TRADE";
    private static final byte[] CF_TRADE_IDS = Bytes.toBytes("TRADE_IDS");
    private static final byte[] CF_TRADE_TYPES = Bytes.toBytes("TRADE_TYPES");
    private static final byte[] CF_TRADE_DATES = Bytes.toBytes("TRADE_DATES");
    private static final byte[] CF_TRADE_DIMS = Bytes.toBytes("TRADE_DIMS");
    private static final byte[] CF_TRADE_FACTS = Bytes.toBytes("TRADE_FACTS");

    private static final byte[] CQ_TRADE_ID = Bytes.toBytes("id");
    private static final byte[] CQ_TRADE_TRANS_TYPE = Bytes.toBytes("tradeTransType");
    private static final byte[] CQ_TRADE_TYPE = Bytes.toBytes("tradeType");
    private static final byte[] CQ_SEC_TRADE_TYPE = Bytes.toBytes("secTradeType");
    private static final byte[] CQ_ORIG_TRADE_DATE = Bytes.toBytes("origTradeDate");
    private static final byte[] CQ_MARKET  = Bytes.toBytes("marketId");
    private static final byte[] CQ_QUANTITY = Bytes.toBytes("qty");
    private static final byte[] CQ_PRICE = Bytes.toBytes("price");
    private static final byte[] CQ_CURRENCY_PAIR = Bytes.toBytes("currencyPair");
    // Dimension Ids
    private static final byte[]  CQ_INSTRUMENT_ID = Bytes.toBytes("instrumentId");
    private static final byte[]  CQ_EXEC_VENUE_ID = Bytes.toBytes("executionVenueId");
    private static final byte[]  CQ_CP_ID = Bytes.toBytes("counterpartyId");

    private final String hbaseHost = "138.68.147.208";
    private final String zookeeperHost = "138.68.147.208";
    Configuration config;
    Admin admin;
    Table table;

    private Logger logger = Logger.getLogger(HBaseTradeQuery.class);

}
