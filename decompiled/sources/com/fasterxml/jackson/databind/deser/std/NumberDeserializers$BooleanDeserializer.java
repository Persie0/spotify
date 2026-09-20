package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.type.LogicalType;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberDeserializers$BooleanDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Boolean> {
    static final NumberDeserializers$BooleanDeserializer primitiveInstance = new NumberDeserializers$BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
    static final NumberDeserializers$BooleanDeserializer wrapperInstance = new NumberDeserializers$BooleanDeserializer(Boolean.class, null);

    public NumberDeserializers$BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
        super(cls, LogicalType.Boolean, bool, Boolean.FALSE);
    }
}
