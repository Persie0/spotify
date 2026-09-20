package p204p;

import com.google.common.collect.ForwardingMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j400 extends ForwardingMap implements ConcurrentMap {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        return ((gic0) this).f80129e.putIfAbsent(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        return ((gic0) this).f80129e.remove(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        return ((gic0) this).f80129e.replace(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return ((gic0) this).f80129e.replace(obj, obj2, obj3);
    }
}
