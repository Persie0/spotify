package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    private static final Class<?>[] INIT_CAUSE_PARAMS = {Throwable.class};
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }
}
