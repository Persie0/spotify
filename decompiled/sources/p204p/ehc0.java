package p204p;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ehc0 implements Map {

    /* JADX INFO: renamed from: a */
    public final fhc0 f59538a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f59539b;

    public ehc0(fhc0 fhc0Var, LinkedHashMap linkedHashMap) {
        this.f59538a = fhc0Var;
        this.f59539b = linkedHashMap;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f59538a.m41656c();
        this.f59539b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f59539b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f59539b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new dhc0(this.f59538a, this.f59539b.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f59539b.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f59539b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f59539b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f59539b.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new dhc0(this.f59538a, this.f59539b.keySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f59538a.m41656c();
        Charset charset = ee50.f58680a;
        obj.getClass();
        obj2.getClass();
        return this.f59539b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f59538a.m41656c();
        for (Object obj : map.keySet()) {
            Charset charset = ee50.f58680a;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f59539b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f59538a.m41656c();
        return this.f59539b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f59539b.size();
    }

    public final String toString() {
        return this.f59539b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return new bhc0(this.f59538a, this.f59539b.values());
    }
}
