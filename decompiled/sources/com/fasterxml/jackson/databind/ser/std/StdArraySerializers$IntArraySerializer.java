package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes3.dex */
public class StdArraySerializers$IntArraySerializer extends ArraySerializerBase<int[]> {
    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);

    public StdArraySerializers$IntArraySerializer() {
        super(int[].class);
    }
}
