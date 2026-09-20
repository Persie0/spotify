package com.fasterxml.jackson.databind.deser.std;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class DateDeserializers$DateDeserializer extends DateDeserializers$DateBasedDeserializer<Date> {
    public static final DateDeserializers$DateDeserializer instance = new DateDeserializers$DateDeserializer();

    public DateDeserializers$DateDeserializer() {
        super(Date.class);
    }
}
