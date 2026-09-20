package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements Serializable {
    protected static final PropertyName TEMP_PROPERTY_NAME = new PropertyName("#temporary-name");
}
