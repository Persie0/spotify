package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    public String toString() {
        return "UnwrappingBeanSerializer for ".concat(handledType().getName());
    }
}
