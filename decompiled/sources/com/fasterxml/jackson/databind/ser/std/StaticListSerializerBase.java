package com.fasterxml.jackson.databind.ser.std;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> {
    protected final Boolean _unwrapSingle;

    public StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this._unwrapSingle = null;
    }
}
