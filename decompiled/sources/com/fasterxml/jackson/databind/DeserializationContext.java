package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeserializationContext extends DatabindContext implements Serializable {
    protected transient ContextAttributes _attributes;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected final DeserializerFactory _factory;
    protected final int _featureFlags;
    protected final Class<?> _view;

    public DeserializationContext(DeserializerFactory deserializerFactory, DeserializerCache deserializerCache) {
        if (deserializerFactory == null) {
            throw new NullPointerException("Cannot pass null DeserializerFactory");
        }
        this._factory = deserializerFactory;
        this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
        this._featureFlags = 0;
        this._config = null;
        this._view = null;
        this._attributes = null;
    }
}
