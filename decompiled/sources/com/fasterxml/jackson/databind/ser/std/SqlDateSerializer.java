package com.fasterxml.jackson.databind.ser.std;

import java.sql.Date;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes3.dex */
public class SqlDateSerializer extends DateTimeSerializerBase<Date> {
    public SqlDateSerializer() {
        this(null, null);
    }

    public SqlDateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }
}
