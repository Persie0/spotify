package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.ser.ContainerSerializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> {
    protected final Boolean _unwrapSingle;

    public ArraySerializerBase(Class<T> cls) {
        super(cls);
        this._unwrapSingle = null;
    }
}
