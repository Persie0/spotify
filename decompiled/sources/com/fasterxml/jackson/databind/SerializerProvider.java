package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SerializerProvider extends DatabindContext {
    public static final JsonSerializer<Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final JsonSerializer<Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    protected JsonSerializer<Object> _unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
    protected JsonSerializer<Object> _nullValueSerializer = NullSerializer.instance;
    protected JsonSerializer<Object> _nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
    protected final SerializationConfig _config = null;
    protected final SerializerFactory _serializerFactory = null;
    protected final SerializerCache _serializerCache = new SerializerCache();
    protected final Class<?> _serializationView = null;
    protected transient ContextAttributes _attributes = null;
    protected final boolean _stdNullValueSerializer = true;
}
