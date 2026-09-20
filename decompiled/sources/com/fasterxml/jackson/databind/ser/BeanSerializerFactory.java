package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }
}
