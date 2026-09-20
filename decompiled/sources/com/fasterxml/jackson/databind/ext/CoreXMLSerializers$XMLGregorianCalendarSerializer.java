package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import javax.xml.datatype.XMLGregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
public class CoreXMLSerializers$XMLGregorianCalendarSerializer extends StdSerializer<XMLGregorianCalendar> {
    static final CoreXMLSerializers$XMLGregorianCalendarSerializer instance = new CoreXMLSerializers$XMLGregorianCalendarSerializer();
    final JsonSerializer<Object> _delegate;

    public CoreXMLSerializers$XMLGregorianCalendarSerializer() {
        this(CalendarSerializer.instance);
    }

    public CoreXMLSerializers$XMLGregorianCalendarSerializer(JsonSerializer<?> jsonSerializer) {
        super(XMLGregorianCalendar.class);
        this._delegate = jsonSerializer;
    }
}
