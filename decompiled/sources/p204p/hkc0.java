package p204p;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class hkc0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public final Map f92416a;

    /* JADX INFO: renamed from: b */
    public final gkc0 f92417b;

    public hkc0(Map map, gkc0 gkc0Var) {
        map.getClass();
        this.f92416a = map;
        this.f92417b = gkc0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f92416a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f92416a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C2403t7(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map map = this.f92416a;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return this.f92417b.mo24366b(obj, obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f92416a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map map = this.f92416a;
        if (map.containsKey(obj)) {
            return this.f92417b.mo24366b(obj, map.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f92416a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C2247p8((AbstractMap) this, 4);
    }
}
