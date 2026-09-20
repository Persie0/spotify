package com.fasterxml.jackson.databind.ser.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertySerializerMap {
    protected final boolean _resetWhenFull;

    public static final class Empty extends PropertySerializerMap {
        public static final Empty FOR_PROPERTIES = new Empty(false);
        public static final Empty FOR_ROOT_VALUES = new Empty(true);

        public Empty(boolean z) {
            super(z);
        }
    }

    public PropertySerializerMap(boolean z) {
        this._resetWhenFull = z;
    }

    public static PropertySerializerMap emptyForProperties() {
        return Empty.FOR_PROPERTIES;
    }
}
