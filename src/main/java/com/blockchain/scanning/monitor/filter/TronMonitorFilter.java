package com.blockchain.scanning.monitor.filter;

import java.math.BigInteger;

/**
 * Monitor filter
 */
public class TronMonitorFilter {

    /**
     * The from address in the transaction
     */
    private String fromAddress;

    /**
     * The address to receive the transaction
     */
    private String toAddress;

    /**
     * Amount of coins sent
     *
     * If set, filter out >= its
     */
    private BigInteger minValue;

    /**
     * Amount of coins sent
     *
     * If set, filter out <= its
     */
    private BigInteger maxValue;

    /**
     * Set the criteria for filtering by inputData
     */
    private InputDataFilter inputDataFilter;

    public static TronMonitorFilter builder(){
        return new TronMonitorFilter();
    }

    public String getFromAddress() {
        if(fromAddress != null){
            return fromAddress.toLowerCase();
        }
        return null;
    }

    public TronMonitorFilter setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    public String getToAddress() {
        if(toAddress != null){
            return toAddress.toLowerCase();
        }
        return null;
    }

    public TronMonitorFilter setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }

    public BigInteger getMinValue() {
        return minValue;
    }

    public TronMonitorFilter setMinValue(BigInteger minValue) {
        this.minValue = minValue;
        return this;
    }

    public BigInteger getMaxValue() {
        return maxValue;
    }

    public TronMonitorFilter setMaxValue(BigInteger maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    public InputDataFilter getInputDataFilter() {
        return inputDataFilter;
    }

    public TronMonitorFilter setInputDataFilter(InputDataFilter inputDataFilter) {
        this.inputDataFilter = inputDataFilter;
        return this;
    }
}
