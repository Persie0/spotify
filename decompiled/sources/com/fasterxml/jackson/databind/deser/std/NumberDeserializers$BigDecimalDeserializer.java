package com.fasterxml.jackson.databind.deser.std;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public class NumberDeserializers$BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
    public static final NumberDeserializers$BigDecimalDeserializer instance = new NumberDeserializers$BigDecimalDeserializer();

    public NumberDeserializers$BigDecimalDeserializer() {
        super(BigDecimal.class);
    }
}
