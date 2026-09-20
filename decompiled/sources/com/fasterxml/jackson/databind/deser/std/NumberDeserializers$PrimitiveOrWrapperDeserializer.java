package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.type.LogicalType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NumberDeserializers$PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
    protected final T _emptyValue;
    protected final LogicalType _logicalType;
    protected final T _nullValue;
    protected final boolean _primitive;

    public NumberDeserializers$PrimitiveOrWrapperDeserializer(Class<T> cls, LogicalType logicalType, T t, T t2) {
        super(cls);
        this._logicalType = logicalType;
        this._nullValue = t;
        this._emptyValue = t2;
        this._primitive = cls.isPrimitive();
    }
}
