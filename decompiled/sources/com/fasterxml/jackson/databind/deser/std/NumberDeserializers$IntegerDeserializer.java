package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.type.LogicalType;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberDeserializers$IntegerDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Integer> {
    static final NumberDeserializers$IntegerDeserializer primitiveInstance = new NumberDeserializers$IntegerDeserializer(Integer.TYPE, 0);
    static final NumberDeserializers$IntegerDeserializer wrapperInstance = new NumberDeserializers$IntegerDeserializer(Integer.class, null);

    public NumberDeserializers$IntegerDeserializer(Class<Integer> cls, Integer num) {
        super(cls, LogicalType.Integer, num, 0);
    }
}
