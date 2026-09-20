package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    public ContainerSerializer(Class<T> cls) {
        super(cls);
    }
}
