package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.type.LogicalType;

/* JADX INFO: loaded from: classes3.dex */
public class NumberDeserializers$FloatDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Float> {
    static final NumberDeserializers$FloatDeserializer primitiveInstance = new NumberDeserializers$FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
    static final NumberDeserializers$FloatDeserializer wrapperInstance = new NumberDeserializers$FloatDeserializer(Float.class, null);

    public NumberDeserializers$FloatDeserializer(Class<Float> cls, Float f) {
        super(cls, LogicalType.Float, f, Float.valueOf(0.0f));
    }
}
