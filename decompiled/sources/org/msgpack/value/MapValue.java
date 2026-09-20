package org.msgpack.value;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public interface MapValue extends Value {
    Set<Map.Entry<Value, Value>> entrySet();

    Value[] getKeyValueArray();

    Set<Value> keySet();

    Map<Value, Value> map();

    int size();

    Collection<Value> values();
}
