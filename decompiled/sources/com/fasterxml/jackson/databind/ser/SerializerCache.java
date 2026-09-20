package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class SerializerCache {
    private final HashMap<Object, JsonSerializer<Object>> _sharedMap = new HashMap<>(64);
    private final AtomicReference<Object> _readOnlyMap = new AtomicReference<>();
}
