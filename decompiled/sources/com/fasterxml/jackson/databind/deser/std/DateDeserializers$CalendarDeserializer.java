package com.fasterxml.jackson.databind.deser.std;

import java.lang.reflect.Constructor;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class DateDeserializers$CalendarDeserializer extends DateDeserializers$DateBasedDeserializer<Calendar> {
    protected final Constructor<Calendar> _defaultCtor;

    public DateDeserializers$CalendarDeserializer() {
        super(Calendar.class);
        this._defaultCtor = null;
    }
}
