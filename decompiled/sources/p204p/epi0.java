package p204p;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class epi0 implements Map, tq60, pq60 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f61653a;

    public epi0(LinkedHashMap linkedHashMap) {
        this.f61653a = linkedHashMap;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f61653a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f61653a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f61653a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f61653a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f61653a.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f61653a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f61653a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f61653a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f61653a.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f61653a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f61653a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f61653a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f61653a.size();
    }

    public final String toString() {
        return this.f61653a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f61653a.values();
    }
}
