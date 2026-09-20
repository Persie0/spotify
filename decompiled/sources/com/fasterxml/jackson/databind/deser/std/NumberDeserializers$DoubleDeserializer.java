package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.type.LogicalType;

/* JADX INFO: loaded from: classes3.dex */
public class NumberDeserializers$DoubleDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Double> {
    static final NumberDeserializers$DoubleDeserializer primitiveInstance = new NumberDeserializers$DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
    static final NumberDeserializers$DoubleDeserializer wrapperInstance = new NumberDeserializers$DoubleDeserializer(Double.class, null);

    public NumberDeserializers$DoubleDeserializer(Class<Double> cls, Double d) {
        super(cls, LogicalType.Float, d, Double.valueOf(0.0d));
    }
}
