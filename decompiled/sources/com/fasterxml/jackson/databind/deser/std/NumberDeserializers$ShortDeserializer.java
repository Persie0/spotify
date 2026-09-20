package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.type.LogicalType;

/* JADX INFO: loaded from: classes3.dex */
public class NumberDeserializers$ShortDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Short> {
    static final NumberDeserializers$ShortDeserializer primitiveInstance = new NumberDeserializers$ShortDeserializer(Short.TYPE, 0);
    static final NumberDeserializers$ShortDeserializer wrapperInstance = new NumberDeserializers$ShortDeserializer(Short.class, null);

    public NumberDeserializers$ShortDeserializer(Class<Short> cls, Short sh) {
        super(cls, LogicalType.Integer, sh, (short) 0);
    }
}
