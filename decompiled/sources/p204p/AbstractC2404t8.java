package p204p;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: p.t8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2404t8 extends AbstractMap implements Map, tq60 {
    /* JADX INFO: renamed from: a */
    public abstract Set mo48297a();

    /* JADX INFO: renamed from: b */
    public /* bridge */ Set<Object> mo48298b() {
        return super.keySet();
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ int mo48299c() {
        return super.size();
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ Collection<Object> mo48300d() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return mo48297a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return mo48298b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return mo48299c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return mo48300d();
    }
}
