package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;

/* JADX INFO: loaded from: classes3.dex */
public class BeanSerializer extends BeanSerializerBase {
    public String toString() {
        return "BeanSerializer for ".concat(handledType().getName());
    }
}
