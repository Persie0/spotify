package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.type.LogicalType;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberDeserializers$LongDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Long> {
    static final NumberDeserializers$LongDeserializer primitiveInstance = new NumberDeserializers$LongDeserializer(Long.TYPE, 0L);
    static final NumberDeserializers$LongDeserializer wrapperInstance = new NumberDeserializers$LongDeserializer(Long.class, null);

    public NumberDeserializers$LongDeserializer(Class<Long> cls, Long l) {
        super(cls, LogicalType.Integer, l, 0L);
    }
}
