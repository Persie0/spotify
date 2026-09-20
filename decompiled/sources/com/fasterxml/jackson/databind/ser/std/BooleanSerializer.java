package com.fasterxml.jackson.databind.ser.std;

/* JADX INFO: loaded from: classes3.dex */
public final class BooleanSerializer extends StdScalarSerializer<Object> {
    protected final boolean _forPrimitive;

    public static final class AsNumber extends StdScalarSerializer<Object> {
    }

    public BooleanSerializer(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class, false);
        this._forPrimitive = z;
    }
}
