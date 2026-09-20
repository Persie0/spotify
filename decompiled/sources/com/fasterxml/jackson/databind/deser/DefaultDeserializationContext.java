package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {

    public static final class Impl extends DefaultDeserializationContext {
        public Impl(DeserializerFactory deserializerFactory) {
            super(deserializerFactory, null);
        }
    }

    public DefaultDeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        super(deserializerFactory, deserializerCache);
    }
}
