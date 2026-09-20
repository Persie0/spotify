package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes3.dex */
public class StdArraySerializers$DoubleArraySerializer extends ArraySerializerBase<double[]> {
    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);

    public StdArraySerializers$DoubleArraySerializer() {
        super(double[].class);
    }
}
