package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes3.dex */
public class StdArraySerializers$BooleanArraySerializer extends ArraySerializerBase<boolean[]> {
    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Boolean.class);

    public StdArraySerializers$BooleanArraySerializer() {
        super(boolean[].class);
    }
}
