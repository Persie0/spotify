package com.fasterxml.jackson.databind.deser.std;

import java.text.DateFormat;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DateDeserializers$DateBasedDeserializer<T> extends StdScalarDeserializer<T> {
    protected final DateFormat _customFormat;
    protected final String _formatString;

    public DateDeserializers$DateBasedDeserializer(Class<?> cls) {
        super(cls);
        this._customFormat = null;
        this._formatString = null;
    }
}
