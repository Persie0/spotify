package com.fasterxml.jackson.databind.ser.std;

/* JADX INFO: loaded from: classes3.dex */
public class ToStringSerializer extends ToStringSerializerBase {
    public static final ToStringSerializer instance = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }

    public ToStringSerializer(Class<?> cls) {
        super(cls);
    }
}
