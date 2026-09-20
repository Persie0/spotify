package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes3.dex */
public class StdArraySerializers$LongArraySerializer extends StdArraySerializers$TypedPrimitiveArraySerializer<long[]> {
    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);

    public StdArraySerializers$LongArraySerializer() {
        super(long[].class);
    }
}
