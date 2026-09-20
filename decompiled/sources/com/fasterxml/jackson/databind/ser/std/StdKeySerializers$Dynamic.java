package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;

/* JADX INFO: loaded from: classes3.dex */
public class StdKeySerializers$Dynamic extends StdSerializer<Object> {
    protected transient PropertySerializerMap _dynamicSerializers;

    public StdKeySerializers$Dynamic() {
        super(String.class, false);
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    public Object readResolve() {
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        return this;
    }
}
