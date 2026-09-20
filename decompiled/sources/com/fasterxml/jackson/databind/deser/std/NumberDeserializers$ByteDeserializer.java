package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.type.LogicalType;

/* JADX INFO: loaded from: classes3.dex */
public class NumberDeserializers$ByteDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Byte> {
    static final NumberDeserializers$ByteDeserializer primitiveInstance = new NumberDeserializers$ByteDeserializer(Byte.TYPE, (byte) 0);
    static final NumberDeserializers$ByteDeserializer wrapperInstance = new NumberDeserializers$ByteDeserializer(Byte.class, null);

    public NumberDeserializers$ByteDeserializer(Class<Byte> cls, Byte b) {
        super(cls, LogicalType.Integer, b, (byte) 0);
    }
}
