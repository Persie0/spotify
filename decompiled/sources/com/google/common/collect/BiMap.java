package com.google.common.collect;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface BiMap<K, V> extends Map<K, V> {
    V forcePut(K k, V v);

    BiMap<V, K> inverse();

    @Override // java.util.Map
    V put(K k, V v);

    @Override // java.util.Map
    void putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    Set<V> values();
}
