package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: p.r7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2328r7 implements Map, pq60 {
    /* JADX INFO: renamed from: a */
    public abstract Set mo36657a();

    /* JADX INFO: renamed from: b */
    public abstract Set mo36658b();

    /* JADX INFO: renamed from: c */
    public abstract int mo36659c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setMo36657a = mo36657a();
        if (setMo36657a.isEmpty()) {
            return false;
        }
        Iterator it = setMo36657a.iterator();
        while (it.hasNext()) {
            if (wj50.m88271j(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract Collection mo36660d();

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return mo36657a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (mo36659c() != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (wj50.m88271j(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo36657a().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return mo36659c() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return mo36658b();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return mo36659c();
    }

    public final String toString() {
        return g6f.m43753y0(mo36657a(), ", ", "{", "}", new C2245p6(this, 2), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return mo36660d();
    }
}
