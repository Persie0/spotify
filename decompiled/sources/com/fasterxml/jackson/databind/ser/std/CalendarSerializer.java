package com.fasterxml.jackson.databind.ser.std;

import java.text.DateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class CalendarSerializer extends DateTimeSerializerBase<Calendar> {
    public static final CalendarSerializer instance = new CalendarSerializer();

    public CalendarSerializer() {
        this(null, null);
    }

    public CalendarSerializer(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }
}
