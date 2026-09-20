package com.fasterxml.jackson.databind.ser.std;

/* JADX INFO: loaded from: classes3.dex */
public class NullSerializer extends StdSerializer<Object> {
    public static final NullSerializer instance = new NullSerializer();

    private NullSerializer() {
        super(Object.class);
    }
}
